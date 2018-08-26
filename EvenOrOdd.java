public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int a=sc.nextInt();
      if(a>0) {
          if(a%2==0) {
    	         System.out.println("Even");
              }
           else if(a%2!=0){
    	          System.out.println("Odd");
              }
      }
      else {
    	  System.out.println("Invalid");
      }
	}

}
