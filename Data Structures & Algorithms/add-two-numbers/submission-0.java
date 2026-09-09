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
        int carry=0;
        ListNode head=null,curr=null;

        while(l1!=null && l2!=null){
             
             int currSum = carry+l1.val+l2.val;

             carry = currSum/10;

             ListNode ans=new ListNode(currSum%10);

             if(head==null){
                head=ans;
                curr=ans;
             }else{
                curr.next=ans;
                curr=curr.next;
             }
             l1=l1.next;
             l2=l2.next;
        }

        if(l1==null && l2!=null){
            while(l2!=null){
                int currSum = carry + l2.val;
                carry = currSum/10;
                ListNode ans=new ListNode(currSum%10);
                curr.next=ans;
                curr=curr.next;
                l2=l2.next;
            }
        }else if(l1!=null && l2==null){
            while(l1!=null){
                int currSum = carry + l1.val;
                carry = currSum/10;
                ListNode ans=new ListNode(currSum%10);
                curr.next=ans;
                curr=curr.next;
                l1=l1.next;
            }
        }

        if(carry!=0){
            ListNode ans=new ListNode(carry);
            curr.next=ans;
        }
        return head;
    }
}
