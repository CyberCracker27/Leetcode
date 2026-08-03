// Last updated: 8/3/2026, 9:19:20 AM
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
17    private int sum=0;
18    public TreeNode convertBST(TreeNode root) {
19        if(root!=null){
20            convertBST(root.right);
21            sum+=root.val;
22            root.val=sum;
23            convertBST(root.left);
24        }
25        return root;
26    }
27}