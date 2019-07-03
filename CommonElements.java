import java.util.*;
public class CommonElements {
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
            if(a[i]==b[i])
            {
                  System.out.print(a[i]+" ");
            }
        }
    }
}
