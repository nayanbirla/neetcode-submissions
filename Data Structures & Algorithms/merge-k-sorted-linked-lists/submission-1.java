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
    public ListNode mergeKLists(ListNode[] lists) {
         
        if(lists==null || lists.length==0) return null;

        PriorityQueue<ListNode> minHeap =new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
            minHeap.add(lists[i]);
        }

        ListNode head=null,curr=null;  
        while(!minHeap.isEmpty()){
             
            ListNode curr1= minHeap.poll();
            if(head==null){
                head=curr1;
                curr=curr1;
            }else{
                curr.next=curr1;
                curr=curr.next;
            }
            if(curr1.next!=null) 
            minHeap.add(curr1.next);
        }

        return head;
    }
}
