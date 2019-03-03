import java.util.*;
public class AverageInArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<x;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum/x);
    }
}
