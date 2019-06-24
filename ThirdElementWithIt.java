import java.util.*;
public class ThirdElementWithIt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        for(int i=0;i<str.length();i+=3)
        {
            str1+=str.substring(i,i+1);
        }
        System.out.println(str1);
    }
}
