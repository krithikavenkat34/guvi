import java.util.*;
public class InsidePresent {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean flag=false;
        for(int i=x+1;i<y;i++)
        {
            if(i==n)
            {
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("yes");
        else System.out.println("no");
    }
}
