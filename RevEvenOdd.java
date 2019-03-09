import java.util.*;
public class RevEvenOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res1="",res2="";
        int mid=str.length()/2;
        String str1=str.substring(0,mid);
        String str2=str.substring(mid);
        for(int i=str1.length()-1;i>=0;i--)
        {
            res1+=str1.charAt(i);
        }
       for(int i=str2.length()-1;i>=0;i--)
        {
            res2+=str2.charAt(i);
        }
        System.out.println(res1+res2);
    }
}
