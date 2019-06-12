import java.util.*;
public class FirstRepeatedElement
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=0;
        a:
        for(int i=0;i<x-1;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(arr[i]==arr[j])
                {
                    res=arr[i];
                    break a;
                }
            }
        }
        System.out.println(res);
    }
}
