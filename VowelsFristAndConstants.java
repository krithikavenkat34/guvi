import java.util.*;
public class VowelsFristAndConstants {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String str="";
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
          if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u'||ch[i]=='i')
          {
           str+=ch[i];  
           ch[i]=0;
          }
      }
      for(int i=0;i<ch.length;i++)
      {
          if(ch[i]!=0)
          str+=ch[i];
      }
      System.out.println(str);
    }
}
