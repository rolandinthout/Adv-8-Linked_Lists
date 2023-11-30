package nl.hva.miw.ads.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void add() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println(singlyLinkedList);

        singlyLinkedList.add(0, 400);
        singlyLinkedList.add(0, 100);
        singlyLinkedList.add(1, 200);
        singlyLinkedList.add(2, 300);
        singlyLinkedList.add(4, 500);

        String expected = "SinglyLinkedList{size=5} 100 200 300 400 500";
        String actual = singlyLinkedList.toString();
        assertEquals(expected, actual);
    }
}