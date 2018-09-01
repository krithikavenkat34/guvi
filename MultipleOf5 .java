public class MultipleOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=5;i++) {
			int k=n*i;
			System.out.println(k);
		}
	}

}
