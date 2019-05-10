import java.util.*;
public class LexicoOrder {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        int temp=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
            int asc=(int)ch[i];
            int asc1=(int)ch[j];
            if(asc>asc1)
            {
                temp=asc1;
                asc1=asc;
                asc=temp;
            }
            ch[i]=(char)asc;
            ch[j]=(char)asc1;
            }
        }
        String strres=new String(ch);
        System.out.println(strres);
    }
}
