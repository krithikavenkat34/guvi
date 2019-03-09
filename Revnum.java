import java.util.*;
public class Revnum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String rev="";
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            rev+=rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
