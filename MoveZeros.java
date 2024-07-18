package DSA.ArshGoyalSheet;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, b = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                arr[b++] = nums[i];
            }
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = arr[j];
        }
    }
}
