import java.util.ArrayList;
import java.util.List;

/*********************************************
 @Author       : Mr.Wang
 @Date         : 2020-12-25 13:50:33
 @FilePath     : /94.二叉树的中序遍历.java
 @Description  : message
*********************************************/
/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public List<Integer> inorder(TreeNode root, List<Integer> list) {
    if (root == null)
      return list;
    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
    return list;
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    list = inorder(root, list);
    return list;
  }
}
// @lc code=end
