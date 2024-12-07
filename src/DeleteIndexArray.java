import java.util.Scanner;

public class DeleteIndexArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 6, 6, 3, 34, 35};
        int input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        input = sc.nextInt();

        int findIndex = findIndexArr(array,input);

        if (findIndex == -1){
            System.out.println("khong tim thay so nay trong mang " + input);
        }else {
            array = deleteIndexArray(array,findIndex);
            System.out.println("Mang da xoa phan tu");
            for (int value : array) {
                System.out.print(value + " ");
            }
        }


    }

    private static int[] deleteIndexArray(int[] array, int findIndex) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != findIndex){
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    private static int findIndexArr(int[] array, int input) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input){
                return i;
            }
        }
        return -1;
    }


}
