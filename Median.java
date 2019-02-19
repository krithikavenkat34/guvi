import java.util.*;
public class Median {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       int tem=0;
       for(int i=0;i<n;i++) 
         a[i]=sc.nextInt();
       for(int j=0;j<n-1;j++)
       {
           if(a[j]>a[j+1]) 
           {
               tem=a[j];
               a[j]=a[j+1];
               a[j+1]=tem;
           }
       }
       
         System.out.print(a[a.length/2]);
    }
}
