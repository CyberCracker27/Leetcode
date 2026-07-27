// Last updated: 7/27/2026, 7:19:51 AM
class Solution {
    public int maxProduct(int n) {
        List<Integer> li=new ArrayList<>();
        while(n!=0){
            li.add(n%10);
            n/=10;
        }
        int max=0;
        for(int i=0;i<li.size();i++){
            for(int j=i+1;j<li.size();j++){
                if(li.get(i)*li.get(j)>max){
                    max=li.get(i)*li.get(j);
                }
            }
        }
        return max;
    }
}