// Last updated: 6/11/2026, 11:53:04 AM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root==null) return null;
19        if(root.val==key){
20            if(root.right==null && root.left==null){
21                return root=null;
22            }else if(root.left!=null && root.right==null){
23                return root=root.left;
24            }else{
25                if(root.left==null) return root=root.right;
26                else{
27                    TreeNode temp=find_Min(root.right);
28                    temp.left=root.left;
29                    return root=root.right;
30
31                }
32            }
33        }else if(root.val>key){
34            root.left=deleteNode(root.left,key) ;
35        }else{
36            root.right=deleteNode(root.right,key);
37        }
38        return root;
39    }
40    public TreeNode find_Min(TreeNode root){
41        while(root.left!=null){
42            root=root.left;
43        }
44        return root;
45    }
46}