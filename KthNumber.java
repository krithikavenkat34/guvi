import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n[]=new int[x];
        int y=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(i+1==y)
            System.out.println(n[i]);
        }
    }
}
