import java.util.*;
public class StarAndSuper {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        int max=arr[0];
        int count=0;
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<x;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        System.out.print(arr[index]+" ");
        for(int i=index,k=index+i;k<x;k++)
        {
          if(arr[i]>arr[k])
          {
              System.out.print(arr[k]+" ");
          }
        }
         System.out.println();
          for(int i=index,k=0;k<x;k++)
        {
          if(arr[i]>arr[k])
          {
              count++;
          }
        }
        if(count==arr.length-1)
        System.out.println(max);
    }
}
