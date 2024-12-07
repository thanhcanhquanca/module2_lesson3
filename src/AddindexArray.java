import java.util.Scanner;

public class AddindexArray {
    public static void main(String[] args) {
        int[] array = {2, 8, 3, 5, 15, 3, 9, 12};
        int input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter add number :");
        input = sc.nextInt();

        int findIndex = findIndexArray(array,input);

        if (findIndex == -1){
            System.out.println("khong tim thay so " + input);
        }else {
            array = addIndexArray(array,findIndex,input);
            System.out.println("hien thi array da them :");
            for (int value : array){
                System.out.print(value + " ");
            }
        }

    }

    private static int[] addIndexArray(int[] array, int findIndex, int input) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i <= findIndex; i++) {
            newArray[i] = array[i];
        }

        newArray[findIndex + 1] = input;

        return newArray;
    }


    private static int findIndexArray(int[] array, int input) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input){
                return i;
            }
        }
        return -1;
    }
}
