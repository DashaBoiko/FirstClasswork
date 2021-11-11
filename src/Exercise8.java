import java.util.Scanner;
public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter a number between 5 and 20:");
            number = scanner.nextInt();
            if (number < 5 || number > 20) {
                System.out.println("You entered incorrect number. Please retry.");
            }
        } while(number < 5 || number > 20);

        for(int i = 1; i <= number; ++i) {
            for(int d = 1; d <= i; ++d) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
