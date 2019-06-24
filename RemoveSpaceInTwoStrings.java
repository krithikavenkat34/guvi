import java.util.*;
public class RemoveSpaceInTwoStrings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String a=sc.nextLine();
        String str="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
               continue;
            }
            else str+=a.substring(i,i+1);
        }
       System.out.println(str);
    }
}
