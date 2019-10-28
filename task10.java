import java.util.Scanner;
class task10
{
    void main()
    {
        Scanner a = new Scanner (System.in);
        int p1;
        System.out.println("enter the integer");
        p1 = a.nextInt();
        int c;
        for(int i=1; i<=p1; i++)
        {
            c = i*i*i;
            System.out.println ("the cube of number "+ i+ " is "+ c);
        }
    }
}