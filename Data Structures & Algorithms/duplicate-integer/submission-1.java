public class Solution {

    private HashSet<Integer> has = new HashSet<>();

    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if (has.contains(nums[i])){
                return true;
            }


            has.add(nums[i]);
        }

        return false;
    }
}