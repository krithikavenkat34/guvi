import java.util.*;
public class KthSmallestInarray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(k-1==i)
            {
                p=a[i];
                break;
            }
        }
        System.out.println(p);
    }
}
