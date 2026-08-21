class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        for (int i : nums){
            int freq=0;
            for (int j =0; j< n ;j++){
                if (nums[j]==i){
                freq++;}
            }
            if (freq>n/2){
                return i;
                
            }
        }
        
        return -1;
    }
}