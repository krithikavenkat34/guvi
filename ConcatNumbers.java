import java.util.*;
public class ConcatNumbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s1=String.valueOf(n);
        String s2=String.valueOf(k);
        System.out.println(s1.concat(s2));
    }
}
