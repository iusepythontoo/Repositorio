package AulasCode;
import java.util.Scanner;



/*um Programa que calcule a área de um quadrado,
 *  em seguida mostre o dobro desta
área para o usuário*/

public class Exercicio5 {

	public static void main(String[] args) {
		//quadrados tem lados iguais
		System.out.println("informe o comprimento dos lados do quadrado:");
		Scanner Lado = new Scanner(System.in);
		double resultado = Math.pow(Lado.nextDouble(),2) * 2;
		System.out.println("O dobro da area deste quadrado é:"+resultado);
		Lado.close();
	}

}
