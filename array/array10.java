public class array10 {
    // assignment ques 1
    public static void main(String[] args) {
        int arr[]= {1,2,4,3};
        boolean cond= false;
        for (int i =0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    cond=true;
                    break;
                }
            }}
        if (cond == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
