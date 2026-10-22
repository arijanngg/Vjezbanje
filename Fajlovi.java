package vjezbe;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Fajlovi {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner (new File("Vozila.txt"));
		
		while(sc.hasNext())
		System.out.println(sc.nextLine());
			
			
		sc.close();
		
		
		
	}

}
