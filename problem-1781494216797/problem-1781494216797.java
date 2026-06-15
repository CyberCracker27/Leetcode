// Last updated: 6/15/2026, 9:00:16 AM
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
17    public int kthSmallest(TreeNode root, int k) {
18        List<Integer> li=new ArrayList<>();
19        rec(root,li);
20        Collections.sort(li);
21        return li.get(k-1);
22    }
23    public void rec(TreeNode root,List<Integer> li){
24        if(root==null) return;
25        li.add(root.val);
26        rec(root.left,li);
27        rec(root.right,li);
28    }
29}