public class PowerOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int m=1;
         System.out.println("Enter the number:");
         int n=sc.nextInt();
         System.out.println("enter the power:");
         int k=sc.nextInt();
         for(int i=1;i<=k;i++) {
        	 m*=n;
         }
         System.out.println(m);
	}

}
