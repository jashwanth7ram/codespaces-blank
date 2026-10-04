import java.util.*;
public class extend{
    public static int gcd(int a,int b,int[] xy)
    {
        if(b==0)
        {
            xy[0]=1;
            xy[1]=0;
            return a;
        }

        int[] temp = new int[2];
        int gcd = gcd(b,a%b,temp);

        xy[0] = temp[1];
        xy[1] = temp[0]-(a/b)*temp[1];
        return gcd;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
    }
}