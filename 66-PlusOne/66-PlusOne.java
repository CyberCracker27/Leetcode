// Last updated: 21/01/2026, 22:11:17
class Solution {
    public int[] plusOne(int[] digits) {
        int c=digits.length;
        int temp[]=new int[c+1];
        if(digits[c-1]+1<10){
            digits[c-1]=digits[c-1]+1;
            temp=digits;
        }
        else{
            for(int i=c-1;i>=0;i--){
                temp[i]=digits[i];
                temp[c]=0;
                if(temp[i]<9){
                    temp=digits;
                    break;
                }
            }
            for(int i=c-1;i>=0;i--){
                if(temp[i]==9){
                    if(i==0){
                        temp[i]=1;
                    }else{
                        temp[i]=0;
                    }    
                }
                else{
                    temp[i]+=1;
                    break;
                }
            }
            
        }
        return temp;
    }
}