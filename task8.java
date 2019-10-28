import java.util.*;
class task8
{
    void main()
    {
        Scanner a = new Scanner (System.in);
        System.out.println ("enter the string:");
        String str1 = a.nextLine();
        int count = 0;
        for (int i=0; i<str1.length(); i++)
        {
            if (str1.charAt(i)== 'a' || str1.charAt(i)== 'e' ||
            str1.charAt(i)== 'i' || str1.charAt(i)== 'o' || 
            str1.charAt(i)== 'u')
            {
                count++;
            }
        }
        System.out.println ("no of vowels are:" + count);
    }
}
        