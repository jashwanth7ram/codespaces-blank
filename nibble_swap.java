public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt()
        int low = number & 15;
        int high = number >> 4;
        int num = (low<<4) | (high)
    }
}