import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=1,temp=1;
        System.out.print(a+" "+b+" ");
        for(int i=a+b;i<n;i++)
        {
           System.out.print((a+b)+" ");
           temp=a+b;
           a=b;
           b=temp;
        }
    }
}
