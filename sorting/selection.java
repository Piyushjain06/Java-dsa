
public class selection {
    // selection sort: picks the smallest element, put at beg
     public static void selection(int arr[]) {
        for( int i=0; i<arr.length;i++){
            int minpos=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minpos]> arr[j]){
                    minpos=j;
                }
            }
            int temp= arr[minpos];
            arr[minpos]=arr[i];
            arr[i]= temp;
        }
        
        
    }   
    public static void main(String[] args){
        int arr[]={50,40,20,30,1};
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        selection(arr);
        System.out.println();
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
