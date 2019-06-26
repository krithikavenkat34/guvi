import java.util.*;
public class WordsRepeats {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String find=sc.next();
        String s[]=str.split("\\s");
        int index=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(find))
            {
                index++;
            }
        }
       System.out.println(index);
    }
}
