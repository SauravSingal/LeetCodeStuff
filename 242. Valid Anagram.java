https://leetcode.com/problems/valid-anagram/

1.Sort and compare
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}

2. HashMap add 1 and minus 1
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(Integer i: map.values()){
            if (i != 0 ) return false;
        }
        return true;
    }
}

3.Removing all together
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        // count characters
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // reduce counts
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);

            // remove when count becomes 0
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}

*********************4.in fact why even remove the simplest form
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
        }

        // check all values are 0
        for (int val : map.values()) {
            if (val != 0) return false;
        }

        return true;
    }
}

**************5.Lets do everything in single for loop
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i), 0) - 1);
        }


        for(int i: map.values()) {
            if(i != 0) return false;
        }
        return true;
    }
}

