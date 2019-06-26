import java.util.*;
public class CheckIntOrLOng
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=47&&str.charAt(i)<=58)
             res++;
        }
        if(res<=10)
        {
             System.out.println("INT");
        }
        else
        System.out.println("LONG");
    }
}
