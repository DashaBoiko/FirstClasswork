import java.util.Scanner;

public class Exercise6 {
    public static void Calculator(int number, int difference1, int numberElements) {
        int count = 0;

        for(int i = 0; i < numberElements; ++i) {
            System.out.print(number + count + ",");
            number += difference1;
            ++count;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int number = scanner.nextInt();
        System.out.println("Write the difference");
        int difference1 = scanner.nextInt();
        System.out.println("Write the number of elements");
        int numberElements = scanner.nextInt();
        Calculator(number, difference1, numberElements);
    }
}
