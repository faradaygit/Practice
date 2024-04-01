import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {
    int[] a1 = {7, 2, 6, 2, 5, 2, 7, 9, 23423, -2, 5, 8};
    int[] a2 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] a3 = {2};
    int[] a4 = {};
    int[] a5 = {-1, -2, -3};

    @Test
    void testMax() {
        assertEquals(23423, new ArraySearch(a1).findMax());
        assertEquals(1, new ArraySearch(a2).findMax());
        assertEquals(2, new ArraySearch(a3).findMax());
        assertThrows(IllegalArgumentException.class, () -> new ArraySearch(a4).findMax());
        assertEquals(-1, new ArraySearch(a5).findMax());
    }

    @Test
    void testMin() {
        assertEquals(-2, new ArraySearch(a1).findMin());
        assertEquals(1, new ArraySearch(a2).findMin());
        assertEquals(2, new ArraySearch(a3).findMin());
        assertThrows(IllegalArgumentException.class, () -> new ArraySearch(a4).findMin());
        assertEquals(-3, new ArraySearch(a5).findMin());
    }

    @Test
    void testContains() {
        assertFalse(new ArraySearch(a1).contains(0));
        assertFalse(new ArraySearch(a1).contains(-1));
        assertTrue(new ArraySearch(a1).contains(-2));
        assertTrue(new ArraySearch(a1).contains(8));
        assertTrue(new ArraySearch(a1).contains(7));

        assertTrue(new ArraySearch(a2).contains(1));
        assertFalse(new ArraySearch(a2).contains(0));

        assertTrue(new ArraySearch(a3).contains(2));
        assertFalse(new ArraySearch(a3).contains(0));

        assertFalse(new ArraySearch(a4).contains(1));
        assertFalse(new ArraySearch(a4).contains(0));
    }

    @Test
    void testPositionOf() {
        assertEquals(2, new ArraySearch(a1).positionOf(6));
    }


}