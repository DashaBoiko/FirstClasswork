import java.util.Scanner;

class Exercise1 {
    public static void main(String[] args) {
        int negativ = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int number = scanner.nextInt();
        if (number>=0){
            System.out.println("The absolute value is:" + number);}
        else {
            number = (number * negativ);
            System.out.println("The absolute value is:" + number);
        }
    }
}
