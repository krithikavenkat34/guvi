public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the character:");
           char c=sc.next().charAt(0);
           int ascii=(int)c;
           if(ascii>=97&&ascii<=122||ascii>=65&&ascii<=90) {
        	   System.out.println("Alphabet");
           }
           else {
        	   System.out.println("No");
           }
	}

}
