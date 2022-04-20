package ar.edu.unju.edm.model;

import org.springframework.stereotype.Controller;

@Controller
public class Calculadora {
	private int n1;
	private int n2;
	
	public Calculadora() {
		//TODO Auto-generated constructor stub
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int sumaNumero() {
		return n1+n2;
	}
	public int restaNumero() {
		return n1-n2;
	}
	public int divisionNumero() {
		return n1/n2;
	}
	public int multiplicacionNumero() {
		return n1*n2;
	}
	public int potenciaNumero() {
		int potencia=1;
		for(int i=1; i<=n2;i++) {
			potencia=potencia*n1;
		}return potencia;
	}
}
