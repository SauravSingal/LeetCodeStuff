https://leetcode.com/problems/two-sum/

//1. Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}

//2.Hahmap use.. please note map.containsKey() funciton
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int[] res = new int[2];
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i] , i);
        }
        return null;
    }
}
/*
⚠️ Important difference vs containsKey()
Method	            Performance	        How it works
containsKey()	    ⚡ O(1)	            Uses hashing
containsValue()	    🐢 O(n)	            Iterates all entries

👉 So avoid containsValue() in performance-critical code—it scans the whole map.
 */
