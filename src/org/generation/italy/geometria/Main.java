package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Base: ");
		int baseInput = scan.nextInt();
		System.out.print("Altezza: ");
		int altezzaInput = scan.nextInt();

		Rettangolo r1 = new Rettangolo(baseInput, altezzaInput);
		System.out.println("Perimetro: " + r1.calcolaPerimetro());
		System.out.println("Area: " + r1.calcolaArea());
		
		scan.close();
		
	}

}
