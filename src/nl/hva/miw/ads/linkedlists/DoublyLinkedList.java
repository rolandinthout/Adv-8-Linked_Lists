package nl.hva.miw.ads.linkedlists;

/**
 * Doubly linked list.
 * @author roland
 */
public class DoublyLinkedList {

    private class Node {
        int value;

        Node next=null;      // Link to next node
        Node prev=null;      // Link to previous node

        public Node(int value) {
            this.value = value;
        }
    }

    private int size = 0;           // Length of list
    private Node head = null;      // Link to first node

    public DoublyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    /**
     * Return the value in the list at position index.
     *
     * @param index
     * @return
     */
    public int get(int index) {
        Node current = head;
        for (int count=0; count < index; count++ ) {
            current = current.next;
        }
        return current.value;
    }

    /**
     * Add an element to the list at position index.
     *
     * @param index
     * @param value
     */
    public void add(int index, int value) {
        // Implement, create a new Node for this entry.
        Node newNode = new Node(value);

        // Don't forget to increment the size of the list
        size++;

        // The simple case is if we add a new head (index == 0)
        if (index == 0) {
            // If head exists, it should point back to this new node
            if (head != null) {
                head.prev = newNode;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        // Otherwise, follow the next-pointer as many times as necessary to get to the node at requested index,
        // but stop one entry before that!
        Node current = head;
        for (int count = 0; count < index - 1; count++) {
            current = current.next;
        }

        // Now insert the new node after the current
        newNode.next = current.next;
        newNode.prev = current;
        // If there is a next node, then it should point back to this new node.
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }


    /**
     * Remove an elmeent from the list at position index, if it exists.
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        size--;

        Node current = head;
        for (int count=0; count < index; count++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        if (index == 0) {
            head = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("DoublyLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while (current != null) {
            stringBuffer.append(" ");
            stringBuffer.append(current.value);
            current = current.next;
        }

        return stringBuffer.toString();
    }

}
