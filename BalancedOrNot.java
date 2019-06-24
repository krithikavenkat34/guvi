import java.util.*;
public class BalancedOrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                count++;
            }
            else count--;
        }
        if(count==0)
        System.out.println("yes");
        else System.out.println("no");
    }
}
