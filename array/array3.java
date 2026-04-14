
    public class array3 {
        //binary search
        public static void main(String args[]){
            int arr[]={10,20,30,40,50,60,70,80};
            int low =0;
            int high= arr.length-1;
            int key=20;
            while(low<=high){
                int mid = (low+ high)/2;
                if (arr[mid] == key){
                    System.out.println("The element was found at "+ mid);
                    break;
                }
                else if(arr[mid]>key){
                    high = mid -1;
                }
                else {
                    low=mid +1; 
                }

            }
        }    
    }
