import java.util.*;
public class DiffCharCount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String a=sc.next();
        String b=sc.next();
        int x=sc.nextInt();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                count++;
            }
        }
        if(x==count)
        System.out.println("Yes");
        else     System.out.println("No");
    }
}
