import java.util.*;
public class FindKthOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int j=0,p=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                arr[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(k-1==i)
            {
                p=arr[i];
                break;
            }
        }
        System.out.println(p);
    }
}
