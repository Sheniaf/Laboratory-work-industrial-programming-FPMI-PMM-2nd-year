import java.util.Scanner;

public class Variant4 {
    static class Matrix{
        int [][] matrix;
        int n, m;

        Matrix(int temp_n, int temp_m){
            matrix = new int[temp_n][temp_m];
            n = temp_n;
            m = temp_m;
            for(int i = 0; i < temp_n; i++){
                for(int j = 0; j < temp_m; j++){
                    matrix[i][j] = (int) (Math.random() * 2147483647) -1073741823;
                    matrix[i][j] = matrix[i][j] * 2 + 1;
                }
            }
        }

        void print(){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        int decision(){
            int sum = 0, index = 0, max_sum = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    sum += Math.abs(matrix[i][j]);
                }
                if(sum > max_sum){
                    max_sum = sum;
                    index = i;
                }
                sum = 0;
            }
            return index;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int m = scan.nextInt();
        Matrix object = new Matrix(n,m);
        object.print();
        System.out.print("The line number with the maximum modulo sum: " + object.decision());
    }
}