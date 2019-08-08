import java.util.*;
public class MergeSorted {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a[]=new int[x];
      int b[]=new int[y];
      int merge[]=new int[x+y];
      for(int i=0;i<x;i++)
      {
          a[i]=sc.nextInt();
      }
      for(int i=0;i<y;i++)
      {
          b[i]=sc.nextInt();
      }
      for(int i=0;i<x;i++)
      {
          merge[i]=a[i];
      }
      int k=0;
      for(int i=x;i<x+y;i++,k++)
      {
          merge[i]=b[k];
      }
     Arrays.sort(merge);
     for(int i=0;i<merge.length;i++)
     {
         System.out.print(merge[i]+" ");
     }
    }
}
