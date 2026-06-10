// Last updated: 6/10/2026, 1:28:26 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> li=new ArrayList<>();
19        rec(root,li);
20        return li;
21    }
22    public void rec(TreeNode root,List<Integer> li){
23        if(root==null) return;
24        li.add(root.val);
25        rec(root.left,li);
26        rec(root.right,li);
27    }
28}