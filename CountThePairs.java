import java.util.*;
public class CountThePairs {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n[]=new int[x];
      for(int i=0;i<x;i++)
      {
          n[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<x;i++)
      {
          for(int j=i+1;j<x;j++)
          {
              if(n[i]<n[j])
              {
                  count++;
              }
          }
      }
      System.out.println(count);
    }
}
