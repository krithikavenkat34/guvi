import java.util.*;
public class MinOf10 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        for(int i=0;i<10;i++)
        {
            x[i]=sc.nextInt();
        }
        int min=x[0];
        for(int i=0;i<10;i++)
        {
            if(min>x[i])
             min=x[i];
        }
        System.out.println(min);
    }
}
