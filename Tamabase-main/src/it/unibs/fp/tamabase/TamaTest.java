package it.unibs.fp.tamabase;

public class TamaTest {
	
	public static void main(String args[]) { 
		
		Tamagotchi t1, t2, t3, t4, t5, t6;
	
		t1 = new Tamagotchi("Paolo", 100, 100);
		t2 = new Tamagotchi("Giovanni", 0, 100);
		t3 = new Tamagotchi("Simone", 100, 0);
		t4 = new Tamagotchi("Giuda", 60, 45);
		t5 = new Tamagotchi("Pietro", 10, 10);
		t6 = new Tamagotchi("Giacomo", 93, 82);
		
		System.out.println("RISULTATO ATTESO: :)");
		System.out.println(t1 + "\n");
		
		System.out.println("RISULTATO ATTESO: :(");
		System.out.println(t2 + "\n");
		
		System.out.println("RISULTATO ATTESO: :(");
		System.out.println(t3 + "\n");
		
		System.out.println("RISULTATO ATTESO: :|");
		System.out.println(t4 + "\n");
		
		System.out.println("RISULTATO ATTESO: :(");
		System.out.println(t5 + "\n");
		
		System.out.println("RISULTATO ATTESO: :)");
		System.out.println(t6 + "\n");
		
	}
}
