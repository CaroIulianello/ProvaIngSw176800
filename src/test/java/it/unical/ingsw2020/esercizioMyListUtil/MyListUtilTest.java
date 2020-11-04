package it.unical.ingsw2020.esercizioMyListUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	private static MyListUtil list;
	
	@BeforeClass
	public static void prepare()
	{
			list=new MyListUtil();
	}
	
	@Test
	public void isOrdinaWorks()
	{
		assertEquals(new LinkedList<Integer>(), list.ordina(1));
		assertEquals(Arrays.asList(2,1,3,4),list.ordina(5));
	}
	
	@Test
	public void isOrdinaCrescenteWorks()
	{
		assertTrue(list.ordinaCrescente());
		assertFalse(list.ordinaDecrescente());
	}
}
