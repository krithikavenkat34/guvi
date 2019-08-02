import java.util.*;
public class LongestLength {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0,max=0;
        for(int i=0;i<x;i++)
        {
            count=0;
            for(int j=i;j<x;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            i+=(count-1);
            if(count>max)
            {
                max=count;
            }
        }
      System.out.println(max);
    }
}
