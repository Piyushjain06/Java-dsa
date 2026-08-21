// insertion sort: ek element uthao and backtrack while comparing if smaller swap.time complexity: O(N^2)

public class insertion {
    public static void insertion(int arr[]) {
        for (int i=1; i<arr.length; i++){
            int curr= arr[i];
            int prev = i-1;
            while(prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }   
    public static void main(String[] args){
        int arr[]={50,40,20,30,1};
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        insertion(arr);
        System.out.println();
        for (int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
