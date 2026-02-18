/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         // hashmap -- s.c-0(n), t.c - 0(n)
          /*floyd's algorithm (fast [2 steps] and slow pointers[1 step]) -- optimal  
          => s.c-0(1) , T.c - (n) */
          /*If cycle is detected then there is situation where two pointers will be  at a same position */

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
             slow = slow.next;
             fast = fast.next.next;
             if(slow==fast) return true; 
        }
      return false;  
    }
}