public class OddBetweenIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers:");
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=n+1;i<m;i++) {
    	  if(i%2!=0) {
    		  System.out.println(i);
    	  }
 
      }
	}

}
