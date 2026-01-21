// Last updated: 21/01/2026, 22:09:57
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i>0 && i<10){
                ls.add(i);
            }else{
                int temp=i;
                boolean a=true;
                while(temp!=0){
                    if((temp%10)==0){
                        a=false;
                        break;
                    }else{
                        if(i%(temp%10)!=0){
                            a=false;
                            break;
                        }
                    }
                    temp/=10;
                }
                if(a){
                    ls.add(i);
                }
            }
        }
        return ls;
    }
}