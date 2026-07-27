// Last updated: 7/27/2026, 7:19:49 AM
class Solution {
    public String generateTag(String caption) {
        StringBuilder s=new StringBuilder();
        String arr[]=caption.trim().split("\\s+");
        s.append("#");
        for(int i=0;i<arr.length;i++){
            if(i==0){
                s.append(arr[i].toLowerCase());
            }else{
                s.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase());
            }
        }
        String fin=s.toString();
        if(fin.length()>100){
            return fin.substring(0,100);
        }
        return s.toString();
    }
}