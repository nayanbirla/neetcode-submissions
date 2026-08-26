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
        if(head==null) return;

        int length = lenOfList(head);

        ListNode curr=head;
        if(length%2==0)
        length=(length/2)-1;
        else
        length=length/2;
        while(length>0){
            ListNode lastNode=curr;
            ListNode prev=null;
            while(lastNode.next!=null){
                prev=lastNode;
                lastNode=lastNode.next;
            }
            prev.next=null;
            ListNode next=curr.next;
            curr.next=lastNode;
            lastNode.next=next;
            curr=next; 
            length--;   
        }

    }

    int lenOfList(ListNode curr){
        int count=0;

        while(curr!=null){
            count++;
            curr=curr.next;
        }

        return count;
    }
}
