import java.util.*;
public class SmallestThanK {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        int k=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(a[i]<k)
            {
                  System.out.print(a[i]+" ");
            }
        }
    }
}
