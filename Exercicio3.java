package AulasCode;
import java.util.Scanner;

//um Programa que peça dois
//números e imprima a soma;

public class Exercicio3 {

	public static void main(String[] args) {
		System.out.println("digite um numero para somar");
		Scanner numero1 = new Scanner(System.in);
		Integer numeroInf1 = numero1.nextInt();
		
		System.out.println("digite o segundo numero a soma");
		Scanner numero2 = new Scanner(System.in);
		Integer Resultado  = numero2.nextInt() + numeroInf1;
		numero1.close();
		numero2.close();
		
		System.out.println("O resultado da soma foi:"+Resultado);
	}

}
