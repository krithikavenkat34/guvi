import java.util.*;
public class LesserThanN {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(a[i]<x)
            {
                 System.out.println(a[i]);
            }
        }
    }
}
