public class functions5{
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        for (int i=1;i<=10;i++){
            if (isPrime(i)==true){
                System.out.println(i);

            }
        }
    }
}
