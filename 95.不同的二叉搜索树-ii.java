/*********************************************
 @Author       : Mr.Wang
 @Date         : 2021-03-24 00:12:15
 @FilePath     : /95.不同的二叉搜索树-ii.java
 @Description  : message
*********************************************/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
        return null;

        return generateTree(1, n);
    }

    public List<TreeNode> generateTree(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();

        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        List<TreeNode> leftNodes = new ArrayList<>();
        List<TreeNode> rightNodes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            leftNodes = generateTree(start, i - 1);
            rightNodes = generateTree(i + 1, end);

            for(TreeNode left : leftNodes)
                for(TreeNode right : rightNodes)
                {
                    TreeNode curTree = new TreeNode(i);
                    curTree.left = left;
                    curTree.right = right;
                    allTrees.add(curTree);
                }
        }
        return allTrees;
    }
}
// @lc code=end
