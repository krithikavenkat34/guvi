import java.util.*;
public class PerfectSquareInBetween
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        int per[]=new int[100];
        for(int i=1;i<100;i++)
        {
          per[i]=i*i;
        }
      
            for(int j=0;j<per.length;j++)
            {
              for(int i=a;i<=b;i++)
              {
              if(i==per[j])
              {
                  count++;
              }
            }
        }
        System.out.println(count);
    }
}
