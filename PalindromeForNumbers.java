public class PalindromeForNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,k=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int j=n;
      while(n>0) {
    	  k=n%10;
    	  m=m*10+k;
    	  n/=10;
      }
      if(m==j) {
    	  System.out.println("Yes");
      }
      else {
    	  System.out.println("No");
      }
	}

}
