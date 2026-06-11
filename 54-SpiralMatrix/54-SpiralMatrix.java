// Last updated: 6/11/2026, 2:08:58 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> f=new ArrayList<>();
19        if(root==null){
20            return f;
21        }
22        Queue<TreeNode> q=new LinkedList<>();
23        f.add(root.val);
24        int c=0;
25        q.offer(root);
26        while(!q.isEmpty()){
27            c++;
28            List<Integer> temp=new ArrayList<>();
29            int x=q.size();
30            for(int i=0;i<x;i++){
31                TreeNode t=q.poll(); 
32                if(t.left!=null){
33                    q.offer(t.left);
34                    temp.add(t.left.val);
35                }
36                if(t.right!=null){
37                    q.offer(t.right);
38                    temp.add(t.right.val);
39                }
40            }
41            if(temp.size()>0)
42            f.add(temp.get(temp.size()-1));
43        }
44        return f;
45    }
46}