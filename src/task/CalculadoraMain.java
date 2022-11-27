package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Exponencial \n 6 - Raiz Quadrada \n 7 - Piso \n 8 - Teto");

			int escolha = sc.nextInt();
			
			System.out.println("=== Digite o primeiro número: ");
			double n1 = sc.nextDouble();
			
			double n2 = 0.0;

			switch(escolha) {
			case 1:
				System.out.println("=== Digite o segundo número: ");
				n2 = sc.nextDouble();
				System.out.println("=== Resultado soma: " + calculadora.somar(n1, n2));
				break;
			case 2:
				System.out.println("=== Digite o segundo número: ");
				n2 = sc.nextDouble();
				System.out.println("=== Resultado subtração: " + calculadora.subtrair(n1, n2));
				
				break;
			case 3:
				System.out.println("=== Digite o segundo número: ");
				n2 = sc.nextDouble();
				System.out.println("=== Resultado multiplicação: " + calculadora.multiplicar(n1, n2));
				break;
			case 4:
				System.out.println("=== Digite o segundo número: ");
				n2 = sc.nextDouble();
				System.out.println("=== Resultado divisão: " + calculadora.dividir(n1, n2));
				break;
			case 5:
				System.out.println("=== Digite o segundo número: ");
				n2 = sc.nextDouble();
				System.out.println("=== Resultado exponencial: " + calculadora.exponencial(n1, n2));
				break;
			case 6:
				System.out.println("=== Resultado raiz quadrada: " + calculadora.raizQuadrada(n1));
				break;
			case 7:
				System.out.println("=== Resultado piso: " + calculadora.piso(n1));
				break;
			case 8:
				System.out.println("=== Resultado teto: " + calculadora.teto(n1));
				break;
			default:
				System.out.println("Opção inválida");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Ocorreu um erro na entrada da informação");
		} catch(Exception ex) {
			System.out.println("Ocorreu um erro inesperado");
			
		}

	}

}
