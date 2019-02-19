import java.util.*;
public class Numeric {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        int count=1;
        for(int i=0;i<ch.length;i++)
        {
        int asc=(int)ch[i];
        if(asc>=48&&asc<=57) count=0;
        }
        if(count==0) 
        System.out.println("Yes");
        else System.out.println("No");
    }
}
