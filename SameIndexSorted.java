import java.util.*;
public class SameIndexSorted {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        int arr1[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(arr[i]==i)
            {
                arr1[i]=i;
            }
        }
       Arrays.sort(arr1);
       for(int i=0;i<x;i++)
       {
           if(arr1[i]!=0)
           {
               System.out.print(arr1[i]+" ");
           }
           else continue;
       }
    }
}
