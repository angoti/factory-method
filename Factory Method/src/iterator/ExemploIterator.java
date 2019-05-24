package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExemploIterator {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		Set<String> conjunto = new HashSet<String>();
		conjunto.add("a");
		conjunto.add("b");
		conjunto.add("c");
		
		ExemploIterator e = new ExemploIterator();
		e.exemplo(lista);
		e.exemplo(conjunto);
	}
	
	@SuppressWarnings("rawtypes")
	
	void exemplo(Collection c) {
		Iterator i = c.iterator();// iterator() é um Factory Method
		while(i.hasNext()) {
			//processa elementos da coleção
		}
	}
}
