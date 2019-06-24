import java.util.*;
public class CountDigitsByGiven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Long x=sc.nextLong();
        int f=sc.nextInt();
        Long rem;
        int count=0;
        while(x!=0)
        {
            rem=x%10;
            if(rem==f)
            {
                count++;
            }
            x/=10;
        }
        System.out.println(count);
    }
}
