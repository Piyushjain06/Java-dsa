import java.util.*;
public class basic4{
    public  static void main(String args[]){
        System.out.println("Enter day of the week");
        Scanner sc= new Scanner(System.in);
        int week= sc.nextInt();
        switch(week){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("wednesday");break;
            case 4: System.out.println("thursday");break;
            case 5: System.out.println("friday");break;
            case 6: System.out.println("saturday");break;
            case 7: System.out.println("sunday");break;
        }
    }
}