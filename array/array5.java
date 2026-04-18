public class array5{
    public static void main(String args[]){
        // print all the subarrays
        int n[]= {10,20,30,40,50,60,70};
        for (int i= 0; i< n.length;i++){
            int start=i;
            for (int j=i; j<n.length;j++){
                int end = j;
                for (int k=start; k<=end;k++){ 
                System.out.print(n[k]+ " ");}
            }
            System.out.println();
        }
        System.out.println();


    }
    
}