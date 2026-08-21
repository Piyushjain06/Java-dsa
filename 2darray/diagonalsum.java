public class diagonalsum{

    // non optimized approach , time complexity O(n^2)
public static int sum1(int matrix[][]){
    int sum=0;
    for (int i =0 ; i <matrix.length;i++){
        for (int j = 0 ; j<matrix[0].length;j++ ){
            if (i==j){
                sum+= matrix[i][j];
            }
            else if (i+j== matrix.length-1){
                sum+= matrix[i][j];
            }
        }
    }
    return sum;
}

public static int sum2(int matrix[][]){
    int sum=0;
    for ( int i= 0; i<matrix.length; i++){
        //primary diagonal left to right
        sum+= matrix[i][i];
        //secondary diagonal 
        if (matrix.length-i-1!= i ){
            sum+= matrix[i][matrix.length-i-1];
        }
    }
    return sum;
}

public static void main(String args[]){
int a[] []  = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println(sum1(a));
System.out.println(sum2(a));

}}