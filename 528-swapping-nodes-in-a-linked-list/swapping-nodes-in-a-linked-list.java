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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = new ListNode();
        start.next= head;
        ListNode s1= start;
        ListNode s2= start;
        ListNode f1= start;
        for(int i=1;i<=k;i++)
        {
            s1= s1.next;
            f1=f1.next;
        }
        while(f1!=null)
        {
            s2=s2.next;
            f1=f1.next;
        }

        int temp= s1.val;
        s1.val=s2.val;
        s2.val=temp;
        return start.next;
        
    }
}