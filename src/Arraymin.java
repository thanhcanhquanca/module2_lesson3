import java.util.Scanner;

public class Arraymin {
    public static void main(String[] args) {
        int[] arr =  new int[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        arr = new int[n];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        int min = arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("gia tri nho nhat " + min);
        
        
    }
}
