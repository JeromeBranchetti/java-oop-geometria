package org.generation.italy.geometria;

public class Rettangolo {
	// attributi
	
	int base;
	int altezza;
	
	//costruttore
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		
	}
	
	//metodi
	
	int calcolaArea() {
		int area = base * altezza;
		return area ;
	}
	int calcolaPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
}
