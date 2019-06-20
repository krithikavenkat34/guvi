import java.util.*;
public class RepExceptForOne {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        a[i]=sc.nextInt();
        int count=0,res=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                  count++;
                  a[j]=0;
                }
            }
            if(count==0&&a[i]!=0) res=a[i];
            count=0;
        }
        System.out.println(res);
    }
}
