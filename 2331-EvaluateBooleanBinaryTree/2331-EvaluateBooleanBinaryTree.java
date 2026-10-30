// Last updated: 10/30/2026, 6:38:08 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean evaluateTree(TreeNode root) {
18        return helper(root);
19    }
20    public boolean helper(TreeNode root){
21        if(root.val==0 || root.val==1){
22            return root.val==1;
23        }
24        else if(root.val==2){
25            return helper(root.left) || helper(root.right);
26        }
27        else if(root.val==3){
28            return helper(root.left) && helper(root.right);
29        }
30
31        return false;
32    }
33}