/*********************************************
 * @Author : Mr.Wang
 * @Date : 2020-12-25 14:08:49
 @FilePath     : /1.两数之和.java
 * @Description : message
 *********************************************/
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // if (target < nums[i])
            //     continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    r[0] = i;
                    r[1] = j;
                }
            }
        }
        return r;
    }
}
// @lc code=end
