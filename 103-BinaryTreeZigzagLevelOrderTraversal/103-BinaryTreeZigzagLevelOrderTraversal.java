// Last updated: 6/11/2026, 1:48:49 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> f=new ArrayList<>();
19        if(root==null){
20            return f;
21        }
22        Queue<TreeNode> q=new LinkedList<>();
23        List<Integer> temp1=new ArrayList<>();
24        temp1.add(root.val);
25        f.add(temp1);
26        int c=0;
27        q.offer(root);
28        while(!q.isEmpty()){
29            c++;
30            List<Integer> temp=new ArrayList<>();
31            int x=q.size();
32            for(int i=0;i<x;i++){
33                TreeNode t=q.poll(); 
34                if(t.left!=null){
35                    q.offer(t.left);
36                    temp.add(t.left.val);
37                }
38                if(t.right!=null){
39                    q.offer(t.right);
40                    temp.add(t.right.val);
41                }
42            }
43            if(c%2!=0){
44                Collections.reverse(temp);
45            }
46            if(temp.size()>0)
47            f.add(temp);
48        }
49        return f;
50    }
51}