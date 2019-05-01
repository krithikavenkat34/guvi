import java.util.*;
public class BinaryOrNot {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9"))
        {
         System.out.println("no");
        }
        else System.out.println("yes");
    }
}
