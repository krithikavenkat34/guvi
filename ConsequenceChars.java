import java.util.*;
public class ConsequenceChars
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean flag=false;
        for(int i=0;i<s1.length()-2;i++)
        {
            for(int j=0;j<s2.length()-2;j++)
            {
                if(s1.substring(i,i+2).equals(s2.substring(j,j+2)))
                {
                    flag=true;
                    break;
                }
            }
        }
        if(flag==true)
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
