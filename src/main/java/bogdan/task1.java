package bogdan;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();// вершины

        int[][] matrix = new int[n][n];
        for (int i = 0;i < n;i ++){
            for(int j = 0;j < n;j ++){
                matrix[i][j]= scanner.nextInt();
            }
        }

        for(int i = 0;i < n;i ++){
            for(int j = i + 1;j < n;j ++){
                if(matrix[i][j] == 1){
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

    }
}
