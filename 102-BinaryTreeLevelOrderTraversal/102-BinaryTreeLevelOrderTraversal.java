// Last updated: 6/10/2026, 2:08:21 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        List<List<Integer>> f=new ArrayList();
20        List<Integer> temp1=new ArrayList<>();
21        if(root==null) return f;
22        temp1.add(root.val);
23        f.add(temp1);
24        q.offer(root);
25        while(!q.isEmpty()){
26            List<Integer> a=new ArrayList<>();
27            
28            int x=q.size();
29
30            for(int i=0;i<x;i++){
31                System.out.print("Hi");
32                TreeNode temp=q.poll();
33                if(temp.left!=null){
34                    q.offer(temp.left);
35                    a.add(temp.left.val);
36                }
37                if(temp.right!=null){
38                    q.offer(temp.right);
39                    a.add(temp.right.val);
40                }
41                 System.out.println(a+" "+temp.val);
42            }
43           
44            if(a.size()>0)
45            f.add(a);
46            a=new ArrayList<>();
47        }
48        return f;
49    }
50}