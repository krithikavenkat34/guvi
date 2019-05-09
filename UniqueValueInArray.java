import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<x;i++)
        {
            count=1;
            for(int j=i+1;j<x;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=0;
                }
            }
            if(count==1&&arr[i]!=0) 
                 System.out.println(arr[i]);
        }
    }
}
