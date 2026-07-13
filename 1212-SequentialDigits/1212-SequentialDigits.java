// Last updated: 7/13/2026, 8:50:36 PM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li=new ArrayList<>();
        String s="123456789";
        String l=String.valueOf(low);
        String h=String.valueOf(high);
        for(int len=l.length();len<=h.length();len++){
            for(int start=0;start<=9-len;start++){
                int a=Integer.parseInt(s.substring(start,start + len));
                    if(a>=low && a<=high){
                        li.add(a);
                    }
            }
        }
        return li;
    }
}