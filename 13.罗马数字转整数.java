/*********************************************
 * @Author : Mr.Wang
 * @Date : 2021-03-23 20:17:27
 @FilePath     : /13.罗马数字转整数.java
 * @Description : message
 *********************************************/

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int i = 0, m = 0;
        char[] str = s.toCharArray();
        while (i < s.length() - 1) {//如果数组最后两个是组合，直接在此步完成所有计算；否则最后两个数依次相加
            if (str[i] == 'I' && str[i + 1] == 'V') {
                m += 4;
                i += 2;
            } else if (str[i] == 'I' && str[i + 1] == 'X') {
                m += 9;
                i += 2;
            } else if (str[i] == 'X' && str[i + 1] == 'L') {
                m += 40;
                i += 2;
            } else if (str[i] == 'X' && str[i + 1] == 'C') {
                m += 90;
                i += 2;
            } else if (str[i] == 'C' && str[i + 1] == 'D') {
                m += 400;
                i += 2;
            } else if (str[i] == 'C' && str[i + 1] == 'M') {
                m += 900;
                i += 2;
            } else if (str[i] == 'I') {
                m += 1;
                i++;
            } else if (str[i] == 'V') {
                m += 5;
                i++;
            } else if (str[i] == 'X') {
                m += 10;
                i++;
            } else if (str[i] == 'L') {
                m += 50;
                i++;
            } else if (str[i] == 'C') {
                m += 100;
                i++;
            } else if (str[i] == 'D') {
                m += 500;
                i++;
            } else if (str[i] == 'M') {
                m += 1000;
                i++;
            }
        }

        while (i < s.length()) {
            if (str[i] == 'I') {
                m += 1;
            } else if (str[i] == 'V') {
                m += 5;
            } else if (str[i] == 'X') {
                m += 10;
            } else if (str[i] == 'L') {
                m += 50;
            } else if (str[i] == 'C') {
                m += 100;
            } else if (str[i] == 'D') {
                m += 500;
            } else if (str[i] == 'M') {
                m += 1000;
            }
            i++;
        }
        return m;
    }
}
// @lc code=end
