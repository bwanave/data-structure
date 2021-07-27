package ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {

    @Test
    void size() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for (int i = 0; i < 15; i++) {
            dynamicArray.add(i);
        }
        Assertions.assertEquals(15, dynamicArray.size());
    }
}