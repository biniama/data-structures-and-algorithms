public class LinkedList {

    public static class Node {

        Integer value;

        Node next;

        public Integer getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public String toString() {
            return value.toString();
        }
    }

    Node first;
    Node last;
    Integer length = 0;

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.appendFirst(3);

        System.out.println(linkedList.first);

        while (linkedList.first.next != null) {
            System.out.println(linkedList.first.next);
        }
    }

    public static Node createNode() {
        return new Node();
    }

    public void appendFirst(Integer value) {

        Node node = createNode();
        node.value = value;

        if (first == null) {
            first = node;
        }

        if (last == null) {
            last = node;
        }
            first.next = last;


        length++;
    }

    public void appendLast(Integer value) {

        Node node = createNode();

        node.value = value;

        last = node;
        first = node;
        first.next = last;

        length++;
    }


}
