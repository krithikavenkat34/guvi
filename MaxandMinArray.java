import java.util.*;
public class MaxandMinArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0];
        for(int i=0;i<x;i++)
        {
            if(max<a[i]) max=a[i];
        }
        for(int i=0;i<x;i++)
        {
            if(min>a[i]) min=a[i];
        }
        System.out.print(max+" "+min);
    }
}
