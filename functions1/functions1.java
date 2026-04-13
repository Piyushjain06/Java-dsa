import java.util.Scanner;
//java always uses call by value
public class functions1 {
    public static int calculatesum(int a, int b){// parameter or formal parameters
        int sum= a +  b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= calculatesum(a, b);// arguments or acutal parameters 
        System.out.print("Sum= "+sum);
    }
}
