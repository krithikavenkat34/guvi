import java.util.*;
public class Composite {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        if(x==2)
        {
            System.out.println("no");
        }
        else
        {
            for(int i=2;i<=x/2;i++)
            {
                if(x%i==0)
                {
                    count=1;
                    break;
                }
            }
            if(count==1)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
