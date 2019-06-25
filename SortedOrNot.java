import java.util.*;
public class SortedOrNot
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int in[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        in[i]=arr[i];
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==in[i])
	        {
	            count++;
	        }
	    }
	    if(count==arr.length)
	    System.out.println("yes");
	    else System.out.println("no");
	}

}

