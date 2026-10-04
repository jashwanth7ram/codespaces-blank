import java.util.*;
public class majority{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int element = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(count==0){
                element = arr[i];
                count=1;
            }
            else if(arr[i]==element){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        System.out.println(element);
    }
}