
 

import static org.junit.Assert.*;

import java.util.ListIterator;

import junit.extensions.TestSetup;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringSetTest {
	
	StringSet<String> l1 = null;
	StringSet<String> l2 = null;
	StringSet<String> l3 = null;
	StringSet<String> l4 = null;
	

	@Before
	public void setUp() throws Exception {
		l1 = new StringSet<String> ();
		l2 = new StringSet<String> ();
		l3 = new StringSet<String> ();
		l4 = new StringSet<String> ();
		l1.add("tata"); l1.add("toto"); l1.add("titi");
		l2.add("fofo"); l2.add("toto"); l2.add("fifi");
		l4.add("vava"); l4.add("vivi"); l4.add("vovo");
		
	}

	@After
	public void tearDown() throws Exception {
		l1 = null;
		l2 = null;
		l3 = null;
		l4 = null;
	}
     
	@Test
	public void testAdd() {
		
		String str1 = "sasa";
		assertFalse("La liste l1 devrais contenir" +str1, l1.contains(str1) );
		
	}

	@Test
	public void testSize() {
		String str2 = "blala";
		int i = l1.size();
		l1.add(str2);
		assertTrue("La taille de la liste devrais augmanté par 1", i + 1 == l1.size());
	}
    
	@Test 
	public void testRemoveSet (){
		String str3 = "tata";
		int x1 = l1.size();
		l1.remove(str3);;
		int x2 = l1.size();
		assertTrue ("apris la suppression de tata la taille de l1 devrait etre diminuer par 1", x1 > x2);
	}
	

@Test
	 public void testUnion (){
		
		l3 = l1.union(l2);   
		
		long t1 = l1.size();
		long t2 = l2.size();
		long t3 = l3.size();
		
		assertEquals("t3 de l3 devrait etre egale a t1 de l1 plus t2 de l2",t3, (t1+t2));;
		
	}

	
	@Test
	public void testContains() {
		assertTrue("la liste l1 devrais contenire la chaine toto", l1.set.contains("toto"));		
	}
	
	
	@Test 
	public void testNumbeOfSet (){
		
		int nbr = l1.size() ;
		assertEquals(" nombre des chaine dans l1  devrait etre egale a la taille de la liste l1 ", nbr, l1.NumbeOfSet());
	}
	
	@Test
	public void testIntersectionSet (){
		
		assertTrue("les deux Listes l1 et l2 devront avoir une intersection", StringSet.IntersectionSet(l2,l1));
	}
	
	
	@Test 
	public void testIsEmpty (){
		assertTrue("la liste l1 devrait etre vide", l1.IsEmpty()); 
	}
	
	public void testEnumeration (){
		
		String tab [] = { "tata", "toto","titi" };
		String tab1 [] = new String [2];
		
		assertArrayEquals("la methode devrais enuméré les element de la liste l1  dans le tableau tab1", tab, l1.Enumeration(tab1));
	}
	
	
	
	
}
