import java.util.*;
class task7
{
    void main ()
    {
        int m,n;
        Scanner a = new Scanner (System.in);
        System.out.println ("enter the no. of rows and columns");
        m = a.nextInt();
        n = a.nextInt();
        int first[][] = new int [m][n];
        int second[][] = new int [m][n];
        int sum [][] = new int [m][n];
        
        System.out.println ("enter the elements of first matrix");
        for( int c=0; c<m; c++)
        {
            for (int d=0; d<n; d++)
            {
                first [c][d] = a.nextInt();
            }}
            
            System.out.println ("enter the elements of second matrix");
            for( int c=0; c<m; c++)
        {
            for (int d=0; d<n; d++)
            {
                second [c][d] = a.nextInt();
            }}
            
            //calculating the sum of the two matrixes
            for( int c=0; c<m; c++)
        {
            for (int d=0; d<n; d++)
            {
                sum [c][d] = first[c][d] + second [c][d];
            }}
            
            System.out.println ("the sum of matrix is:");
            for( int c=0; c<m; c++)
        {
            for (int d=0; d<n; d++)
            {
                System.out.println (sum [c][d] +"\t");
            }
        }
                System.out.println();
            
        }
    }