import java.util.*;
public class ConvertLowerToUpper
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            int asc=(int)s.charAt(i);
            if(asc>=65&&asc<=90)
            {
                asc+=32;
                System.out.print((char)asc);
            }
            else
            {
                asc-=32;
                System.out.print((char)asc);
            }
        }
    }
}
