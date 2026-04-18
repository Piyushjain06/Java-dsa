public class array7 {
    // prefix sum of array 
    public static void main(String args[]){
        int n[]= {1,-2,6,-1,3};
        int prefix[]= new int[n.length]; 
        prefix[0]= n[0];
        // to calculate prefix array
        for (int i=1;i<n.length;i++){
            prefix[i]=prefix[i-1]+ n[i];
        }
        
        int currsum= 0;

        int maxsum= Integer.MIN_VALUE;
        for (int i=0; i< n.length; i++){
            int start=i;
            for (int j=i;j<n.length;j++){
                int end= j;
                currsum= start==0 ? prefix[end]: prefix[end] - prefix[start-1];
                if (currsum>maxsum){
                    maxsum= currsum;
                }
            }

        }
        System.out.println(maxsum);
    }

}
