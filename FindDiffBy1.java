import java.util.*;
public class FindDiffBy1 {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int a[]=new int[x];
      for(int i=0;i<x;i++)
      {
          a[i]=sc.nextInt();
      }
      int p=0;
      a:
      for(int i=0;i<x;i++)
      {
          for(int j=i+1;j<x;j++)
          {
              if(Math.abs(a[i]-a[j])==1)
              {
                 p=a[j];
                 break a;
              }
          }
      }
      System.out.println(p);
    }
}
