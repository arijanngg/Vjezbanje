package vjezbejava;

public class zadatak1 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("programiranje");
		StringBuilder nova = new StringBuilder();
		nova = sb.delete(3, 6);
		
		
		System.out.println("Novi string je " + nova);
		
	}

}
