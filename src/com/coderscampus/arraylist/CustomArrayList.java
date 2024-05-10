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
//        if (item != null) {
//            if (numOfItems != items.length) {
//                items[numOfItems] = item;
//                numOfItems++;
//            } else {
//                Object[] tempItems = items;
//                items = new Object[numOfItems * 2];
//                for (int i = 0; i <= numOfItems - 1; i++) {
//                    items[i] = tempItems[i];
//                }
//                items[numOfItems] = item;
//                numOfItems++;
//            }
//            return true;
//        }
//        else{
//            return false;
//        }

        /*Thank you, Roche this is a much simpler way to read the flow of the code!*/
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
        return false;
    }

    @Override
    public int getSize() {
        return numOfItems;
    }

    @Override
    public T get(int index) {
        if (index < numOfItems && index >= 0) {
            return (T) items[index];
        } else {
            System.out.println(index + " is not a valid index!");
            return null;
        }
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
