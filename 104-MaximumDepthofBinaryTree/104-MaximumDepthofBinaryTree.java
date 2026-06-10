// Last updated: 6/10/2026, 2:41:28 PM
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>> f=new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        List<Integer> temp1=new ArrayList<>();
21        if(root==null) return f;
22        temp1.add(root.val);
23        f.add(temp1);
24        q.offer(root);
25        while(!q.isEmpty()){
26            List<Integer> temp=new ArrayList<>();
27            int x=q.size();
28            for(int i=0;i<x;i++){
29                TreeNode t=q.poll();
30                if(t.left!=null){
31                    q.offer(t.left);
32                    temp.add(t.left.val);
33                }
34                if(t.right!=null){
35                    q.offer(t.right);
36                    temp.add(t.right.val);
37                }
38            }
39            if(temp.size()>0) f.add(temp);
40        }
41        Collections.reverse(f);
42        return f;
43    }
44}