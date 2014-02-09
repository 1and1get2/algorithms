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

public class UnionFind {
	private L06_QuickFindUF l06_QuickFindUF1, l06_QuickFindUF2, l06_QuickFindUF3;
	private L07_QuickUnion_LazyApproach l07_QuickUnion_LazyApproach1, l07_QuickUnion_LazyApproach2, l07_QuickUnion_LazyApproach3; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		l06_QuickFindUF1 = new L06_QuickFindUF(50);
		l06_QuickFindUF2 = new L06_QuickFindUF(50);
		l06_QuickFindUF3 = new L06_QuickFindUF(50);
		l07_QuickUnion_LazyApproach1 = new L07_QuickUnion_LazyApproach(50);
		l07_QuickUnion_LazyApproach2 = new L07_QuickUnion_LazyApproach(50);
		l07_QuickUnion_LazyApproach3 = new L07_QuickUnion_LazyApproach(50);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testConstructor() {
		assertTrue("test constructor: ", l06_QuickFindUF1.toString().equals(l07_QuickUnion_LazyApproach1.toString()));
	}

	@Test
	public void testConnected() {
		
	}

	@Test
	public void testUnion() {
		int N = 10;	// length of id[]
		for (int i = 0; i < 30; i ++){ // how many tests in total
			L06_QuickFindUF l06_QuickFindUF = new L06_QuickFindUF(N);
			L07_QuickUnion_LazyApproach l07_QuickUnion_LazyApproach = new L07_QuickUnion_LazyApproach(N); 
			for (int j = 0; j < 5; j++){ // how many union
				int p = (int) (Math.random() * N);
				int q;
				while ( (q = (int) (Math.random() * N)) == p){
				}
				l06_QuickFindUF.union(p, q);
				l07_QuickUnion_LazyApproach.union(p, q);
				System.out.println("i:" + i + " j:" + j + " p:" + p + " q:" + q + " result: \n" + l06_QuickFindUF.toString() + " \n" + l07_QuickUnion_LazyApproach.toString());
			}
			//assertArrayEquals("test rount " + (i+1), l06_QuickFindUF.toArray(), l07_QuickUnion_LazyApproach.toArray());
		}
	}
	
	private <T1, T2> boolean checkUnion(T1 t1, T2 t2){
		
		if (((L06_QuickFindUF) t1).getNumbers() == ((L06_QuickFindUF)t2).getNumbers()){
			
		}
		return false;
	}

}
