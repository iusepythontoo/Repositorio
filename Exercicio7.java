package AulasCode;
//um Programa que peça a temperatura
//em graus Fahrenheit, transforme e mostre a
//temperatura em graus Celsius.

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Graus em Fahrenheit:");
		double Fahrenheit = entrada.nextDouble();
		System.out.println("Graus em Celsius:"+ 5 * ((Fahrenheit-32) / 9));
	}

}
