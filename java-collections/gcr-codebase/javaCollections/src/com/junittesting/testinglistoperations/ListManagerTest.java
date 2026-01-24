package com.junittesting.testinglistoperations;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

// JUnit 4 test class for ListManager
public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        manager.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}
