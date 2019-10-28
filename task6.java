import java.util.Scanner;
class task6
{
    void main ()
    {
        Scanner a = new Scanner (System.in);
        int play;
        System.out.println ("enter the digit");
        play = a.nextInt();
        if (play == 0)
        {
            System.out.println ("the digit entered is zero");
        }
        else if (play <= 0)
        {
            System.out.println ("the number entered is negative");
        }
        else
        {
            System.out.println ("the number entered is positive");
        }
    }
}