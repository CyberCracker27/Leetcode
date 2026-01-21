// Last updated: 21/01/2026, 22:08:19
class Solution {
    public String winningPlayer(int x, int y) {
        int turn=1;
        while(x>=1 && y>=4){
            x-=1;
            y-=4;
            turn++;
        }
        if(turn%2==0){
            return "Alice";
        }else{
            return "Bob";
        }
    }
}