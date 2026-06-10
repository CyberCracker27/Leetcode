// Last updated: 6/10/2026, 3:04:36 PM
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        Queue<TreeNode> q1=new LinkedList<>();
19        Queue<TreeNode> q2=new LinkedList<>();
20        if(p==null && q==null) return true;
21        if(p==null && q!=null) return false;
22        if(p!=null && q==null) return false;
23        if(p.val!=q.val) return false;
24
25        q1.offer(p);
26        q2.offer(q);
27        while(!q1.isEmpty()){
28            TreeNode t1=q1.poll();
29            TreeNode t2=q2.poll();
30            if(t1.left!=null && t2.left!=null){
31                if(t1.left.val!=t2.left.val) return false;
32                q1.offer(t1.left);
33                q2.offer(t2.left);
34            }
35            if(t1.right!=null && t2.right!=null){
36                if(t1.right.val!=t2.right.val) return false;
37                q1.offer(t1.right);
38                q2.offer(t2.right);
39            }   
40            if(t1.left==null && t2.left!=null){
41                return false;
42            }
43            if(t1.right==null && t2.right!=null){
44                return false;
45            }
46            if(t1.left!=null && t2.left==null){
47                return false;
48            }
49            if(t1.right!=null && t2.right==null){
50                return false;
51            }
52            
53
54        }
55        return true;
56    }
57}