import java.util.*;
public class PrintNumbers
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        String str="",rev="";
        while(n!=0)
        {
            rem=n%10;
            str+=rem+" ";
            n/=10;
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
         System.out.println(rev);
    }
}
