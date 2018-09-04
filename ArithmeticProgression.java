public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("enter the another two numbers:");
		int a=sc.nextInt();
		int d=sc.nextInt();
		int i=0,k=0;
			i=(2*a)+((n-1)*d);
		    k=(n*i)/2;
		    System.out.println(k+" ");
		}
	}

