import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number");
        int a = scanner.nextInt();
        System.out.println("Write the second number");
        int b = scanner.nextInt();
        System.out.println("Write the third number");
        int c = scanner.nextInt();

        int theBiggest = Math.max(a,b);
        theBiggest = Math.max(theBiggest,c);
        int theSmallest = Math.min(a,b);
        theSmallest = Math.min(theSmallest,c);
        int sum = a+b+c;
        int sumNumbers = theBiggest + theSmallest;
        int middleNum = sum - sumNumbers;
        System.out.println("The ascending order is mini :" +theSmallest + "middle : "+ middleNum + "max : "+ theBiggest);
    }


}