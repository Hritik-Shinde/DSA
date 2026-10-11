/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        // reverse the second link list
        
        ListNode prev = null;
        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second  = temp;
        }

        // now start mergenging the linklist
        ListNode first = head;
        while(prev != null){
            ListNode temp1 = first.next;
            ListNode temp2 = prev.next;

            first.next = prev;
            prev.next = temp1;

            first = temp1;
            prev = temp2; 
        }
    }
}