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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode ptr = ans;
        int carry = 0;
        while( l1!=null || l2!=null )
        {
            int sum = 0 + carry;
            if(l1 != null){
                sum = sum +l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10; //if sum = 18 then this return 1 to carry
            sum = sum % 10; //if sum = 18 then this return 8 to sum
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        } 
        if(carry != 0){
            ptr.next = new ListNode(carry);
            ptr = ptr.next;
        }
        return ans.next; //ans.next because we create linkedlist with 0 value first node in starting
    }
}