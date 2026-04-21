https://leetcode.com/problems/linked-list-cycle/description/

//1. hash set. good sol
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet();

        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}

//2.Tortoise and hare logic
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return true;

        }
        return false;
    }
}