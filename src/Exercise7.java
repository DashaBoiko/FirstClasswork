import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int day, hour_beg, hour_end;
        System.out.println("What day do you want to come to us (1 - Sunday, 7 - Saturday)?");
        day = scn.nextInt();


        if (day < 1 || day > 7) {
            System.out.println("Day №" + day + "does not exist");
            scn.close();
            return;
        }

        if (day == 6 || day == 7) {
            System.out.println("Offices are closed on weekends!");
            scn.close();
            return;
        }


        System.out.println("What is the earliest time you want to come to us (0 - 23)? ");
        hour_beg = scn.nextInt();

        //Проверка на несуществующее время начала
        if (hour_beg < 0 || hour_beg > 23) {
            System.out.println("The earliest time  cannot be " + hour_beg);
            scn.close();
            return;
        }

        System.out.println("What is the latest time you want to come to us (0 - 23)?");
        hour_end = scn.nextInt();


        if (hour_end < 0 || hour_end > 23) {
            System.out.println("ПокаThe latest time can't be " + hour_end);
            scn.close();
            return;
        }

        //Проверка на диапазон времени
        if (hour_end <= hour_beg) {
            System.out.println("The latest time must be greater than the earliest one");
            scn.close();
            return;
        }

        //Проверка на воскресенье, понедельник, среду и четверг
        if ((day == 1 || day == 2 || day == 4 || day == 5) &&
                !(hour_beg < 17 && hour_end > 9))
            System.out.println("Tax office schedule on Sunday, Monday, Wednesday and Thursday from 9.00-17.00");
            //Проверка на вторник
        else if ((day == 3) && !(hour_beg < 12 && hour_end > 8))
            System.out.println("Tax office schedule on Tuesday from 8.00-12.00");
        else
            System.out.println("You have taken the line. Pay your taxes!");


        scn.close();
    }
}