// Last updated: 6/13/2026, 4:11:17 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    HashMap<Node,Node> map=new HashMap<>();
23    public Node cloneGraph(Node node) {
24        if(node==null) return null;
25        if(map.containsKey(node)){
26            return map.get(node);
27        }
28        Node temp=new Node(node.val);
29        map.put(node,temp);
30        for(Node t:node.neighbors){
31            temp.neighbors.add(cloneGraph(t));
32        }
33        return temp;
34    }
35}