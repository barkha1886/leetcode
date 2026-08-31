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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;
        int first = -1;
        int present = -1;
        int minDist = Integer.MAX_VALUE;

        while(curr.next != null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
                if(first == -1){
                    first = index;
                }else{
                    minDist = Math.min(minDist, index-present);
                }
                present = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if(first== -1 || first == present){
            return ans;
        }
        ans[0] = minDist;
        ans[1] = present - first;
        return ans;
        
    }
}