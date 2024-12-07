public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};

        int index = findMin(arr);
        System.out.println("Gia tri nho nhat " + index);

    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];

            }
        }
        return min;
    }

}
