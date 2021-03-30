/*********************************************
 @Author       : Mr.Wang
 @Date         : 2021-03-29 19:46:42
 @FilePath     : /96.不同的二叉搜索树.c
 @Description  : message
*********************************************/
/*
 * @lc app=leetcode.cn id=96 lang=c
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start

int numTrees(int n)
{
     int G[n + 1];
     memset(G, 0, sizeof(G));
     G[0] = G[1] = 1;
     for (int i = 2; i <= n; i++)
     {
          for (int j = 1; j <= i; j++)
               G[i] += G[j - 1] * G[i - j];
     }

     return G[n];
}
// @lc code=end
