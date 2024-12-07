import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name's student :");
        String input_name = scanner.nextLine();

        boolean isExits = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("Vị trí cua hoc sinh là" + input_name + "is" + i);
                isExits = true;
                break;
            }
        }

        if (!isExits){
            System.out.println("Not found" + input_name + " in the list.");
        }


    }
}
