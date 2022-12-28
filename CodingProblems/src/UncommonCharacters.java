public class UncommonCharacters {
    public static void main(String[] args) {
      
      String s1="Nitin";
      String s2="Nikhil";
      

      Character[] arr=new Character[20];

      int y=0;
      
      for(int i=0;i<s1.length();i++){
        for(int j=0;j<s2.length();j++){
         if(s1.charAt(i)==s2.charAt(j)){
            
           break;
         }else{
            arr[y]=s1.charAt(i);
            y++;
         }
        }
      }
      
      for(int i=0;i<arr.length;i++)
       System.out.println(arr[i]);
    }
        
  }