// Last updated: 9/12/2026, 7:23:54 AM
class Solution {
    public int pivotInteger(int n) {
        int i=1,j=n,c=-1;
        int leftc=1,rightc=n;
        while(i<j){
            if(leftc<=rightc){
                i++;
                leftc+=i;
            }else{
                j--;
                rightc+=j;
            }
        }
        return (leftc==rightc)?i:-1;
    }
}