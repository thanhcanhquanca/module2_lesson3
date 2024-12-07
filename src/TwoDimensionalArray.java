import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhap vao dong cua ma tran :");
        int rows = sc.nextInt();
        System.out.println("Nhap vao cot cua ma tran :");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("nhap cac phan tu cua ma tran :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Phan tu tai [" + i +"][" + j +"]");
                matrix[i][j] = sc.nextInt();
            }

        }

        int max = matrix[0][0];
        int maxrows = 0;
        int maxcols = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    maxrows = i;
                    maxcols = j;
                }
            }

        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Tọa độ: hàng " + maxrows + ", cột " + maxcols);

    }
}
