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
    void add_item_at_index(){
        CustomArrayList<Integer> sut = new CustomArrayList<>();
        for (int i = 0; i < 9; i++) {
            sut.add(i);
        }
        sut.add(6, 69);

        assertEquals(sut.get(6), 69);
    }

}
