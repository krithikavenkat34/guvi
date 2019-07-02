import java.util.*;
public class Ap {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        a=2*a;
        b=(c-1)*b;
        c=c/2;
        System.out.println(c*(a+b));
    }
}
