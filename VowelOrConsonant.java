public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter your Character:");
              char c=sc.next().charAt(0);
              int ascii=(int)c;
              if(ascii>=97&&ascii<=122) {
                     if(c=='a'||c=='e'||c=='o'||c=='u'||c=='i') {
            	           System.out.println("Vowel");
                       }
                      else {
            	           System.out.println("Consonant");
                       }
	             }
              else {
            	  System.out.println("Invalid");
              }

}
}
