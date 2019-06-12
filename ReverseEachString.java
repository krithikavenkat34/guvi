import java.util.*;
public class ReverseEachString
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s1[]=s.split("\\s");
       for(int i=0;i<s1.length;i++)
       {
           StringBuffer str1=new StringBuffer(s1[i]);
           System.out.print(str1.reverse()+" ");
       }
}
}
