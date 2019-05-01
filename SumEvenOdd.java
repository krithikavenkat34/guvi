import java.util.*;
public class SumEvenOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x+y;
        if(z%2==0)
        {
            System.out.println("even");
        }
        else System.out.println("odd");
    }
}
