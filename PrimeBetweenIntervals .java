public class PrimeBetweenIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two intervals:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=0,count=0,k=0;
		for(i=n;i<m;i++){
			count=0;
			for(k=i;k>=1;k--){
                 if(i%k==0){
				    count+=1;
                 }
			}
		if(count==2){
			System.out.println(i);
		}
	}
	}
}
