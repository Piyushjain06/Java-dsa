public class bubble {
    // Bubble sort time complexity is O(n^2)
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap=0;// optimized bubble sort 
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
            }
             if (swap ==0){
            break;
        }
        }
       
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};

        // Print original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        bubblesort(arr);
        System.out.println();
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}