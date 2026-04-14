import java.util.Scanner;


public class array1 {
    //linear search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the element:");
        int target= sc.nextInt();
        int a[]={10,20,30,40,50,60};
        for (int i=0;i<=a.length-1;i++){
            if (a[i]==target){
                System.out.println("The element was found at "+ (i+1));
                break;
            }
        }
        
    }
}
