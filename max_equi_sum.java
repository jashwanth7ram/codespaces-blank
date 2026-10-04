public class max_equi{
    public static void main(String[] args){
        int[] arr = {1,3,5,2,2};
        int index = -1;
        int left_sum = 0 ;
        int total_sum = 0 ;
        int diff = Integer.MAX_VALUE;
        for (int i : arr){
            total_sum+=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            int right_sum = total_sum-left_sum-arr[i];
            if(Math.abs(left_sum-right_sum)<diff){
                diff = Math.abs(left_sum-right_sum);
                index = i;
            }
            left_sum+=arr[i];
        }
        System.out.println(arr[index]);
}
}