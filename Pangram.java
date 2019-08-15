import java.util.*;
public class Pangram {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      str.toLowerCase();
      char ch[]=str.toCharArray();
      char alpha[]=new char[26];
      int ascii=97;
      for(int i=0;i<26;i++)
      {
          alpha[i]=(char)ascii;
          ascii++;
      }
      for(int i=0;i<ch.length;i++)
      {
          for(int j=i+1;j<ch.length;j++)
          {
              if(ch[i]==ch[j])
              {
                  ch[j]=' ';
              }
          }
      }
      int count=1;
      for(int i=0;i<ch.length;i++)
      {
          for(int j=0;j<alpha.length;j++)
          {
              if(alpha[j]==ch[i])
              {
                count++;
              }
          }
      }
      if(count==26)
        System.out.println("Pangram");
        else System.out.println("Not a Pangram");
    }
}
