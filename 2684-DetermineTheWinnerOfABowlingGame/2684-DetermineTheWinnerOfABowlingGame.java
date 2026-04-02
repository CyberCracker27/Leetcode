// Last updated: 02/04/2026, 07:35:06
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1=1,p2=1;
        int sum1=0,sum2=0;
        for(int i=0;i<player1.length;i++){
            if((i-1>=0 && player1[i-1]==10) || (i-2>=0 && player1[i-2]==10)){
                sum1=sum1+2*player1[i];
            }else{
                sum1+=player1[i];
            }
            if((i-1>=0 && player2[i-1]==10) || (i-2>=0 && player2[i-2]==10)){
                sum2=sum2+2*player2[i];
            }else{
                sum2+=player2[i];
            }
            
        }
        System.out.print(sum1+" "+sum2);
        if(sum1>sum2){
            return 1;
        }else if(sum1<sum2){
            return 2;
        }else{
            return 0;
        }
    }
}