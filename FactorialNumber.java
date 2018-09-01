public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int f=1;
      for(int i=1;i<=n;i++) {
    	  f*=i;
      }
      System.out.println(f);
	}

}
