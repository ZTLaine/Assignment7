//  4/19/24
//  Zack Laine
//  Assignment 5

package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    Integer numOfItems = 0;

    @Override
    public boolean add(T item) {
        if (item == null) {
            return true;
        }
        if (numOfItems == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }

        items[numOfItems] = item;
        numOfItems++;

        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (item == null) {
            return true;
        }
        if (index > items.length) {
            throw new IndexOutOfBoundsException();
        }
        if (numOfItems == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }

        System.arraycopy(items, index, items, index + 1, numOfItems - index);
        items[index] = item;
        numOfItems++;

        return true;
    }

    @Override
    public int getSize() {
        return numOfItems;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return (T) items[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    public void printAll() {
        for (Object item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
