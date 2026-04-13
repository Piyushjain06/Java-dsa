//factorial
public class functions2 {
    public static void fact(int a){
        int factor1=1;
        for (int i=1;i<= a ;i++){
             factor1= factor1 *i;
        }
    System.out.println(factor1);
    }
    public static void main(String args[]){
        fact(5);
    }
}
