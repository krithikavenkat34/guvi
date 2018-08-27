public class LeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the year to check:");
         int year=sc.nextInt();
         if(year%4==0||year%100==0) {
        	 System.out.println("Yes");
         }
         else {
        	 System.out.println("No");
         }
	}

}
