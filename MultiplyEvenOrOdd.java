import java.util.*;
public class MultiplyEvenOrOdd
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n=n*m;
        if(n%2==0)
        System.out.println("even");
        else 
        {
        System.out.println("odd");
        }
      }
}
