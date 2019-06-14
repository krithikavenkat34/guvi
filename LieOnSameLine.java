import java.util.*;
public class LieOnSameLine
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][2];
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==0)
                 flag=true;
                 break;
            }
        }
        if(flag) System.out.println("yes");
        else System.out.println("no");
    }
}
