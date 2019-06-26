import java.util.*;
import java.lang.Math;
public class SinAngle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b = Math.toRadians(a); 
        System.out.printf("%.1f",(float)Math.sin(b));
    }
}
