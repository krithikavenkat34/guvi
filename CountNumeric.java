import java.util.*;
public class CountNumeric {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=0;
        int count=0;
     
        for(int i=0;i<s.length();i++)
        {
            int asc=(int)s.charAt(i);
            if(asc>=48&&asc<=57)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}

