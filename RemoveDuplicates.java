package DSA.ArshGoyalSheet;

public class RemoveDuplicates {
    public static int findDuplicate(int[] arr) {
        int answer = 0;
        int n = arr.length;

        // XOR all the elements with 0
        for (int i = 0; i < n; i++) {
            answer = answer ^ arr[i];
        }

        // XOR all the elements with no from 1 to n
        // i.e   answer^0 = answer
        for (int i = 1; i < n; i++) {
            answer = answer ^ i;
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1};
        System.out.println(findDuplicate(arr));
    }

}