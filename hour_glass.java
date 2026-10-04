import java.util.*;
public class hour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<=rows-3;i++){
            for(int j=0;j<=cols-3;j++){
                int curr_sum = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                max_sum = Math.max(max_sum,curr_sum);
            }
            System.out.println("the sum is: "+max_sum);
        }
    }
}