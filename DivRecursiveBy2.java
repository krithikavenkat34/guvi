import java.util.*;
public class DivRecursiveBy2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n;
        while(rem%2==0)
        {
            rem=n/2;
        }
        System.out.println(rem);
    }
}
