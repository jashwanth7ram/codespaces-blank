import java.util.*;
public class euclid{
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        else{
          return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        int[] num = new int[5];
        System.out.println(num.length);
        System.out.println(num[2]);
        System.out.println(number.size());
        for(int i =0;i<5;i++)
        {
            number.add(i);
        }
        System.out.println("The number is:"+number);
        System.out.println("The gcd of 48 and 12 is:"+gcd(48,12));
    }
}