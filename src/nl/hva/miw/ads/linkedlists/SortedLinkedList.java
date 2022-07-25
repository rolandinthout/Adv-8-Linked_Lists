package nl.hva.miw.ads.linkedlists;

/**
 * Sorted linked list.
 *
 * @author michel
 */
public class SortedLinkedList {

    private class Node {
        int value;

        Node next=null;      // Link to next node

        public Node(int value) {
            this.value = value;
        }
    }

    private int size = 0;           // Length of list
    private Node head = null;      // Link to first node

    public SortedLinkedList() {
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
    public int get( int index ) {
        return -1;
    }

    /**
     * Add an element to the list. Add it in sorted order.
     *
     * @param value
     */
    public void add( int value ) {
        // Implement, create a new Node for this entry, but keep the list sorted!.

        Node n = new Node( value );

        // Implement the rest
    }

    /**
     * Remove an elmeent from the list, if it exists, but keep the list sorted.
     *
     * @param value
     */
    public void remove( int value ) {
        // Implement, remove the corresponding node from the linked list.
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("SortedLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while ( current != null ) {
            sb.append(" ");
            sb.append( current.value );
            current = current.next;
        }

        return sb.toString();
    }
}
