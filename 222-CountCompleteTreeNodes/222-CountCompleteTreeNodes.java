// Last updated: 6/11/2026, 10:16:52 AM
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
17    public int countNodes(TreeNode root) {
18        if(root==null) return 0;
19        Queue<TreeNode> q=new LinkedList<>();
20        int c=1;
21        q.offer(root);
22        while(!q.isEmpty()){
23            TreeNode temp=q.poll();
24            if(temp.left!=null){
25                q.offer(temp.left);
26                c++;
27
28            }if(temp.right!=null){
29                q.offer(temp.right);
30                c++;
31            }
32        }
33        return c;
34    }
35}