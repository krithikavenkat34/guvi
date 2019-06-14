import java.util.*;
public class NumericOrnot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            int asc=(int)str.charAt(i);
            if(asc>=47&&asc<=58)
            {
                count++;
            }
        }
        if(count==str.length())
        System.out.println("yes");
        else System.out.println("no");
    }
}
