import java.util.ArrayList;
import java.util.Collections;


    // Example:-
    // You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

    // Merge all the linked-lists into one sorted linked-list and return it.
    
     
    
    // Example 1:
    
    // Input: lists = [[1,4,5],[1,3,4],[2,6]]
    // Output: [1,1,2,3,4,4,5,6]
    // Explanation: The linked-lists are:
    // [
    //   1->4->5,
    //   1->3->4,
    //   2->6
    // ]
    // merging them into one sorted list:
    // 1->1->2->3->4->4->5->6

    class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode itr = lists[i];
            while(itr != null){
                l.add(itr.val);
                itr = itr.next;
            }
        }
        if(n==0  || l.size()==0){
            return null;
        }
        Collections.sort(l);
        ListNode head = new ListNode(l.get(0));
        ListNode it = head;
        for(int i=1;i<l.size();i++){
            ListNode a = new ListNode(l.get(i));
            it.next = a;
            it = it.next;
        }
        it.next = null;
        return head;
    }
}

