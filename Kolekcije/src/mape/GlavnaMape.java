package mape;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GlavnaMape {

	public static void main(String[] args) {
		
		Map<Integer,String> mojaMapa = new HashMap<Integer,String>();
			
				mojaMapa.put(3,"Djordje");
				mojaMapa.put(3, "Igor");
				mojaMapa.put(69, "Stefan");
				mojaMapa.put(96, "Visnja");
				
		
		String imePolaznika = mojaMapa.get(3);
		
		System.out.println(imePolaznika);
		
		System.out.println("Map preko for petlje: ");
		
		for(Object o: mojaMapa.entrySet()) {
			
			Map.Entry<Integer, String> mapEntry = (Map.Entry<Integer, String>)o;
			System.out.println("Key: " + mapEntry.getKey());
			System.out.println("Value: " + mapEntry.getValue() );
			
		}
		
		
		System.out.println("Map preko iteratora: ");
		
		Iterator<Entry<Integer, String>> mapIterator = mojaMapa.entrySet().iterator();
		
		while(mapIterator.hasNext()) {
			Map.Entry<Integer, String> mapEntry  = mapIterator.next();
			System.out.println("Key: " + mapEntry.getKey());
			System.out.println("Value: " + mapEntry.getValue() );
		}
		
		
		

	}

}
