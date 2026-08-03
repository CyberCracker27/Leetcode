// Last updated: 8/3/2026, 9:27:00 AM
class Solution {
    public String capitalizeTitle(String title) {
        String[] arr=title.split(" ");
        String s="";
        int i=0;
        for(String a:arr){
            String b=a.toLowerCase();
            if(b.length()<=2){
                arr[i++]=b;
            }else{
                arr[i++]=b.substring(0,1).toUpperCase()+b.substring(1);
            }
        }
        return String.join(" ",arr);
    }
}