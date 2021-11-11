import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Write the second number");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        if (sum % 2 == 0) {
            System.out.println("The number is Even:" + sum);
        } else {
            System.out.println("The number is Odd:" + sum);
        }
    }
}