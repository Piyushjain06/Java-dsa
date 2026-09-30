
public class evenodd {
    public static void evenOdd(int n){
        int bitMask=1;
        if ((n & bitMask)== 0){
            System.out.println("The number is even "+ n );
        }
        else{
        System.out.println("The number is odd "+ n );

        }
    }
    public static void main(String[] args) {
        evenOdd(45);
    }
}
