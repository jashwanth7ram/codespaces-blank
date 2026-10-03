import java.util.*;
public class Flip{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int left=0;
        int zeros = 0; 
        int max_count = 0;
        for(int i =0;i<num.length();i++)
        {
            if (num.charAt(i)=='0'){
                zeros++;
            }
            while(zeros>1)
            {
                if(num.charAt(left)=='0')
                {
                    zeros--;
                }
                left++;
            }
            max_count = Math.max(max_count,i-left+1);
        }
        System.out.println("Max count is: "+max_count);
       
    }
    }