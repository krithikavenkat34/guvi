import java.util.*;
public class DiviBy13 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%13==0)
        {
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
