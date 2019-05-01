import java.util.*;
public class Countnum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0,f=0;
        while(x!=0)
        {
            f=x%10;
            count++;
            x/=10;
        }

        System.out.println(count);
    }
}
