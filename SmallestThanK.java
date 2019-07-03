import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        int arr[]=new int[x];
        int k=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=0;
        for(int i=0;i<x;i++)
        {
            if(a[i]<k)
            {
                 arr[l]=a[i];
                 l++;
                 
            }
        }
        Arrays.sort(arr);
         for(int i=0;i<x;i++)
        {
            if(arr[i]!=0)
            {
            System.out.println(arr[i]);
            }
        }
    }
}
