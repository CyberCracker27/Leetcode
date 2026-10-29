// Last updated: 10/29/2026, 6:56:24 AM
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
17    public int rangeSumBST(TreeNode root, int low, int high) {
18        ArrayList<Integer> li=new ArrayList<>();
19        inorder(root,li,low,high);
20        int c=0;
21        for(int x:li){
22            c+=x;
23        }
24        return c;
25    }
26    public void inorder(TreeNode root,ArrayList<Integer> li,int low,int high){
27        if(root==null){
28            return;
29        }
30        inorder(root.left,li,low,high);
31        if(root.val>=low && root.val<=high){
32            li.add(root.val);
33        }
34        inorder(root.right,li,low,high);
35    }
36}