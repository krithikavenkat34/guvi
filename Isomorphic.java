import java.util.*;
public class Isomorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=0,count1=0;
        for(int i=0;i<s1.length()-1;i++)
        {
            if(s1.charAt(i)==s1.charAt(i+1)) count++;
        }
         for(int i=0;i<s2.length()-1;i++)
        {
            if(s2.charAt(i)==s2.charAt(i+1)) count1++;
        }
        if(count==count1) System.out.println("Yes");
        else System.out.println("No");
    }
}
