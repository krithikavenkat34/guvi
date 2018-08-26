public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers:");
          int a=sc.nextInt();  
          int b=sc.nextInt();
          int c=sc.nextInt();
	    if(a>b && a>c) {
	    	System.out.println(a);
	    }
	    else if(b>a && b>c) {
	    	System.out.println(b);
	    }
	    else if(c>a&&c>b){
	    	System.out.println(c);
	    }
	}
}
