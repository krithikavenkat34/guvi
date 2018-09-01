public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your number:");
          int n=sc.nextInt();
          int count=0;
          for(int i=2;i<n;i++) {
        	  if(n%i==0) {
        	  count++;
        	  break;
          }
          }
          if(count==0) {
        	  System.out.println("Yes");
          }
          else {
        	  System.out.println("no");
          }
	}

}
