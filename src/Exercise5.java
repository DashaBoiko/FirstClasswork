import java.util.Scanner;

class Exercise5 {
    public static double Money (int worker , int hour , int dailyGoals) {
        int workerType0 = 50;
        int workerType1 = 200;
        double salary;
        int dailyGoals1 = 250;

        if (worker == 0) {
            salary = (hour * workerType0) + (dailyGoals * dailyGoals1);
        } else {
            salary = (hour * workerType1) + (dailyGoals * dailyGoals1);
        }
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int worker , hour , dailyGoals ;
        int continueProgram = 1;
        while (continueProgram == 1) {
            do {
                System.out.println("Write the type of worker : 0 - junior 1 - senior");
                worker = scanner.nextInt();
            }
            while (worker > 1 || worker < 0 );
            System.out.println("Write the number of hours you worked:");
            hour = scanner.nextInt();
            System.out.println("Write a number of days you succeed in daily goals");
            dailyGoals = scanner.nextInt();
            System.out.println("Your salary is : " + Money(worker, hour , dailyGoals));
            System.out.println("If you want to continue with next worker press 1.To stop press 0");
            continueProgram = scanner.nextInt();

        }
    }
}


