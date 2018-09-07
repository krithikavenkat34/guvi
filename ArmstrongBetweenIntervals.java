public class ArmstrongBetweenIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two intervals:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int j=0,p=0,l=0,count=0,k=0;
		for(int i=n+1;i<m;i++) {
			j=i;
			k=0;
			while(j!=0){
				l=j%10;
				k=k+(l*l*l);
				j/=10;
			}
		   if(i==k)
		   {
				if(count==0) 
				{
					System.out.print("Armstrong numbers are:");
				}
				System.out.println(i);
				count++;
				}
		}
	 if(count==0)
	 {
		 System.out.print("no armstrong numbers");
	 }
}
}
