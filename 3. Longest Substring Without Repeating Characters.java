https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

//1.Brute force
//each time we see a repeated character we know this sequence need to add as we dont need repeated characters. and then
//we count the size of existing sequence and move to next index to again start creating the sequence.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))) break;
                else set.add(s.charAt(j));
            }
            res = Math.max(res, set.size());
        }
        return res;
    }
}

//2.CharSet we just keep track of l (starting point of sequece)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l  = 0;
        Set<Character> charSet = new HashSet();

        for(int r  = 0; r < s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

//3.TODO: