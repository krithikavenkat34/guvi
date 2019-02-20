import java.util.*;
public class CountWithoutSpace {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=0;
        int count=0;
     
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!=' '){
                count++;
        }
        
    }
    System.out.print(count);
}
}
