import java.util.*;
public class SubsetArray
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       int arrA[]=new int[x];
       int arrB[]=new int[y];
       for(int i=0;i<x;i++)
       {
           arrA[i]=sc.nextInt();
       }
       for(int i=0;i<y;i++)
       {
           arrB[i]=sc.nextInt();
       }
       int count=0;
       for(int i=0;i<x;i++)
       {
          for(int j=0;j<y;j++)
          {
            if(arrA[i]==arrB[j])
            {
                  count++;     
            }
          }
        }
        if(count==y)
        System.out.println("yes");
        else System.out.println("no");
}
}
