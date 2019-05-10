import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n[]=new int[x];
        int sum=0;
        for(int i=0;i<x;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            sum+=n[i];
        }
        System.out.println(sum);
    }
}
