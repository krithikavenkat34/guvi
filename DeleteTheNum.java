import java.util.*;
public class DeleteTheNum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x-k;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
