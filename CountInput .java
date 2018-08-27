public class CountInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int s=0;
           for(int j=0;n%10>0;j++) {
              s++;
              n=n/10;
              
           }
           System.out.println(s);
	}

}
