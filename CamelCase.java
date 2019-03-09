import java.util.*;
public class CamelCase {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String res1="",res2="";
        int asc=0;
        for(int i=0;i<str1.length();i++)
        {
            asc=(int)str1.charAt(i);
            if(i==0)
            {
                if(asc>=97&&asc<=122)
                asc-=32;
                res1+=(char)asc;
            }
            else {
                if(asc>=65&&asc<=90)
                asc+=32;
                res1+=(char)asc;
            }
        }
        System.out.print(res1+" ");
        for(int i=0;i<str2.length();i++)
        {
            asc=(int)str2.charAt(i);
            if(i==0)
            {
                if(asc>=97&&asc<=122)
                asc-=32;
                res2+=(char)asc;
            }
            else {
                if(asc>=65&&asc<=90)
                asc+=32;
                res2+=(char)asc;
            }
        }
        System.out.print(res2);
    }
}
