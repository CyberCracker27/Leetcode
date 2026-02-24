// Last updated: 24/02/2026, 22:10:19
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