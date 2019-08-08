import java.util.*;
public class MaxDifferInArray {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int a[]=new int[x];
      for(int i=0;i<x;i++)
      {
          a[i]=sc.nextInt();
      }
     Arrays.sort(a);
      System.out.println(a[a.length-1]-a[0]);
    }
}
