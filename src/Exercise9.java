import java.util.Scanner;

public class Exercise9 {
    static boolean divisionOfTwoNumbers(int x, int y)
    {
        if(x%y==0)return true;
        else return false;
    }
    static boolean numberSimpleOrNot(int x)
    {
        if(x==1)
            return false;
        for(int i=2;i<x;i++)
        {
            if(divisionOfTwoNumbers(x,i))
                return false;
        }
        return true;
    }
    static int userNumber()
    {
        int x;
        Scanner scn = new Scanner(System.in);

        do
        {
            x = scn.nextInt();
        }
        while(x<1);
        scn.close();
        return x;
    }
    public static void main(String[] args) {
        int i,x;
        System.out.println("Enter a positive number x:");
        x = userNumber();
        System.out.println();
        for(i=1;i<=x;i++)
            if(numberSimpleOrNot(i))
                System.out.print(i + " ");
    }

}
