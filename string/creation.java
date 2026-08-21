import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(str); 
        String str2= new String();
        Scanner sc= new Scanner(System.in);
        str2= sc.nextLine();
        System.out.println(str2); 
        System.out.println(str2.length());
        //concatition 
        System.out.println(str+ str2);
        //charat
        System.out.println(str.charAt(0));
    }
}
