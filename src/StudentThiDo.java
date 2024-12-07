import java.util.Scanner;

public class StudentThiDo {
    public static void main(String[] args) {
        int[] arr;
        int input;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap gioi han mang sinh vien :");
            input = sc.nextInt();

            if (input > 30) {
                System.out.println("Gioi han mang 30");
            }

        }while (input > 30);

        arr = new int[input];
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("phan tu array " + i + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10){
                count++;
            }
        }

        System.out.print("\n The number of students passing the exam is " + count);

    }
}
