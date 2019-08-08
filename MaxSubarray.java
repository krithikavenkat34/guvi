import java.util.*;
public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Scanner sc=new Scanner(System.in);
		      int x=sc.nextInt();
		      int a[]=new int[x];
		      for(int i=0;i<x;i++)
		      {
		          a[i]=sc.nextInt();
		      }
		      int p=1,max=0,k=0;
		      for(int i=0;i<x;i++)
		      {
		    	  p=1;k=i;
		    	  for(int j=i+1;j<x;j++)
		    	  {
		           if(a[k]<a[j])
		             {
		                 p++;
		                 k++;
		             }
		           else break;
		    	  }
		    	  if(max<p)
		             {
		                 max=p;
		             }
		      }
		      System.out.println(max);
		    }
	}

