public class MinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int j=1;j<n;j++) {
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println(min);

	}

}
