
public class array2 {
    //largest number in array
    public static void main(String args[]){
        int a[]={20,10,5,30,70,25,1};
        int largest= Integer.MIN_VALUE; //NEGATIVE INFINITY
        for (int i=0; i<=a.length-1;i++){
            if (largest<a[i]){
                largest= a[i];
            }
        }
        System.out.println("Largest number is "+ largest);
    }
}
