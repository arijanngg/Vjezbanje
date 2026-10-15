package vjezbejava;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("UNesi string");
		String ulazni= sc.next();
		String s = " ";
		for(int i = 0; i < ulazni.length(); i ++) {
			if(ulazni.charAt(i)%2==0) {
				s+='0';
			}else {
			s+='1';
			}
		}
		System.out.print(s);
	}

}
