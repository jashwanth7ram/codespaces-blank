import java.util.*;
public class palindrome{
    public static String palindrome(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int odd =0;
        char middle;
        for (int i =0;i<26;i++)
        {
            if (freq[i]%2!=0)
            {
                odd++;
                middle = (char)('a'+i);
            }
        }
         if (odd > 1) {
            return "Not possible";
        }
        StringBuilder left = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<freq[i]/2;j++)
            {
                left.append((char)('a'+i));
            }
        }
        String right = new StringBuilder(left).reverse().toString();
        return left.toString()+(odd==1 ? middle :"") + right;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println(palindrome("aabbc"));
    }
}