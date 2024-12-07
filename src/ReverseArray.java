import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size ;
        int[] array ;

        Scanner sc = new Scanner(System.in);
// dieu kien nhap vao mang
        do {
            System.out.println("Enter so luong array");
            size = sc.nextInt();

            if (size > 20){
                System.out.println("Gioi han nhap vao 20 :");
            }
        }while (size > 20);

        // them loai 20 so
        array = new int[size];
        int i = 0;

        while (i < size){
            System.out.println("Enter number " + (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }

        // in ra
        System.out.println("Array in  : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // doi cho

        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;

        }

        System.out.println("Reversed array:");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }
}
