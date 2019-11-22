package liste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		/*
		 * String ime = "Pera";
		 * 
		 * List lista = new ArrayList();
		 * 
		 * // dodavanje elemenata u listu
		 * 
		 * lista.add(ime); lista.add(1987); lista.add(3.14); lista.add(false);
		 * lista.add("Stevo");
		 * 
		 * // "hvatanje" elemenata liste
		 * 
		 * System.out.println("Treci element liste je: " + lista.get(2));
		 * 
		 * double x = (double)lista.get(2); String y = (String)lista.get(4);
		 * System.out.println(y);
		 * 
		 * 
		 * // genericke liste
		 * 
		 * List <String> imena = new LinkedList<String>();
		 * 
		 * imena.add("Djordje"); imena.add("Marina"); imena.add("Bojan");
		 * 
		 * System.out.println("Polaznici su: "); //prolaz kroz listu for(int i = 0; i <
		 * imena.size(); i++) { String imePolaznika = imena.get(i);
		 * System.out.println(imePolaznika); }
		 * 
		 * imena.remove(0); // uklanjamo element liste
		 * 
		 * System.out.println("Preostali polaznici: "); //for each for(String
		 * imePolaznika: imena) { System.out.println(imePolaznika); }
		 */
		
		// lista int-ova mora preko wrapper klase Integer...
		List<Integer> brojevi = new ArrayList<Integer>();
		
		Soldier soldier1 = new Soldier();
			soldier1.setName("VisnjaKiller");
			soldier1.setHealth(100);
			soldier1.setMoney(16000);
			soldier1.setTeam("Terori");
		
		Soldier soldier2 = new Soldier();
			soldier2.setName("Fanste");
			soldier2.setHealth(100);
			soldier2.setMoney(16000);
			soldier2.setTeam("Terori");
		
		Soldier soldier3 = new Soldier();
			soldier3.setName("Vladd");
			soldier3.setHealth(100);
			soldier3.setMoney(16000);
			soldier3.setTeam("Kanter");
			
		Soldier soldier4 = new Soldier();
			soldier4.setName("Dovla");
			soldier4.setHealth(100);
			soldier4.setMoney(16000);
			soldier4.setTeam("Kanter");
			
		Soldier soldier5 = new Soldier();
			soldier5.setName("Vortex");
			soldier5.setHealth(100);
			soldier5.setMoney(16000);
			soldier5.setTeam("Kanter");
		
		Soldier soldier6 = new Soldier();
			soldier6.setName("Map");
			soldier6.setHealth(100);
			soldier6.setMoney(16000);
			soldier6.setTeam("Teror");
		
		
		List<Soldier> terori = new ArrayList<Soldier>();
			terori.add(soldier1);
			terori.add(soldier2);
			terori.add(soldier6);
		
		List<Soldier> kanteri = new ArrayList<Soldier>();
			kanteri.add(soldier3);
			kanteri.add(soldier4);
			kanteri.add(soldier5);
		
		
		System.out.println("Ekipa terora je: ");
		
		for(Soldier s: terori) {
			System.out.println(s.getName());
		}
			
		System.out.println("Ekipa kantera je: ");
		
		for(Soldier s: kanteri) {
			System.out.println(s.getName());
		}
		
		
		Weapon firearm = new FireArm();
		Weapon knife = new ColdWeapon();
		
		List<Weapon> myWeapon = new ArrayList<Weapon>();
			myWeapon.add(knife);
			myWeapon.add(firearm);
		
		soldier3.setRanac(myWeapon);
			
		soldier3.getRanac().get(1).hit(soldier4);
		
		
		
		
		
		
		
		
		
		

	}

}
