import java.util.*;
public class OddEvenValues
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
       for(int i=0;i<x;i++)
       {
           if((i%2==0&&arr[i]%2!=0)||(i%2!=0&&arr[i]%2==0))
           {
               System.out.print(arr[i]+" ");
           }
       }
   } 
}
