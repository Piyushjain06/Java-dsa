import java.util.Scanner;

public class palindrome {
    public static boolean palindrome1(String str){
        boolean plain=true;
        for (int i =0; i> str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)){
                plain=false;
            }
          
        }
        return plain;

    }
    
   public static void main(String[] args) {
        String str="noon";
        
        System.out.println(palindrome1(str)); 

   }}
