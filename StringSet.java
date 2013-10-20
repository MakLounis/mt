
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.border.EmptyBorder;

public class StringSet<T> {
	
	List<T> set = null;
	
	
	StringSet(){
		set = new LinkedList<T>();
	}
	
	

	public void add(T e){
		set.add(e);
	}
	
	public int size(){
		return set.size();
	}
	
    public void remove (T e){
		
		set.remove(e);
	}
    
	public boolean contains(T e){
		StringSet<T> l = new StringSet<T>();
		boolean test = false; 
		
		for(int i=0; i<l.size(); i++){
		
		 	if (set.contains(e)){
				test = true;
			}else{
				test = false;
			}
		}
		
		  return test;
	 }
	
	
	public StringSet<T> union(StringSet<T> nset){
		StringSet<T> ns = new StringSet<T>();
		for(T t: set){
			ns.add(t);
		}
		for(T t: nset.set){
			if (!(ns.contains(t))) ns.add(t);
		}
		return ns;
	}

	public int NumbeOfSet (){
		
		int nb = 0;
		
		for(int i =0; i<set.size(); i++){
		   nb++;
		}
		return nb;
	}

	public static boolean IntersectionSet(StringSet<String> lst1, StringSet<String> lst2){
				 
		int t1 = lst1.size();
		int t2 = lst2.size();
		
		int plusLang = 0;
		boolean test = false;
		
		if (t1 > t2){
			plusLang = t1;
		}else{
			plusLang = t2;
		}
		
		ListIterator i = lst1.set.listIterator();
		ListIterator j = lst2.set.listIterator();
		
		while (i.hasNext() && j.hasNext()){
			Object Set1 = i.next();
			Object Set2 = j.next();
			
			System.out.println(Set1);
			System.out.println(Set2);
			
			if (Set1.equals(Set2)){
				test = true;
				break;
			}else{
				test = false;
			}
		}
		
		
		return test;
	}
	
	
	public boolean IsEmpty(){
		StringSet<T> l = new StringSet<T>();
		boolean test =false;
		ListIterator i = l.set.listIterator();
		while (i.hasNext()){
			i.remove();
		}
				
		if (l.set.isEmpty()){
			test =true;
		}else{
			test =false;
		}
		
		return test;
	
     
	}
	
	
	public  T[] Enumeration(T tab1 []){
		
	   ListIterator j = set.listIterator();
	   int i=0;
	   while (j.hasNext()){
		  tab1 [i] = (T)  j.next();
		  i++;
	   }
	   
	   return tab1;
	}

}
