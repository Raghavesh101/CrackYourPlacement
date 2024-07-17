package DSA.ArshGoyalSheet;
// implementation of quicksort:

public class SortColors {
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static int partition(int[] nums, int start, int end){
        int pivot = nums[end];
        int i = start-1;
        for(int j = start;j<=end-1;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums, i + 1, end);
        return (i + 1);
    }
    public static void quicksort(int[] nums, int start, int end){
        if (start < end) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(nums, start, end);

            // Separately sort elements before
            // partition and after partition
            quicksort(nums, start, pi - 1);
            quicksort(nums, pi + 1, end);
        }

    }
    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quicksort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        for(int i: arr){
            System.out.print(i+" ");
        }

    }
}
