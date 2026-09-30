/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false */

import java.util.*;
class anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()== t.length()){
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        boolean result = Arrays.equals(array1,array2);
        return result;
        }
        else{
            return false;
        }
      

    }
}