package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntContTest {
    private IntCont container;

    @BeforeEach
    void setUp() {
        container = new IntCont();
    }

    @Test
    void testAddAndGet() {
        container.add(10);
        container.add(20);
        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
    }
    @Test
    void testRemove() {
        container.add(10);
        container.add(20);
        container.add(30);
        container.remove(1);
        assertEquals(10, container.get(0));
        assertEquals(30, container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    void testSize() {
        assertEquals(0, container.size());
        container.add(10);
        assertEquals(1, container.size());
    }

    @Test
    void testGetOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
    }

    @Test
    void testRemoveOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }
}