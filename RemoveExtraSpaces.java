import java.util.*;
public class RemoveExtraSpaces
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String a=sc.nextLine();
        String str="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' '&&a.charAt(i+1)==' ')
            {
               continue;
            }
            else str+=String.valueOf(a.charAt(i));
        }
       System.out.println(str);
    }
}
