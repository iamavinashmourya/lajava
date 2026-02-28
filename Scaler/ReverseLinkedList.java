public class ReverseLinkedList {
    static public class InnerReverseLinkedList {
        static class MyNode{
            int data;
            MyNode next;

            MyNode(int data){
                this.data = data;
                this.next = null;
            }
        }

        public MyNode reverse(MyNode head){
            MyNode prev = null;
            MyNode curr = head;
            MyNode next = null;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        public void printList(MyNode n){
            while(n!=null){
                System.out.println(n.data);
                n = n.next;
            }
        }
        
    }

    public static void main(String[] args) {
        ReverseLinkedList.InnerReverseLinkedList.MyNode head = new ReverseLinkedList.InnerReverseLinkedList.MyNode(10);
        head.next = new ReverseLinkedList.InnerReverseLinkedList.MyNode(20);
        head.next.next = new ReverseLinkedList.InnerReverseLinkedList.MyNode(30);

        InnerReverseLinkedList list = new InnerReverseLinkedList();
        ReverseLinkedList.InnerReverseLinkedList.MyNode temp = list.reverse(head);
        list.printList(temp);
    }
}
