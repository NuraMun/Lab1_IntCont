package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестовый класс для проверки функциональности класса IntCont.
 * Содержит unit-тесты для основных операций контейнера целых чисел.
 */
class IntContTest {
    private IntCont container;

    /**
     * Создание нового пустого экземпляра IntCont.
     */
    @BeforeEach
    void setUp() {
        container = new IntCont();
    }

    /**
     * Тест операции добавления и получения элементов.
     * Проверяется, что добавленные элементы можно корректно получить по индексу.
     */
    @Test
    void testAddAndGet() {
        container.add(10);
        container.add(20);
        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
    }

    /**
     * Тест операцию удаления элемента.
     * Проверяется корректность удаления элемента из середины контейнера
     * и последующее состояние контейнера.
     */
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

    /**
     * Тест метода получения размера контейнера.
     * Проверяется корректность работы метода size() при пустом контейнере
     * и после добавления элементов.
     */
    @Test
    void testSize() {
        assertEquals(0, container.size());
        container.add(10);
        assertEquals(1, container.size());
    }

    /**
     * Тест обработки исключения при попытке получения элемента
     * по несуществующему индексу в пустом контейнере.
     */
    @Test
    void testGetOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
    }

    /**
     * Тест обработки исключения при попытке удаления элемента
     * по несуществующему индексу в пустом контейнере.
     */
    @Test
    void testRemoveOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }
}