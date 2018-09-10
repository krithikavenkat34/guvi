public class TimeSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour and min");
         int h1=sc.nextInt();
         int m1=sc.nextInt();
         int h2=sc.nextInt();
         int m2=sc.nextInt();
        System.out.println(Math.abs(h1-h2)+" "+Math.abs(m1-m2));
	}
}
