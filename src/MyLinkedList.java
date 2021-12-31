public class MyLinkedList<E> {
    private Node<E> head;

    public void insertFirst(E value) {
        Node<E> firstNode = new Node<>(value);
        firstNode.next = head;
        head = firstNode;
    }

    public void insertLast(E value) {
        if (head == null) {
            head = new Node<>(value);
            return;
        }
        Node<E> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(value);
    }

    public int get(E value) {
        if (head == null) {
            return -1;
        }
        if (head.value == value){
            return 0;
        }
        Node<E> currentNode = head;
        int result = 0;
        while (currentNode.next != null){
            ++result;
            if (currentNode.next.value == value){
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void remove(E value) {
        if (head == null){
            return;
        }
        if (head.value == value){
            head = head.next;
            return;
        }
        Node<E> currentNode = head;
        while (currentNode.next != null){
            if (currentNode.next.value == value){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public int getLength() {
        int length = 0;
        Node<E> walkPointer = head;
        while (walkPointer.next != null) {
            walkPointer = walkPointer.next;
            length++;
        }
        return length;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
