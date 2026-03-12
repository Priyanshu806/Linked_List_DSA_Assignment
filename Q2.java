class InsertNode {

    static void insertAfter(Node prevNode, int value) {

        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(value);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

}