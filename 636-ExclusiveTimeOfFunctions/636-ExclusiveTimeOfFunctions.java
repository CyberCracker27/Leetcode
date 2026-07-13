// Last updated: 7/13/2026, 8:51:37 PM
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        int p=0;
        for(String s:logs){
            String part[]=s.split(":");
            int i=Integer.parseInt(part[0]);
            int t=Integer.parseInt(part[2]);
            if(part[1].equals("start")){
                if(!st.isEmpty()){
                    arr[st.peek()]+=t-p;
                }
                st.push(i);
                p=t;
            }else{
                arr[st.pop()]+=t-p+1;
                p=t+1;
            }
        }
        return arr;
    }
}