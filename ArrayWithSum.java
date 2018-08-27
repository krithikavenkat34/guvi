public class ArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int sum=0;
          System.out.println("Enter the array size:");
          int m=sc.nextInt();       
          System.out.println("Enter the num to sum:");
          int k=sc.nextInt();
          int n[]=new int[m];
          System.out.println("Enter the array elements:");
          for(int i=0;i<m;i++) {
        	  n[i]=sc.nextInt();
          }
          for(int j=1;j<=k;j++) {
        	  sum+=j;
          }
          System.out.println(sum);
	}

}
