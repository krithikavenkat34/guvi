import java.util.*;
public class RevWOutVowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
        int rem=s.length()-1;
        String res="";
        while(rem>=0)
        {
            if(s.charAt(rem)!='i'&&s.charAt(rem)!='o'&&s.charAt(rem)!='a'&&s.charAt(rem)!='e'&&s.charAt(rem)!='u')
            {
             res+=s.charAt(rem);
            }
            rem--;
        }
        System.out.print(res);
    }
}
