public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.insertLast("B");
        System.out.println("LL - " +linkedList);
        linkedList.insertLast("C");
        System.out.println("LL - " + linkedList);
        linkedList.insertLast("D");
        System.out.println("LL - " + linkedList);
        linkedList.insertLast("E");
        System.out.println("LL - " + linkedList);
        linkedList.insertFirst("A");
        System.out.println("LL - " +linkedList);

        System.out.println("Index of element with index E - " + linkedList.get("E"));
        System.out.println("LL - " + linkedList);
        System.out.println("Index of element with index ZZZ - " + linkedList.get("ZZZ"));

        linkedList.remove("C");
        System.out.println("LL - " + linkedList);
    }
}
