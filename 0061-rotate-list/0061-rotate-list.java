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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode count = head;
        int len = 0;
        while(count.next!=null)
        {
            count = count.next;
            len++;
        }
        len++;
        k = k%len;
        ListNode tail = head;
        for(int i = 0; i<(len-k-1); i++)
        {
            tail = tail.next;
            
        }
        count.next = head;
        head = tail.next;
        tail.next = null;
        return head;
    }
}