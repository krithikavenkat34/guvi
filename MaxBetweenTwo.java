import java.util.*;
public class MaxBetweenTwo {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
            for(int i=0,j=i;j<x;j++)
            {
                if(arr[i]<arr[j])
                {
                     System.out.print(arr[j]+" ");
                }
            }
    }
}
