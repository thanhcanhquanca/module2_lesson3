import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,4,5,7,75,4};
//        int[][] arry = {
//                {1,2,3},
//                {3,4,5},
//                {6,7,9}
//        };
//
//        String[] name = new String[0]; // mang chuoi rong
//        String[] name1 ={"alice","bod","Na"};
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//
//        List<Integer> arrlist = new ArrayList<>();
//        arrlist.add(1);
//        arrlist.add(2);
//        arrlist.add(3);
//        Integer[] arr2 = arrlist.toArray(new Integer[0]); // chuyen list thanh mang.
//
//
//        int[] ar = new int[5];
//        Arrays.fill(ar,10); // tat ca phan tu la 10
//

//        int[][] matrix = new int[10][10];
          int[][] matrix = {
                  {1,2,3},
                  {3,4,5},
                  {6,7,9}
          };

//
//        int total = 0;
//        for (int row = 0; row <matrix.length ; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                total += matrix[row][column];
//            }
//        }
//
//        int la = 0;
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                 la = matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
//        System.out.println(total);
//        System.out.println(la);

//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                System.out.print(matrix[row][column] + "");
//            }
//            System.out.println();
//        }
//
//

        // nhap lieu cac gia tri vao mang
java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + "rows and" + matrix[0].length + "columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }

        }
    }
}