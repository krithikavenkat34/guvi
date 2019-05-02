import java.util.*;
public class MidValue* {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
         int l=s.length()/2;
         for(int i=0;i<s.length();i++)
         {
             if(s.length()%2==0)
             {
               if(i!=l-1&&i!=l)
               {
                 System.out.print(s.charAt(i));  
               }
               else System.out.print("*");
             }
             else
             {
                 if(i==l)
                 {
                     System.out.print("*");
                 }
                 else System.out.print(s.charAt(i));
             }
         }
    }
}
