//1. Set use case
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int n : nums){
            if(set.contains(n)) return true;
            else set.add(n);
        }
        return false; 

    }
}


//2.Just set Check length
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int n : nums){
           set.add(n);
        }
        return set.size() < nums.length;

    }
}

//3. Just sort
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        for(int i = 0; i < len - 1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;

    }
}