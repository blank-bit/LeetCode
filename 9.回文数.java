/*********************************************
 @Author       : Mr.Wang
 @Date         : 2021-03-23 19:50:48
 @FilePath     : /9.回文数.java
 @Description  : message
*********************************************/
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int m = x;
        if (m < 0)
            return false;
        long n = 0;
        while (m != 0) {
            n = n * 10 + m % 10;
            m /= 10;
        }
        return n == x ? true : false;
    }
}
// @lc code=end
