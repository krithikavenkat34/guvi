import java.util.*;
public class AppendAnswer {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.append(" Answer");
        System.out.println(sb);
    }
}
