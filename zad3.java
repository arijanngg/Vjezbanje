package vjezbejava;

import java.util.Scanner;



public class zad3 {

	public static void main(String[] args) {
//odrediti  broj samoglasnika i suglasnika u recenici
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi recenicu");
		
		String recenica = sc.nextLine();
		
		int brojsamoglasnika= 0;
		int brojsuglasnika = 0;
		recenica = recenica.toLowerCase();
		recenica =recenica.trim();
		
		for(int i = 0 ; i < recenica.length(); i ++) {
			char c= recenica.charAt(i);
			if(Character.isLetter(c)) {
			if(c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u') {
				brojsamoglasnika ++;
			}else {
				brojsuglasnika ++;
			}
		
			}
			
		}
		System.out.println("Broj samoglasnika je " + brojsamoglasnika + ", a broj suglasnika je " + brojsuglasnika);
	
	}
		
		
	}


