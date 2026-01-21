// Last updated: 21/01/2026, 22:11:08
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split("\\s+");
        List<String> d=Arrays.asList(a);
        Collections.reverse(d);
        return String.join(" ",a);
    }
}