import java.util.*;
public class StringRev {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp+=s.charAt(i);
        }

        System.out.println(temp);
    }
}
