



public class AddTwoNumbers{
    public static void main(String[] args) {
        AddTwoNumbers n  = new AddTwoNumbers();
        ListNode result = n.add(new ListNode(7), new ListNode(7));
        System.out.println(result);
    }
    public ListNode add(ListNode l1, ListNode l2){

        ListNode l3 = new ListNode();
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            l3.next = new ListNode(carry % 10);
            carry = carry / 10;
        }
        return l3.next;
    }

}
