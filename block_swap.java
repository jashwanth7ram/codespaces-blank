import java.util.*;
public class block_Swap{
    public static int[] reverse(int[] list,int left,int right)
    {
        while(left<=right)
        {
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_length = sc.nextInt();
        int[] num = new int[num_length];
        for(int i =0;i<num_length;i++){
            num[i]= sc.nextInt();            
        }
        System.out.println("Enter posistion");
        int k = sc.nextInt();
        int[] x =  reverse(num,0,num_length-1);
        int[] y = reverse(x,0,k-1);
        int[] z  = reverse(y,k,num_length-1);
        for(int i=0;i<num_length;i++)
        {
            System.out.print(z[i]+" ");
        } 
        System.out.println();
        for(int i=0;i<num_length;i++)
        {
            System.out.print(x[i]+" ");
        } 
    }
}