package trecicas;

import java.util.Scanner;

public class RazlomakTest {

	public static void main(String[] args) {

		/*double a,b;
		Scanner u = new Scanner (System.in);
		System.out.print("Unesi re i im dio kompleksnog broja");
		
		//a = u.nextDouble();
		//b = u.nextDouble();
		
		kompleksnibroj z1 = new kompleksnibroj(3,7);
		kompleksnibroj z2 = new kompleksnibroj(-3,3),z3;		
		//System.out.printf("Re(Z) =%.2f/n",z1.dajRealnidio());
		//System.out.printf("Im(Z) =%.2f/n",z1.dajImaginarniDio());
z1.stampaj();
System.out.println(" ");
		

System.out.printf("|Z| = %.2f\n", z1.moduo());
	
	z3 =z1.saberi(z2);
	z3.stampaj();
	System.out.println(" ");
	
	z3=z1.oduzmi(z2);
	z3.stampaj();
	System.out.println(" ");
	
	z3=z1.mnozi(z2);
	z3.stampaj();
	
	*/
		Scanner sc = new Scanner (System.in);
		int N ;
		System.out.println("Unesi broj el. niza:");
		N = sc.nextInt();
		
		kompleksnibroj niz[] = new kompleksnibroj[N];
		
		
		for(int i = 0 ; i < N ; i ++) {
			
		
		System.out.printf("UNesi %d. el. niza", i+1);
		niz [i] = new kompleksnibroj(sc.nextDouble(), sc.nextDouble());
		
		}
		
		kompleksnibroj max = niz[0];
		for(int i = 1; i < N ; i ++) {
			if(niz[i].moduo() > max.moduo()) {
				max = niz[i];
			}
		}
		System.out.println("Max niza je : ");
		max.stampaj();
	}

}
