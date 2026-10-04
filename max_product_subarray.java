import java.util.*;
public class max_product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max_pro = arr[0];
        int min_pro = arr[0];
        int answer = arr[0];
        for(int i=1;i<size;i++)
        {
            int current = arr[i];
            max_pro = Math.max(current,Math.max(current*max_pro,current*min_pro));
            min_pro = Math.min(current,Math.min(current*max_pro,current*min_pro));
            answer = Math.max(answer,max_pro);
        }
        System.out.println("the max number is: "+answer);
    }
}