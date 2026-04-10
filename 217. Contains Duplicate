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