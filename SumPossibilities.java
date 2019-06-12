import java.util.*;
public class SumPossibilities
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int arr[]=new int[x];
       for(int i=0;i<x;i++)
       {
           arr[i]=sc.nextInt();
       }
       int a=0,b=0,c=0;
       for(int i=0;i<x-1;i++)
       {
          for(int j=i+1,sum=0;j<x;j++)
          {
              sum=arr[i]+arr[j];
              for(int k=j+1;k<x;k++)
              {
                if(sum==arr[k])
                {
                  a=arr[i];
                  b=arr[j];
                  c=arr[k];
                   System.out.println(a+" "+b+" "+c);
                }
              }
          }
       }
   } 
}
