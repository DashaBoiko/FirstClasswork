import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a first number");
        double a = scanner.nextDouble();
        System.out.println("Write a second number");
        double b = scanner.nextDouble();
        System.out.println("Write a third number");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("The equation has two roots : x1= " + x1 + ", x2=" + x2);}
        else  if (d==0) {
            double x;
            x=-b/(2*a);
            System.out.println("The equation has one root: x = " + x);}
        else {
            System.out.println("The equation has no roots");
        }



    }
}