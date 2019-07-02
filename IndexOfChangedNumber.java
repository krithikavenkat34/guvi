import java.util.*;
public class IndexOfChangedNumber{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            a[i]=arr[i];
        }
        Arrays.sort(arr);
        int p=0;
         for(int i=0;i<n;i++)
        {
            if(a[i]!=arr[i])
            {
            p=i;
            break;
            }
        }
        System.out.println(p);
    }
}
