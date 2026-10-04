import java.util.*;
public class leaders{
    public static void main(String[] args){
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int lead_element = arr[arr.length-1];
        list.add(lead_element);
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]>lead_element){
                list.add(arr[i]);
                lead_element = arr[i];
            }
        }
        Collections.reverse(list);
        System.out.print(list);
    }
}