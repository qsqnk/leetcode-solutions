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
    public ListNode partition(ListNode head, int x) {
        var dummy1 = new ListNode(0);
        var dummy2 = new ListNode(0);
        var lower = dummy1;
        var higher = dummy2;
        for (var cur = head; cur != null; cur = cur.next) {
            var newNode = new ListNode(cur.val);
            if (newNode.val < x) {
                lower.next = newNode;
                lower = newNode;
            } else {
                higher.next = newNode;
                higher = newNode;
            }
        }
        lower.next = dummy2.next;
        return dummy1.next;
    }
}