package spring_introduction;


public class Example {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        int[] array = {4, 2, 5, 6, 1, 3, 9};
    }

    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //записываем значение головного узла в список
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        //Пока оба не пусты
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        //Если один из них пуст
        if(l1 != null){
            current.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current.next = l2;
            l2 = l2.next;
        }

        return temp.next;
    }
}



