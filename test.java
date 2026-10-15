package vjezbenacasu;

import java.util.ArrayList;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class test {

	

	public static void main(String[] args) {

		student.setProlazNaIspitu(51);
		
		student s = new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
		System.out.println(s);
		s.azurirajProlaz();
		System.out.println(s);
		
		
		ArrayList<student> niz = new ArrayList<student>();
		
	   niz.add(new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
	  niz.add(new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
	  niz.add(new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
	  niz.add(new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
	  niz.add(new student("Marko", "Markovic", "2025/001", "Oktorih 1, 81000 Podgorica ", 51);
	
	ArrayList<student> polozili = student.izdvojPoloziliIline(niz,true);
	System.out.println("Polozili");
	
	}
	

}
