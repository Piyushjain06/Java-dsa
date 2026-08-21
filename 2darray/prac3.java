public class prac3 {
     public static void main(String args[]){
        int arr[][]={{1,4,9},{11,4,3}};
        int[][] arrt = new int[3][2];
        for ( int i=0; i<arr.length;i++){
            for (int j=0; j< arr[0].length;j++){
                arrt[j][i]=arr[i][j];
            }
        }
        for ( int i=0; i<arrt.length;i++){
            for (int j=0; j< arrt[0].length;j++){
            System.out.print(arrt[i][j]+" ");
            }
            System.out.println();
        }
    }
}
