import java.util.*;
public class WithoutStrCmp {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int asc1=0,asc2=0,sum1=0,sum2=0;
        for(int i=0;i<s1.length();i++)
        {
          asc1=(int)s1.charAt(i);
          sum1+=asc1;
        }
        for(int i=0;i<s2.length();i++)
        {
          asc2=(int)s2.charAt(i);
          sum2+=asc2;
        }
        if(sum1>sum2)
        {
            System.out.println(s1);
        }
        else if(sum1<sum2)
        System.out.println(s2);
        else System.out.println(s2);
    }
}
