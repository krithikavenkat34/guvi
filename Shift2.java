import java.util.*;
public class Shift2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
        int o=k;
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=x-k,j=0;i<x&&j<k;i++,j++)
        {
             b[j]=a[i];
        }
        for(int j=0;j<=k&&o<x;j++,o++)
        {
            b[o]=a[j];
        }
        for(int i=0;i<x;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
