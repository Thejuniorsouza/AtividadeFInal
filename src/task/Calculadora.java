package task;

public class Calculadora {
	
	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public double subtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	public double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	public double dividir(double n1, double n2) {
		return n2 != 0 ? (n1 / n2) : 0;
		
	}
	
	public double exponencial(double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	public double raizQuadrada(double n1) {
		return Math.sqrt(n1);
	}
	
	public double piso(double n1) {
		return Math.floor(n1);
	}
	
	public double teto(double n1) {
		return Math.ceil(n1);
	}
	
}
