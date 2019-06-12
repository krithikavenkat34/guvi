import java.util.*;
public class KthBiggest
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int n=sc.nextInt();
       int arr[]=new int[x];
       for(int i=0;i<x;i++)
       {
           arr[i]=sc.nextInt();
       }
       int temp=0;
       for(int i=0;i<x;i++)
       {
          for(int j=i+1;j<x;j++)
          {
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
          }
        }
        for(int i=0;i<x;i++)
        {
          if(i==(n-1))
          System.out.println(arr[i]);
        }
}
}
