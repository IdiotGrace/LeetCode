/**
 * Remove all elements from a linked list of integers that have value val.

   Example
   Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
   Return: 1 --> 2 --> 3 --> 4 --> 5
 * @author 文超
 * @date 2015-11-10
 * TODO https://leetcode.com/problems/remove-linked-list-elements/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
    	ListNode now = new ListNode(0);
    	now.next = head;
    	ListNode n = now;
    	while(n.next!=null){
    		if(n.next.val==val){
    			ListNode next = n.next;
    			n.next = next.next;
    		}else{
    			n = n.next;
    		}
    		
    	}
		return now.next;
    }
    
    public static void main(String[] args){
    	
    }
}
