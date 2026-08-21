public class prac1 {
    public static void main(String[] args){
        int arr[][]= {{1,4,7},{7,1,5},{1,7,2}};
        int count =0 ;
        for ( int i=0; i<arr.length;i++){
            for (int j=0; j< arr[0].length;j++){
                if (arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
