import java.util.*;
public class PerfectSquare {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x*y;
        boolean flag=false;
        for(int i=1;i<=100;i++)
        {
            if(i*i==z)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
