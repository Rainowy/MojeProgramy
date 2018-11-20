import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Podstawa {
public static double punkty;
	public static void main(String[] args) {
		
		Scanner skan = new Scanner(System.in);
		System.out.println("Wpisz liczbę na jakiej chcesz wykonywać działanie");
		while (!skan.hasNextInt()) {
			System.out.println("Musisz wpisać liczbę");
			skan.next();
		}
		 int cyfra = skan.nextInt();
		 long startTime = System.currentTimeMillis();
			
			
		Map<Integer, Integer> setLiczbowy = new HashMap<>();
		for (int i = 1; i < 11; i++) {
			setLiczbowy.put(i, cyfra);
		}
		
		for (int i = 0; i<10; i++) {
		
					
					
		Object[] randomMap = setLiczbowy.keySet().toArray();
		Object key = randomMap[new Random().nextInt(randomMap.length)];
		System.out.println("************ Mnożenie cyfry " + setLiczbowy.get(key)+ " ************ \n"  + setLiczbowy.get(key) + " X " + key + " =");

		int klucz = (Integer) setLiczbowy.get(key);
		int wartosc = (Integer) key;
		setLiczbowy.remove(wartosc);
		
		while (!skan.hasNextInt()) {
			System.out.println("Wpisz cyfrę, nic innego");
			skan.next();
		}
		int wynik = skan.nextInt();
		
		if (klucz * wartosc == wynik) {
			punkty++;
			System.out.println("dobra odpowiedz "  ) ;
		
		} else   {
			System.out.println("ZLE " + "została JEDNA próba ");
			//for ( int k = 0; k < 2; k++) {
				while (!skan.hasNextInt()) {

					System.out.println("Wpisz cyfrę, nic innego");
					skan.next();
				}
				 wynik = skan.nextInt();
				if (klucz * wartosc == wynik) {
					punkty++;
					System.out.println("dobra odpowiedz " );
				} else  {
					System.out.println("ZLE, " + "Następne zadanie " );
					
				}
			}

		}
	
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Odpowiedziałeś poprawnie na " + punkty + " zadania, co stanowi " + (punkty/10) * 100 + "%." + " Całość zadania zajęła Ci " + time/1000 + " sekundy.");
		System.out.println("od 0% do 20% - F");
		System.out.println("od 21% do 40% - E");
		System.out.println("od 41% do 60% - D");
		System.out.println("od 61% do 80% - C");
		System.out.println("od 81% do 99% - B");
		System.out.println("100% - A");


}
}
