import java.util.*;
class task9
{
    void main()
    {
        int p1,p2,p3;
        System.out.println ("enter three numbers");
        Scanner a = new Scanner (System.in);
        p1 = a.nextInt();
        Scanner b = new Scanner (System.in);
        p2 = b.nextInt();
        Scanner c = new Scanner (System.in);
        p3 = c.nextInt();
        
        if ((p1<p2)&&(p1<p3))
        {
            System.out.println("p1 is the smallest number");
        }
        else if ((p2<p1)&&(p2<p3))
        {
            System.out.println("p2 is the smallest number");
        }
        else
        {
            System.out.println("p3 is the smallest number");
        }
    }
}
        
       
       