import java.util.*;
public class CompareWithoutCase {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(str1.equalsIgnoreCase(str2))
        System.out.println("yes");
        else System.out.println("no");
    }
}
