https://leetcode.com/problems/group-anagrams

//1. Sort(Char[] -> String) HashMap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap();
        //sorted string(key) : actual value which we wiill return.
        for(String s: strs){
            char[] sortCharArray = s.toCharArray();
            Arrays.sort(sortCharArray);
            String key = new String(sortCharArray);//IMP
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());//IMP
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
/*

Using char[] as a key is wrong.

    ❗ Why?
    Arrays in Java use reference equality, not content equality
    So even if two arrays have same characters → they won’t match as keys
    👉 This breaks your anagram grouping logic

    👉 Comparison is based on memory address, NOT content
 */