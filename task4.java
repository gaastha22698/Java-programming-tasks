import java.util.*;
class task4
{
    void main ()
    {
    Scanner a = new Scanner (System.in);
    int p;
        
        System.out.println ("enter the value in inches"); 
      p = a.nextInt();
      int mtrs;
      mtrs = p/39;
      System.out.println ("the value in meters is" + mtrs);
    }
}