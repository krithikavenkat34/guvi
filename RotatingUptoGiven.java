import java.util.*;
public class RotatingUptoGiven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n=sc.nextInt();
	    String res="";
	    res+=str.substring(str.length()-n)+str.substring(0,str.length()-n);
	    System.out.println(res);
	}

}

