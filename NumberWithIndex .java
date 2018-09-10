public class NumberWithIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			System.out.println(a[j]+" "+j);
		}
	}

}
