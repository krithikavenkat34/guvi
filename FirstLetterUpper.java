import java.util.*;
public class FirstLetterUpper {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split("\\s");
        int asc=0;
        for(int i=0;i<s.length;i++)
        {
               s[i]=s[i].replace(s[i].substring(0,1),s[i].substring(0,1).toUpperCase());
        }
        for(int i=0;i<s.length;i++)
        System.out.print(s[i]+" ");
    }
}
