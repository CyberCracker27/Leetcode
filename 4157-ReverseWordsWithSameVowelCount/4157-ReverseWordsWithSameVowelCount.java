// Last updated: 21/01/2026, 22:08:03
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String firstWord = words[0];
        int vowelCount = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            if ("aeiou".contains(String.valueOf(firstWord.charAt(i)))) {
                vowelCount++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if ("aeiouAEIOU".contains(String.valueOf(words[i].charAt(j)))) {
                    count++;
                }
            }
            if (count == vowelCount && i != 0) {
                StringBuilder temp = new StringBuilder(words[i]);
                result.append(temp.reverse().toString());
            } else {
                result.append(words[i]);
            }
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
