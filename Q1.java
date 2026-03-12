class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SearchElement {

    static boolean search(Node head, int x) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == x)
                return true;

            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int x = 14;

        if (search(head, x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}