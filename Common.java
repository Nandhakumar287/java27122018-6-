import java.io.*;
import java.util.*;



class Check{
  public void fun(String str1,String str2){
    int i,j,count1=0,count2=0;
    for(i=0;i<str1.length();i++){
      for(j=0;j<str1.length();j++){
        if(str1.charAt(i)!=str1.charAt(j)){
        count1++;
        }
      }
    }
    
    for(i=0;i<str2.length();i++){
      for(j=0;j<str2.length();j++){
        if(str2.charAt(i)!=str2.charAt(j)){
        count2++;
        }
      }
    }
    
    if(count1==count2){
    System.out.println("Yes!");
    }else{
    System.out.println("NO!");
    }
  }
}

   public class Common{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      Check c=new Check();
      System.out.println("Enter First String");
      String str1=sc.next();
      String str2=sc.next();
      c.fun(str1,str2);
      }
    }  
