// Last updated: 21/01/2026, 22:08:34
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes){
            return k;
        }
        if(k<=(numOnes+numZeros)){
            return numOnes;
        }
        else{
            return numOnes-(k-numZeros-numOnes);
        }
    }
}