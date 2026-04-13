package patternadv;

public class pattern4 {
    //Floyd's triangle
    public static void main(String args[]){
        int n=5;
        int count=0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
