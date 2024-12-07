import java.util.Scanner;

public class FindNumberMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter size of array:");
            size = sc.nextInt();

            if (size > 20){
                System.out.println("Gioi han cua mang laf 20:");
            }

        }while (size > 20);

        array = new int[size];
        int i = 0;

        while (i < array.length){
            System.out.println("Enter number :" + (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }

        int max = findMax(array);
        System.out.println("Gia tri lon nhat " + max);

//        int max = array[0];
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] > max);
//            max = array[j];
//        }
//
//        System.out.println("Gia tri lon nhat :" + max);

    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];

            }
        }
        return max;
    }
}
