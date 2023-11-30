package nl.hva.miw.ads.linkedlists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest {

    @Test
    public void add() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println(doublyLinkedList);

        doublyLinkedList.add(0, 400);
        doublyLinkedList.add(0, 100);
        doublyLinkedList.add(1, 200);
        doublyLinkedList.add(2, 300);
        doublyLinkedList.add(4, 500);

        String expected = "DoublyLinkedList{size=5} 100 200 300 400 500";
        String actual = doublyLinkedList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println(doublyLinkedList);

        doublyLinkedList.add(0, 400);
        doublyLinkedList.add(0, 100);
        doublyLinkedList.add(1, 200);
        doublyLinkedList.add(2, 300);
        doublyLinkedList.add(4, 500);

        doublyLinkedList.remove(0);
        String expected = "DoublyLinkedList{size=4} 200 300 400 500";
        String actual = doublyLinkedList.toString();
        assertEquals(expected, actual);

        doublyLinkedList.remove(3);
        expected = "DoublyLinkedList{size=3} 200 300 400";
        actual = doublyLinkedList.toString();
        assertEquals(expected, actual);

        doublyLinkedList.remove(1);
        expected = "DoublyLinkedList{size=2} 200 400";
        actual = doublyLinkedList.toString();
        assertEquals(expected, actual);

        doublyLinkedList.remove(1);
        expected = "DoublyLinkedList{size=1} 200";
        actual = doublyLinkedList.toString();
        assertEquals(expected, actual);

        doublyLinkedList.remove(0);
        expected = "DoublyLinkedList{size=0}";
        actual = doublyLinkedList.toString();
        assertEquals(expected, actual);
    }
}
