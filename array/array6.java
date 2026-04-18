public class array6{
    public static void main(String args[]){
        // print max sum of  the subarrays
        int n[]= {1,-2,6,-1,3};
        int maxsum= Integer.MIN_VALUE;
        for (int i= 0; i< n.length;i++){
            int start=i;
            for (int j=i; j<n.length;j++){
                int end = j;
                int cursum=0;
                for (int k=start; k<=end;k++){ 
                cursum += n[k];
            if (cursum>maxsum){
                maxsum =cursum;
            }}
            }
        }
        System.out.println(maxsum);
    }
    
} 
    

