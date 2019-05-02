import java.util.*;
public class OddInNum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        String Str="";
        while(n>0)
        {
            m=n%10;
            if(m%2!=0)
            {
                Str+=m;
            }
            n/=10;
        }
        for(int i=Str.length()-1;i>=0;i--)
        {
           System.out.print(Str.charAt(i)+" ");
        }
    }
}
