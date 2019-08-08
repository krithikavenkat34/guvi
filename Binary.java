import java.util.*;
public class Binary {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int a[]=new int[x];
      for(int i=0;i<x;i++)
      {
          a[i]=sc.nextInt();
      }
      int p=0;
      Arrays.sort(a);
      int max=Integer.parseInt(Integer.toBinaryString(a[0]));
     for(int i=0;i<x;i++)
     {
           max&=Integer.parseInt(Integer.toBinaryString(a[i]));
     }
     String max1=String.valueOf(max);
     System.out.println(Integer.parseInt(max1,2));
    }
}
