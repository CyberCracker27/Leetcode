// Last updated: 8/14/2026, 7:10:05 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public int maxDepth(Node root) {
22        if(root==null){
23            return 0;
24        }
25        int max=1;
26        for(Node child:root.children){
27            max=Math.max(max,1+maxDepth(child));
28        }
29        return max;
30    }
31}