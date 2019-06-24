import java.util.*;
public class FindElementInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
          arr[i]=sc.nextInt();            
        }
        boolean flag=false;
        for(int i=0;i<x;i++)
        {
            if(arr[i]==k)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println("Yes");
        else System.out.println("no");
    }
}
