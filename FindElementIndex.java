import java.util.*;
public class FindElementIndex {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int p=0;
            for(int j=0;j<x;j++)
            {
                if(k==arr[j])
                {
                    p=j;
                }
            }
        System.out.println(++p);
    }
}
