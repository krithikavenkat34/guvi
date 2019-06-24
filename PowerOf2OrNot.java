import java.util.*;
public class PowerOf2OrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        double arr[]=new double[100];
        for(int i=0;i<100;i++)
        {
            arr[i]=Math.pow(2,i);
        }
        boolean flag=false;
         for(int i=0;i<100;i++)
        {
            if((double)k==arr[i])
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println("yes");
        else System.out.println("no");
    }
}
