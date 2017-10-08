import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListMauricioTest {

	@Test
	public void testInsert() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(1, 0);
		list.insert(2, 1);
		list.insert(3, 2);
		list.insert(4, 3);
		list.insert(5, 4);
		for (int i = 0; i < list.size(); i++)
		{
			assertEquals(list.get(0),1);
			assertEquals(list.get(1),2);
			assertEquals(list.get(2),3);
			assertEquals(list.get(3),4);
			assertEquals(list.get(4),5);			
		}		
	}

	@Test
	public void testRemove() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 1);
		list.insert(3, 2);
		list.insert(2, 3);
		list.insert(1, 4);
		assertTrue(list.contains(3));
		list.remove(2);
		assertFalse(list.contains(3));
	}

	@Test
	public void testContains() {
		LinkedListMauricio list = new LinkedListMauricio();
		list.insert(5, 0);
		list.insert(4, 1);
		list.insert(3, 2);
		list.insert(2, 3);
		list.insert(1, 4);
		assertTrue(list.contains(3));
		assertFalse(list.contains(10));
	}

    @Test
    public void testInsertarVacia()
    {
        LinkedListMauricio list = new LinkedListMauricio();
        assertFalse(list.contains(0));
        list.insert(0, 0);
        assertTrue(list.contains(0));
    }

    @Test
    public void testInsertarPrimero()
    {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(1, 0);
        list.insert(2, 1);
        assertEquals(list.get(0), 1);
        list.insert(0, 0);
        assertEquals(list.get(0), 0);
    }

    @Test
    public void testBorrarPrimero()
    {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        assertEquals(0, list.get(0));
        list.remove(0);
        assertEquals(1, list.get(0));
    }

    @Test
    public void testBorrarUltimo()
    {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        assertTrue(list.contains(2));
        list.remove(2);
        assertFalse(list.contains(2));
    }

    @Test
    public void testInsertarUltimo()
    {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(0, 0);
        list.insert(1, 1);
        list.insert(2, 2);
        assertFalse(list.contains(3));
        list.insert(3, 3);
        assertTrue(list.contains(3));
    }
}






