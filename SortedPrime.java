import java.util.*;
public class SortedPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0,count=0;
        int result[]=new int[n/2];
        for(int i=1;i<=n;i++)
        {
         if(n%i==0)
         {
              count=0;
          for(int j=i;j>=1;j--)
          {
              if(i%j==0)
               count++;
          }
          if(count==2)
          {
              result[k]=i; 
              k++;
          }
         }
        }
        Arrays.sort(result);
        for(int i=0;i<result.length;i++)
        {
            if(result[i]!=0)
         System.out.print(result[i]+" ");
        }
    }
}
