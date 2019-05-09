import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int count=0,max=0;
       char x=' ';
       for(int i=0;i<s.length();i++)
       {
           count=0;
           for(int j=i+1;j<s.length();j++)
           {
               if(s.charAt(i)==s.charAt(j))
               {
                   count++;
               }
           }
           if(max<count)
           {
               x=s.charAt(i);
               max=count;
           }
       }
       System.out.println(x);
    }
}
