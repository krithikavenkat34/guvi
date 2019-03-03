import java.util.*;
public class CountNumbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0,rem=0;
        while(x!=0)
        {
            rem=x%10;
            count++;
            x/=10;
        }
        System.out.println(count);
    }
}
