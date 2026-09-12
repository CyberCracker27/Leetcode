// Last updated: 9/12/2026, 7:17:46 AM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> a=new ArrayList<>();
        for(Integer b:bulbs){
            boolean c=a.remove(b);
            if(!c){
                a.add(b);
            }
        }
        Collections.sort(a);
        return a;
    }
}