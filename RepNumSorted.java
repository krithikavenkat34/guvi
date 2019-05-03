import java.util.*;
public class RepNumSorted {
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
            for(int j=i+1;j<x;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr1[i]=arr[i];
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<x;i++)
        {
            if(arr1[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
            else continue;
        }
    }
}
