import java.util.*;
public class GreatestDivisor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0&&m%i==0)
            res=i;
        }
        System.out.println(res);
    }
}
