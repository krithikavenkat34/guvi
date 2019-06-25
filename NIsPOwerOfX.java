import java.util.*;
public class NIsPOwerOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    boolean flag=false;
	    for(int i=0;i<=100;i++)
	    {
	        if(n==Math.pow(x,i))
	        {
	            flag=true;
	            break;
	        }
	    }
	    if(flag==true)
	    System.out.println("yes");
	    else System.out.println("no");
	}

}
