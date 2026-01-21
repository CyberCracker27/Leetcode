// Last updated: 21/01/2026, 22:09:56
class Solution {
    public int[] dailyTemperatures(int[] t) {
       int a[]=new int[t.length];
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<t.length;i++){
            while(!s.isEmpty() && t[s.peek()]<t[i]){
                a[s.peek()]=i-s.pop();
            }
            s.push(i);
        }
        return a;
    }
}