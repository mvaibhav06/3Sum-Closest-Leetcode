import java.util.Arrays;

public class ThreeSumClosest {
    public static int getClosestSum(int[] nums, int target){
        Arrays.sort(nums);
        int out_sum = Integer.MAX_VALUE;
        int out_diff = Integer.MAX_VALUE;

        for (int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;

            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == target) return 0;

                int diff = sum - target;
                if (Math.abs(diff) < Math.abs(out_diff)){
                    out_diff = diff;
                    out_sum = sum;
                }
                if (diff > 0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        return out_sum;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        System.out.println(getClosestSum(nums, 3));
    }
}
