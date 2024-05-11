package test;

import com.coderscampus.arraylist.CustomArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayListTest {
    @Test
    void add_one_item_to_list(){
//        arrange
        CustomArrayList<Integer> sut = new CustomArrayList<>();

//        act
        sut.add(15);

//        assert
        assertEquals(sut.get(0), 15);
        assertEquals(sut.getSize(), 1);
    }

    @Test
    void add_item_at_new_index(){
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        int testIndex = 23;
        Integer testItem = 69;

        for (int i = 0; i < 10; i++) {
            sut.add(i);
        }
        sut.add(testIndex, testItem);

        assertEquals(sut.get(testIndex), testItem);
        assertEquals(sut.getSize(), 11);
    }

    @Test
    void add_item_at_used_index(){
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        int testIndex = 23;
        Integer testItem = 69;

        for (int i = 0; i < 40; i++) {
            sut.add(i);
        }
        sut.add(testIndex, testItem);
        sut.add(44);
        sut.add(99, 201);

        assertEquals(sut.get(testIndex), testItem);
        assertEquals(sut.getSize(), 40);
    }

}
