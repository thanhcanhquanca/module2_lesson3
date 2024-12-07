import java.util.Scanner;

public class SumCols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap dong ma tran :");
        int rows = sc.nextInt();
        System.out.println("nhap cot ma tran :");
        int cols = sc.nextInt();

        int[][] maxtrix = new int[rows][cols];

        System.out.println("nhap cac phan tu ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("phan tu :["+ i +"]["+ j +"]");
                maxtrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("hien thi ma tran :");
        for (int i = 0; i < maxtrix.length; i++) {
            for (int j = 0; j < maxtrix[i].length; j++) {
                System.out.print(maxtrix[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(" nhap so thu tu cot muon tinh tong :");
            int colIndex = sc.nextInt();

            if (colIndex < 0 || colIndex >= cols){
                System.out.println("cot khong hop le");
            }else {
                int sum = 0;
                for (int i = 0; i < rows; i++) {
                    sum += maxtrix[i][colIndex];
                }
                System.out.println("Tổng các phần tử của cột " + colIndex + " là: " + sum);
            }

    }
}
