import java.util.*;
public class CountSpecialChars {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=0;
        int count=0;
     
        for(int i=0;i<s.length();i++)
        {
            int asc=(int)s.charAt(i);
            if(!((asc>=48&&asc<=57)||(asc>=65&&asc<=90)||(asc>=97&&asc<=122)))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}

