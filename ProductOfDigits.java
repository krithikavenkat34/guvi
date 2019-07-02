import java.util.*;
public class ProductOfDigits {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,rem=0;
        while(n!=0)
        {
            rem=n%10;
            p*=rem;
            n/=10;
        }
        System.out.println(p);
    }
}
