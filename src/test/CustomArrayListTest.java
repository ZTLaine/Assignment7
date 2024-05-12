//  5/12/24
//  Zack Laine
//  Assignment 7

package test;

import com.coderscampus.arraylist.CustomArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomArrayListTest {
    @Test
    void add_one_item_to_list() {

        CustomArrayList<Integer> sut = new CustomArrayList<>();

        sut.add(15);

        assertEquals(sut.get(0), 15);
        assertEquals(sut.getSize(), 1);
    }

    @Test
    void add_item_at_new_index() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        int testIndex = 23;
        Integer testItem = 69;

        for (int i = 0; i < 49; i++) {
            sut.add(i);
        }
        sut.add(testIndex, testItem);

        assertEquals(sut.get(testIndex), testItem);
        assertEquals(sut.getSize(), 50);
    }

    @Test
    void add_item_at_used_index() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        int arrayStartSize = 20;
        int testIndex = 19;
        int addedCount = 0;
        Integer testItem = 58;
        Integer movedItem;

        for (int i = 0; i < arrayStartSize; i++) {
            sut.add(i);
        }
        movedItem = sut.get(testIndex);
        sut.add(testIndex, testItem);
        addedCount++;

        assertEquals(sut.get(testIndex), testItem);
        assertEquals(sut.get(testIndex + 1), movedItem);
        assertEquals(sut.getSize(), arrayStartSize + addedCount);
    }

    @Test
    void remove_item() {
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        int arrayStartSize = 10;
        int testIndex = 6;
        int removedCount = 0;

        for (int i = 0; i < arrayStartSize; i++) {
            sut.add(i);
        }
        Integer movedItem = sut.get(testIndex + 1);
        sut.remove(testIndex);
        removedCount--;

        assertEquals(sut.get(testIndex), movedItem);
        assertEquals(sut.getSize(), arrayStartSize + removedCount);
        assertNull(sut.get(arrayStartSize - 1));
    }
}
