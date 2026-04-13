public class basic5 {
    public static void main(String args[]){
        //print reversed number
        int n=845454;
        while (n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
