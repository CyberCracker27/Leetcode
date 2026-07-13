// Last updated: 7/13/2026, 8:53:58 PM
class Solution {
    public int evalRPN(String[] tokens) {
        int c=0;
        Deque<Integer> s=new ArrayDeque<>();
        for(String i:tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int b=s.pop();
                int a=s.pop();
                if(i.equals("+")){
                    c=a+b;
                }else if(i.equals("-") ){
                    c=a-b;
                }else if(i.equals("*")){
                    c=a*b;
                }else{
                    c=a/b;
                }
                s.push(c);

            }else{
                s.push(Integer.valueOf(i));
            }
        }
        return (tokens.length>1)?c:Integer.valueOf(tokens[0]);
    }
}