import java.util.*;
class task3
{
    void main ()
    {
    Scanner a = new Scanner (System.in);
    int p;
        int b, sum=0;
        System.out.println ("enter the integer"); 
      p = a.nextInt();
        while (p>0)
        {
        b = p%10;
        sum= sum + b;
        p=p/10;
    }
    System.out.println("the sum of digits is " + sum);
    }
}
