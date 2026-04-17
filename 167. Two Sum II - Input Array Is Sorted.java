https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r){
            int total = numbers[l] + numbers[r];

            if(total > target){
                r--;
            }
            else if(total < target) l++;
            else {
                int res[] = new int[2];
                res[0] = ++l;
                res[1] = ++r;
                return res;
            }
        }
        return null;
    }
}