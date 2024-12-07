import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Bước 1: Khai báo một chuỗi và gán giá trị
        String str = "openAI is amazing, AI is the future!";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần đếm:");
        char inputChar = scanner.next().charAt(0);


        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar) {
                count++;
            }
        }

        System.out.println("Ký tự '" + inputChar + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
