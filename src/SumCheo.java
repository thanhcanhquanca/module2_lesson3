import java.util.Scanner;

public class SumCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập kích thước ma trận vuông
        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = sc.nextInt();

        // Khởi tạo ma trận vuông
        double[][] matrix = new double[n][n];

        // Nhập các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Hiển thị ma trận
        System.out.println("Ma trận vuông đã nhập:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính: " + sum);
    }
}
