import java.util.*;
public class ContainsAlphaNumeric {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int num=0,count=0,count1=0,count2=0;
         for(int i=0;i<s.length();i++)
         {
           num=(int)s.charAt(i);
           if((num>=65&&num<=90)||(num>=97&&num<=122))
           {
               count++;
           }
           else if(num>=48&&num<=57)
           {
               count1++;
           }
           else if((num>=33&&num<=47)||(num>=58&&num>=64)||(num>=91&&num<=96))
           {
               count2++;
           }
         }
         if(count>=1&&count1>=1&&count2>=1)
             System.out.println("Yes");
        else System.out.println("No");
    }
}
