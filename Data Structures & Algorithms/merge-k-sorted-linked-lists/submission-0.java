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
        
        ListNode head=null;
        ListNode curr=null;

        while(true){
            int idx=-1;

            ListNode small=null;

            for(int i=idx+1;i<lists.length;i++){
                if(lists[i]!=null){
                    small=lists[i];
                    idx=i;
                    break;
                }
            }

            if(idx==-1) break;

            for(int i=idx+1;i<lists.length;i++){
                if(lists[i]!=null && lists[i].val<small.val){
                    small= lists[i];
                    idx=i;
                }
            }

            if(head==null){
                head=small;
                curr=small;
            }else{
                curr.next=small;
                curr=curr.next;
            }

            lists[idx]=lists[idx].next;
        }
        return head;
    }
}
