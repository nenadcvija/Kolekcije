package setovi;

import java.util.*;

public class GlavnaSet {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			System.out.println("Unesite prvo ime:");
			String ime1 = s.nextLine();
			
			System.out.println("Unesite drugo ime:");
			String ime2 = s.nextLine();
			
			System.out.println("Unesite trece ime:");
			String ime3 = s.nextLine();
		
		
		List<String> imena = new ArrayList<String>();
			imena.add(ime1);
			imena.add(ime2);
			imena.add(ime3);
			
		System.out.println("Imena iz liste su: ");
		
		  for(String nekoIme: imena) { 
			  System.out.println(nekoIme); 
		  }
		  
		System.out.println("Lista preko iteratora");
		  
		 Iterator <String>listIterator = imena.iterator();
		  
		  while(listIterator.hasNext()) {
			  String ime = (String)listIterator.next();
			  System.out.println(ime);
		  }
		  
		  System.out.println("*** Ovde ide SET ***");
		  
		  Set<String> set = new HashSet<String>();
		  		set.add(ime1);
		  		set.add(ime2);
		  		set.add(ime3);
		  
		  System.out.println("Imena iz Seta su: ");
		  
		  for(String nekoIme: set) {
			  System.out.println(nekoIme);
		  }
		  
		  System.out.println("Set preko iteratora:  ");
		  
		  Iterator <String> setIterator = set.iterator();
		  
		  while (setIterator.hasNext()) {
			String ime = setIterator.next();
			System.out.println(ime);
		  }
		  
		  
		  
		  
		  
		  
		  
		 
		
		
		
		

	}

}
