import java.util.*;
public class MinDifferInArray {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int a[]=new int[x];
      for(int i=0;i<x;i++)
      {
          a[i]=sc.nextInt();
      }
     Arrays.sort(a);
     int min=Math.abs(a[1]-a[0]);
     for(int i=x-1;i>0;i--)
     {
         if(Math.abs(a[i]-a[i-1])!=0&&min>Math.abs(a[i]-a[i-1]))
         {
             min=Math.abs(a[i]-a[i-1]);
         }
     }
     System.out.println(min);
    }
}
