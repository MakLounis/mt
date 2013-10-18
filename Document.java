Class StringSetTest {
@Test
	public void isEmptySet(){
		assertTrue("Devrait etre vide ", e.set.size()==0);
	}	
	
@Test
	public void containsString(){
		String str = "Foo";
		assertTrue("Devrait contenir " + str, l.set.contains(str));
	}
	
	@Test
	public void addString(){
		String str = "String";
		assertFalse("Ne devrait pas avoir une entree" + str, l.set.contains(str));
		l.set.add(str);
		assertTrue("Devrait avoir une entree" + str, l.set.contains(str));
	}


@Test
	public void removeSet(){
		String str = "String";
		assertTrue("Devrait avoir une entree" + str, l.contains(str));
		l.remove(str);
		assertFalse("Ne devrait plus contenir une entree" + str, l.contains(str));
	}
	
	@Test
	public void nullInterStringSet(){
		
		for(String e : l2.set){
			assertTrue("Ne devrait pas contenir " + e, l.contains(e));
		}
		StringSet s = l.union(l2);
		for(String e : l2.set){
			assertTrue("Devrait contenir " + e, s.contains(e));
		}		
	}
	@Test
	public void interStringSet(){
		String str 	= "String";
		int c	= l.set.size();
		l.add(str);
		assertEquals("la taille de la liste de l doit augmenter de 1", c + 1, l.size()+1);
		//assertTrue("On devrait avoir une taille de " + (c + 1), l.size() == c + 1);
	}
l2.add("fofo"); l2.add("toto"); l2.add("fifi");
		l4.add("tata"); l4.add("toto"); l4.add("titi"); l4.add("fofo"); l4.add("toto"); l4.add("fifi");
}
