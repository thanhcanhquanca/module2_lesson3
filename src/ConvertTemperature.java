import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice = -1;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit :");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius " + fahrenheiToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius :");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to fahrenheit" + celsiusToFahrenheit(celsius));

                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);


    }
    public static double fahrenheiToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * ( fahrenheit - 32 );
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = ( 9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
