https://leetcode.com/problems/valid-palindrome/description/

//check that function and make sure you understand all the whiles here

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            while(l < r && !isValidChar(s.charAt(l))){
                l++;
            }
            while(l < r && !isValidChar(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;

    }

    public boolean isValidChar(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >='0' && c<= '9')) return true;
        return false;
    }
}