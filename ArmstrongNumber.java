public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int j=n,m=0,l=0,k=0;
		while(n>=1){
			l=n%10;
			m=l*l*l;
			k=k+m;
			n/=10;
		}
		if(j==k) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}

}
