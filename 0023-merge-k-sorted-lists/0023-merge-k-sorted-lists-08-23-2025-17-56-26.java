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
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null||lists.length==0)return null;
        PriorityQueue<ListNode> s=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            if(head!=null){
                s.add(head);
            }
        }
        ListNode d=new ListNode(0);
        ListNode c=d;
        while(!s.isEmpty()){
            ListNode n=s.poll();
            c.next=n;
            c=c.next;
            if(n.next!=null)
            {
                s.add(n.next);
            }
        }
        return d.next;
    }
}