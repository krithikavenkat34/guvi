import java.util.*;
public class OddEvenString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str1="",str2="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0) str1+=s.charAt(i);
            else str2+=s.charAt(i);
        }
         System.out.println(str1+" "+str2);
    }
}
