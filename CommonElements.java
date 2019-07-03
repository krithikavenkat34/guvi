import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[x];
        for(int i=0;i<x;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
            if(a[i]==b[j])
            {
                  System.out.print(a[i]+" ");
            }
            }
        }
    }
}
