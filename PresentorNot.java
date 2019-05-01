import java.util.*;
public class PresentorNot {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       int s=sc.nextInt();
        int arr[]=new int[x];
        boolean flag=false;
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            if(arr[i]==s)
            {
                flag=true;
            }
        }
        if(flag)
        System.out.println("yes");
        else System.out.println("no");
    }
}
