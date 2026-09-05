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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           
          int length = findLength(head); 
          if(n==length) return head.next;
          if(n>length) return head;
          length-=(n+1);  
          ListNode curr=head;
          while(length>0){
             curr=curr.next;
             length--;
          }
 

          curr.next=curr.next.next;

          return head; 
          
    }


    int findLength(ListNode curr){
        int count=0;

        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
}
