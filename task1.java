import java.util.*;
class task1
{
    void main()
    {
        Scanner a = new Scanner (System.in);
        double p;
        double area, perimeter;
        p = a.nextInt();
        area= 3.14*p*p;
        perimeter = 2*3.14*p;
        System.out.println ("the area of the circle is " + area);
        System.out.println ("the perimeter of the circle is " + perimeter);
    }
}