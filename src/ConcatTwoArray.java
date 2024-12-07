import java.util.Scanner;

public class ConcatTwoArray {
    public static void main(String[] args) {
        int[] arr_a;
        int[] arr_b;
        int[] arr_c;

        int input;
        int input2;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Gioi han enter array 1 :");
            input = sc.nextInt();

            System.out.println("Gioi han enter array 2");
            input2 = sc.nextInt();

            if (input > 5){
                System.out.println("nhap gioi han 5");
            }

        }while (input > 5);

        arr_a = new int[input];
        arr_b = new int[input2];


        for (int i = 0; i < arr_a.length; i++) {
            System.out.println("Nhập phần tử arr_a[" + i + "]:");
            arr_a[i] = sc.nextInt();
        }

        // Nhập giá trị cho mảng arr_b
        for (int i = 0; i < arr_b.length; i++) {
            System.out.println("Nhập phần tử arr_b[" + i + "]:");
            arr_b[i] = sc.nextInt();
        }


        arr_c = new int[arr_a.length + arr_b.length];

        int count = 0;

        for (int i = 0; i < arr_a.length; i++) {
            arr_c[count++] = arr_a[i];
        }

        for (int i = 0; i < arr_b.length; i++) {
            arr_c[count++] = arr_b[i];
        }

        System.out.println("hien thi concat arr_c :");
        for(int value : arr_c){
            System.out.print(value + " ");
        }







    }
}
