// Last updated: 28/03/2026, 07:10:51
1class Solution {
2    public int isWinner(int[] player1, int[] player2) {
3        int p1=1,p2=1;
4        int sum1=0,sum2=0;
5        for(int i=0;i<player1.length;i++){
6            if((i-1>=0 && player1[i-1]==10) || (i-2>=0 && player1[i-2]==10)){
7                sum1=sum1+2*player1[i];
8            }else{
9                sum1+=player1[i];
10            }
11            if((i-1>=0 && player2[i-1]==10) || (i-2>=0 && player2[i-2]==10)){
12                sum2=sum2+2*player2[i];
13            }else{
14                sum2+=player2[i];
15            }
16            
17        }
18        System.out.print(sum1+" "+sum2);
19        if(sum1>sum2){
20            return 1;
21        }else if(sum1<sum2){
22            return 2;
23        }else{
24            return 0;
25        }
26    }
27}