public class TimeInHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time:");
		int t=sc.nextInt();
		int h=t/60;
		System.out.println(h+" "+t);
	}
}
