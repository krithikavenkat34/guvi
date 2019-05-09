import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char ch=sc.next().charAt(0);
        int b=sc.nextInt();
        if(ch=='%')
        {
            System.out.println(a%b);
        }
        else if(ch=='/')
        {
            System.out.println(a/b);
        }
    }
}
