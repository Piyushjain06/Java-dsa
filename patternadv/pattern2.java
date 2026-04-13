
public class pattern2 {
    public static void main(String args[]){
        // half inverted pyramid
        int n= 5;
        for (int i = 1; i<=n;i++){
            //spaces
            for (int j=1; j<=(n-i);j++){
                System.out.print(" ");}
            //stars
            for (int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
