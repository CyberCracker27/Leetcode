// Last updated: 6/10/2026, 2:28:07 PM
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
17    public int maxDepth(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        if(root==null) return 0;
20        q.offer(root);
21        int c=0;
22        while(!q.isEmpty()){
23            c++;
24            int x=q.size();
25            for(int i=0;i<x;i++){
26                TreeNode temp=q.poll();
27                if(temp.left!=null){
28                    q.offer(temp.left);
29                }
30                if(temp.right!=null){
31                    q.offer(temp.right);
32                }
33            }
34        }
35        return c;
36    }
37}