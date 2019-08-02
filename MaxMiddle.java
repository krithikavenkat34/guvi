import java.util.*;
public class MaxMiddle{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        int a[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        int max=a[a.length-1],p=0;
        for(int i=0;i<x;i++)
        {
            for(int j=i;j<x;j++)
            {
                if(max<arr[j])
                {
                    p=j;
                   break;
                }
            }
            for(int j=x-1;j>=p;j--)
            {
                if(max<arr[j])
                {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
