import java.util.*;
public class NoOftimes {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       int s=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<x;i++)
        {
            if(arr[i]==s)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
