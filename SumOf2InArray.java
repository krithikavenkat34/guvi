import java.util.*;
public class SumOf2InArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]+a[i+1]==x)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println("yes");
        else System.out.println("no");
    }
}
