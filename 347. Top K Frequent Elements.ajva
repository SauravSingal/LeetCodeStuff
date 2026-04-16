https://leetcode.com/problems/top-k-frequent-elements/description/

//1. HashMap + fetching logic (Bucket Sort)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap(); //value, frequency
        List<Integer>[] listFreqArr = new List[nums.length + 1];// [ferequency] -> {valu1,value2.....}

        for(Integer num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Integer val: map.keySet()){
            int mapFreq = map.get(val);
            if(listFreqArr[mapFreq] == null){
                listFreqArr[mapFreq] = new ArrayList();
            }
            listFreqArr[mapFreq].add(val);
        }

        // below part is major understading
        int[] result = new int[k];
        int counter = 0;
        for(int i = listFreqArr.length - 1 ; i > 0 && counter < k ; i--){
            if(listFreqArr[i] != null){
                for(Integer vals: listFreqArr[i]){
                    result[counter++] = vals;
                }
            }
        }
        return result;

    }
}