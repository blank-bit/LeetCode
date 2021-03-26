
/*********************************************
 @Author       : Mr.Wang
 @Date         : 2021-03-22 21:14:28
 @FilePath     : /7.整数反转.java
 @Description  : message
*********************************************/
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {

        int count = 0, t;
        long m = 0;
        ArrayList<Integer> aList = new ArrayList<>(0);
        if (x == 0)
            return 0;

        int temp = x;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int e = count;

        while (e > 0) {
            t = (int) (x / Math.pow(10, e - 1));
            x %= Math.pow(10, e - 1);
            aList.add(t);
            e--;
        }

        for (; count > 0; count--) {
            m += aList.get(count - 1) * Math.pow(10, count - 1);
        }

        if (m > Integer.MAX_VALUE || m < Integer.MIN_VALUE)
            return 0;

        return (int) m;
    }
    // public int reverse(int x) {
    // long n = 0;
    // while (x != 0) {
    // n = n * 10 + x % 10;
    // x = x / 10;
    // }
    // return (int) (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE ? 0 : n);
    // }
}
// @lc code=end
