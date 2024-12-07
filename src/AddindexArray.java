import java.util.Scanner;

public class AddindexArray {
    public static void main(String[] args) {
        int[] array = {2, 8, 3, 5, 15, 3, 9, 12};
        int input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter add number :");
        input = sc.nextInt();

        int findIndex = findIndexArray(array,input);

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
