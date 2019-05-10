import java.util.*;
public class Gcd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int max=0,num=0;
        for(int i=1;i<=100;i++)
        {
          if(x%i==0&&y%i==0)
          {
             num=i;     
          }
          if(max<num) 
          {
              max=num;
          }
        }
        System.out.println(max);
    }
}
