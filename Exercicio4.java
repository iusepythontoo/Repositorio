package AulasCode;
import java.util.Scanner;

//um Programa que peça as 4 notas bimestrais e mostre a média

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Culculo da Media\n------------------------------\n");
		System.out.println("Primeira Nota:");
		
		Float Somatotal = Entrada.nextFloat();
		
		System.out.println("Segunda Nota:");
		Somatotal += Entrada.nextFloat();
		
		System.out.println("Terceira Nota:");
		Somatotal += Entrada.nextFloat();
		
		System.out.println("Quarta Nota:");
		Somatotal += Entrada.nextFloat();
		
		System.out.println("Media:"+Somatotal/4);
		Entrada.close();
	}

}
