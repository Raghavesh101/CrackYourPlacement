package DSA.ArshGoyalSheet;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
    public static void main(String[] args){
        Map<Integer,Integer> hmap = new HashMap<>();
        int[] nums = {1,3,4,2,2};
        for(int i = 0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                if(hmap.get(nums[i])>=1){
                    System.out.println(nums[i]);
                    break;
                }else{
                    int p = hmap.get(nums[i]);
                    p++;
                    hmap.put(nums[i],p);
                }
            }
            else{
                hmap.put(nums[i],1);
            }
        }
    }
}
