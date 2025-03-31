package org.example;

public class IntCont{
    private int[] elements;
    private int size;

    public IntCont() {
        this.elements = new int[10];
        this.size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
    public int size() {
        return size;
    }
    private void resize() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
