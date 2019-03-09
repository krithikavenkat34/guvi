import java.util.*;
public class PrimeCount {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0,countpri=0;
        for(int i=x;i<=y;i++)
        {
            count=0;
            for(int k=2;k<=i/2;k++)
            {
                if(i%k==0) count++;
            }
            if(count>=1) continue;
              else countpri++;
        }
        System.out.println(countpri);
    }
}
