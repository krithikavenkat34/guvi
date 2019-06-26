import java.util.*;
public class KthCharForFirstTime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=sc.next().charAt(0);
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.substring(i,i+1).equals(String.valueOf(ch)))
            {
                index=i+1;
                break;
            }
        }
       System.out.println(index);
    }
}
