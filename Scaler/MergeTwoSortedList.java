public class MergeTwoSortedList {

    static class MyNode{
        int data;
        MyNode next;

        MyNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class MergeList{
        public MyNode merge(MyNode l1, MyNode l2){
            MyNode dummy = new MyNode(-1);
            MyNode temp = dummy;
            while (l1 != null && l2 != null) {
                if (l1.data < l2.data) {
                    dummy.next = l1;
                    l1 = l1.next;
                } else {
                    dummy.next=l2;
                    l2 = l2.next;
                }

                dummy = dummy.next;
            }

            if(l1!=null){
                dummy.next = l1;
            } else {
                dummy.next = l2;
            }
            return temp.next;
        }

        public void printList(MyNode n){
            while(n!=null){
                System.out.println(n.data);
                n = n.next;
            }
        }
    }

    public static void main(String[] args) {
        MyNode l1 = new MyNode(10);
        l1.next = new MyNode(20);
        l1.next.next = new MyNode(70);

        MyNode l2 = new MyNode(9);
        l2.next = new MyNode(15);
        l2.next.next = new MyNode(30);

        MergeList list = new MergeList();
        MyNode temp = list.merge(l1, l2);
        list.printList(temp);

    }
}
