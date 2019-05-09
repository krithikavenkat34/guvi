import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
         String str1="";
         for(int i=0;i<s.length();i++)
         {
             int asc=(int)s.charAt(i);
             asc+=3;
             char ch=(char)asc;
             str1+=ch;
         }
        System.out.println(str1);
    }
}
