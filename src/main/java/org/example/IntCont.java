package org.example;
/**
 * Класс IntCont представляет собой контейнер для хранения целых чисел.
 * Контейнер позваляет получать, добавлять и удалять элементы,
 * а также автоматически увеличивать вместимость при необходимости.
 */

public class IntCont{
    private int[] elements;
    private int size;

    /**
     * Создание нового пустой контейнера с начальной вместимостью на 10 элементов.
     */
    public IntCont() {
        this.elements = new int[10];
        this.size = 0;
    }

    /**
     * Добавление элемента в контейнер.
     * Если текущий размер равен вместимости, контейнер автоматически увеличивается.
     *
     * @param element целое число для добавления в контейнер
     */
    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    /**
     * Извлечение элемента по указанному индексу.
     *
     * @param index индекс элемента, который нужно вернуть
     * @return элемент по указанному индексу
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    /**
     * Удаление элемента по указанному индексу.
     * Все последующие элементы сдвигаются на одну позицию влево.
     *
     * @param index индекс элемента, который нужно удалить
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    /**
     * Возвращает текущее количество элементов в контейнере.
     *
     * @return количество элементов в контейнере
     */
    public int size() {
        return size;
    }

    /**
     * Увеличивает вместимость контейнера в два раза.
     * Этот метод вызывается автоматически при заполнении контейнера.
     */
    private void resize() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    /**
     * Выводит все элементы контейнера в консоль через пробел.
     */
    public void printElements(){
        for(int i = 0; i < size(); i++) System.out.print(elements[i] + " ");
    }
}
