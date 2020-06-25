public class Add2Nums{
public static void main (String args[]){
    //create list nodes
    //starting from end due to data structure of list node
    ListNode list1pos2 = new ListNode(3);
    ListNode list2pos2 = new ListNode(4);
    ListNode list1pos1 = new ListNode(4,list1pos2);
    ListNode list2pos1 = new ListNode(6,list2pos2);
    ListNode list1pos0 = new ListNode(2,list1pos1);
    ListNode list2pos0 = new ListNode(5,list2pos1);

    //printing list nodes
    //pointer list nodes
    ListNode list1pointer = list1pos0;
    ListNode list2pointer = list2pos0;

    System.out.println("List1");
    while (list1pointer != null){
        System.out.print(list1pointer.val);
        if (list1pointer.next != null){
            System.out.print(" -> ");
            list1pointer = list1pointer.next;
        } else {
            break;
        }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("List2");
    while (list2pointer != null){
        System.out.print(list2pointer.val);
        if (list2pointer.next != null){
            System.out.print(" -> ");
            list2pointer = list2pointer.next;
        } else {
            break;
        }
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Summation of two reverse ordered lists: "+ addTwoNumbers(list1pos0, list2pos0));

}
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode answer = new ListNode(0);
    ListNode dummy = answer;
    int stage = 1;
    ListNode list1cur = l1;
    ListNode list2cur = l2;
    int carry = 0;
    //while both lists are not null
    while (list1cur != null || list2cur != null){
        int l1toadd = (list1cur == null) ? 0 : list1cur.val;
        int l2toadd = (list2cur == null) ? 0 : list2cur.val;
        int sum = carry + l1toadd + l2toadd;
        carry = sum/10;

        System.out.println(sum%10);
        answer.next = new ListNode(sum%10);
        answer = answer.next;
        
       
        if (list1cur != null){
            list1cur = list1cur.next;
        }
        if (list2cur != null){
            list2cur = list2cur.next;
        }
    }
    if (carry > 0){
        answer.next = new ListNode(carry);
    }
    // For printing answer
    System.out.println("Answer");
    while (dummy != null){
        System.out.print(dummy.val);
        if (dummy.next != null){
            System.out.print(" -> ");
            dummy = dummy.next;
        } else {
            break;
        }
    }
    
    return dummy.next;

}
}