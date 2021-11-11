import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int x = rnd.nextInt(1000)+1;
        int i=0,y;
        //System.out.println("x = " + x);
        Scanner scn = new Scanner(System.in);

        while(true)
        {
            i++;
            if(i%2==0)
                System.out.println("Second user write the number");
            else
                System.out.println("First user write the number");
            y = scn.nextInt();

            if(x<y)
                System.out.println("The given number is less than " + y);
            else if(x>y)
                System.out.println("The given number is greater than " + y);
            else
            {
                if(i%2==0)
                    System.out.println("Second user won! He had "+ i+ " attempts.");
                else
                    System.out.println("First user won! He had "+ i+ " attempts.");
                break;
            }
        }

        scn.close();

    }

}
