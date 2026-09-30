public class twopow {
    public static void main(String args[]){
        int n =8;
        if ((n & (n-1))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
