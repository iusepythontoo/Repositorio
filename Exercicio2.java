package AulasCode;
import java.util.Scanner;
//Um Programa que peça um número e
//então mostre a mensagem O número informado foi [número].;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("digite um numero");
		Scanner numero = new Scanner(System.in);
		
		String numeroInf = numero.nextLine();
		System.out.println("O número informado foi:"+numeroInf);
	}

}
