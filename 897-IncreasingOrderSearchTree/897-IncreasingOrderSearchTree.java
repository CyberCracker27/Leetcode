// Last updated: 10/31/2026, 9:04:28 AM
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
17    TreeNode ans=new TreeNode(0);
18    public TreeNode increasingBST(TreeNode root) {
19        TreeNode temp=ans;
20        Inorder(root);
21        return temp.right;
22    }
23    public void Inorder(TreeNode root){
24        if(root==null){
25            return;
26        }
27        Inorder(root.left);
28        ans.right=root;
29        root.left=null;
30        ans=ans.right;
31        Inorder(root.right);
32        
33    }
34}