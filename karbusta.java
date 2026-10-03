public class kar{
    public static long multiply(long x,long y){

        if(x<10 || y<10 ){
            return x*y;
        }
        int n = Math.max(String.valueOf(x).length(),String.valueOf(y).length());
        int m = n/2;
        long power = (long) Math.pow(10,m);
        long a = x / power;
        long b = x % power;
        long c = y / power;
        long d = y % power;
        long ac = multiply(a,c);
        long bd = multiply(b,d);
        long abcd = multiply(a+b,c+d);
        long middle = abcd-ac-bd;
        return ac*power*power+middle*power+bd;
    }

    public static void main(String[] args){
        long result = multiply(2000,100);
        System.out.println(result);
        System.out.println(3/2);
    }
}