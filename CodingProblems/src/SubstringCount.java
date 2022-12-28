import java.util.*;

public class SubstringCount {
    public static void main(String[] args) {
      String s1="Appleman";
      String s2="man";
      int count=0;
      int start=0;
      
      while(true){
        int index=s1.indexOf(s2,start);
      
        if(index > 0){
          
          start=index+1;
          count++;
          
        }else{
        	break;
        }
      
      }
      System.out.println("Count is !"+count);

  }
}