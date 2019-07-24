import java.util.*;
public class Fact {
    public static int f=1;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        f=fact(n);
        System.out.println(f);
    }
    public static int fact(int n)
    {
        if(n!=0)
        {
            f=n;
            f*=fact(n-1);
        }
        return f;
    }
}
