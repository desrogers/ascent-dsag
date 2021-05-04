package dsag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    @Test
    public void isEmpty_ReturnsTrue_WithNoListElements() {
        MyLinkedList list = new MyLinkedList();
        boolean expected = true;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }
}
