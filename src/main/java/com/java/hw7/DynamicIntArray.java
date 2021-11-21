package com.java.hw7;
import java.util.Arrays;
public class DynamicIntArray {

    /**
     * Array for storing numbers
     */
    private int[] array = new int[10];

    /**
     * Current size of the array
     */
    private int size = 0;

    /**
     * Method for adding element to the array
     * @param element represents number need to add
     */
    public void add(int element) {
        if (size == array.length) {
            array[size++] = element;
        }
    }

    /**
     * Method for removing first element from array
     * @param element represents number need to remove
     * @return true if successfully removed and false if the array doesn't contain such an element
     */
    public boolean remove(int element) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == element) {
                array[i] = 0;
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Method for updating element by index
     * @param element represents new value of the element with appropriate index
     * @param index represents the position of the element which need to update
     * @return true if successfully updated and false if the array doesn't contain such an element
     */
    public boolean update(int element, int index) {
        if (index < 0 || index >= size) {
            return false;
        } else {
            array[index] = element;
            return true;
        }
    }

    /**
     * Method for retrieving an element by index. If the array doesn't contain an element at the position then throw NoSuchElementException
     * @param index represents the position of the element which need to retrieve
     * @return an element at the position with appropriate index
     */
    public int getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("NoSuchElementException");
        } else { return array[index];
        }
    }

    /**
     * Method for retrieving size of the array.
     * @return size of the array
     */
    public int getSize() {
        return size;
    }

    /**
     * Method for creating new array if previous is full and copying all element from an old array to a new
     */
    private void resize() {
        array = Arrays.copyOf(array, size * 3 / 2 + 1);
    }
}