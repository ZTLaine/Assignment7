//  5/12/24
//  Zack Laine
//  Assignment 7

package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    Integer numOfItems = 0;

    @Override
    public boolean add(T item) {
        return add(numOfItems, item);
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if(item == null){
            return true;
        }
        if (index < 0 || index > items.length) {
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
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException();
        }
        return (T) items[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException();
        }

        T removed = get(index);
        System.arraycopy(items, index + 1, items, index, numOfItems - index - 1);
        numOfItems--;
        items[numOfItems] = null;

        return removed;
    }
}
