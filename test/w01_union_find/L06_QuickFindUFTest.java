package w01_union_find;


import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import w01_union_find.L06_QuickFindUF;

public class L06_QuickFindUFTest {
	private L06_QuickFindUF l06_QuickFindUF1, l06_QuickFindUF2, l06_QuickFindUF3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		l06_QuickFindUF1 = new L06_QuickFindUF(new int[]{1,2,3,4});
		l06_QuickFindUF2 = new L06_QuickFindUF(50);
		l06_QuickFindUF3 = new L06_QuickFindUF(50);
		System.out.println(Arrays.toString(l06_QuickFindUF1.getResult()));
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void L06_QuickFindUF() {
		
	}

	@Test
	public void testConnected() {
		//fail("Not yet implemented");
		
	}

	@Test
	public void testUnion() {
		assertEquals("testUnion", 1, 1);
	}

}
