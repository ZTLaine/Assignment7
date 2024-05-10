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

}
