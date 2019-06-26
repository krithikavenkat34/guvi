import java.util.*;
public class CommonChars {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean flag=false;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.substring(i,i+1).equals(str2.substring(i,i+1)))
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println("yes");
        else System.out.println("no");
    }
}
