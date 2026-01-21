// Last updated: 21/01/2026, 22:10:21
class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Character[] c = new Character[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        LinkedList<Character> f=new LinkedList<>(Arrays.asList(c));
        for(int i=0;i<b.length;i++){
            Character e=b[i];
            boolean g=f.remove(e);
            if(!g){
                return b[i];
            }
        }
        return ' ';
    }
}