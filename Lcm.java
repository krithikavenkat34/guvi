import java.util.*;
public class Lcm {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=1,max=a;
        if(a<b) max=b;
        for(int i=2;i<=max;i++)
        {
            if(a%i==0&&b%i==0)
             {
                 p*=i;
                 a=a/i;
                 b=b/i;
                 i=1;
                 if(a%b!=0)
                {
                 p*=a*b;
                 }
                 if(a==1)
                 {
                      p*=b;
                  }
                 else if(b==1)
                 {
                         p*=a;
                 }
             }
        }
        System.out.println(p);
    }
}
