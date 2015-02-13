public class Solution{
  public ListNode addTwoNumbers(ListNode p1, ListNode p2){
    int carry = 0; //used for carry the one digit value caculated each time
                   //from two ListNode
    
    ListNode l1 = p1;
    ListNode l2 = p2;
    
    ListNode newHead = new ListNode(0); //create head node with the dummy value 0
    ListNode l3 = newHead; //创建newHead的原因是l3会跟着指针走最后走到末尾，而return要从头开始
                            //newHead是不变的所以最后输出可以直接使用
    
    while(l1 != null || l2 != null){
      if(l1 != null){
        carry += l1.val; //get the value from the node
        l1 = l1.next  // move to the next node
      }
      if(l2 != null){
        carry += l2.val;
        l2 = l2.next;
      }
      
      //after retrieve the sum in carry, save it the new ListNode l3
      l3.next = new ListNode(carry%10); //the value now is saved in the next l3 node since the first is dummy
      l3 = l3.next
      carry /= 10; //if the sum is 10 then it will save the "1" in carry for next round
    }
    
    if(carry==1)
      l3.next = new ListNode(1); //if the last digits sum is 10, then add one more node to the l3
    
    return newHead.next;
      
  }
}
