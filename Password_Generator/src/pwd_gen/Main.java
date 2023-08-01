package pwd_gen;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input length of generated password:");
		int input = Integer.valueOf(scanner.nextLine());
		System.out.println(input);
		
		String[] symbols = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"abcdefghijklmnopqrstuvwxyz",
				"0123456789",
				"!\"#$%&\'()*+,-./:;<=>?[\\]^`{|}~"};
		
		int size = symbols.length;
		
		String password = "";
		for(int i =0; i<input; i++) {
			int randIdx = (int)(Math.random()*size);
			
			int randIdxSize = symbols[randIdx].length();
			int randSelect = (int)(Math.random()*randIdxSize);
			
			password += symbols[randIdx].charAt(randSelect);
		}
		
		System.out.println(password);
		
	    scanner.close();
	}
	

}
