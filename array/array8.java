public class array8 {
    //Kadane's algorithm
    public static void main(String args[]){
        int n[]={-2,-3,-4,-1,-2,-1,-5,-3};
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            currsum=Math.max(n[i], currsum + n[i]);// to optimize for all negative arrays 
            maxsum= Math.max(currsum,maxsum);
    }
    System.out.println(maxsum);
}
}