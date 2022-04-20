package AulasCode;
//um Programa que peça a temperatura em graus Celsius, 
//transforme e mostre em graus Fahrenheit

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Graus em Celsius:");
		double celsius = entrada.nextDouble();
		
		double resultado = (celsius * 1.8000) + 32;
		
		System.out.println("Graus em Fahrenheit:"+resultado);
		entrada.close();
	}

}
