import java.util.Scanner;

public class TwoDimentionalArray {

    public static void main(String[] args) {

        int matrix [][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        Scanner scanner = new Scanner(System.in);


        for(int i = 0 ; i < n ; i++){
            for(int j = 0  ;j< m ; j++ ){

               matrix[i][j] = scanner.nextInt();

            }
        }


        for(int i =0;i<n;i++){
            for(int j=0;i<m;j++){
             System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }

}
