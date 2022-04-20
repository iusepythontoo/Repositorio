package AulasCode;
import java.util.Scanner;
//um Programa que pergunte quanto você 
//ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o 
//total do seu salário no referido mês
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Pagamento por hora:");
		double salario = entrada.nextDouble();
		
		System.out.println("Hora de trabalho por dia:");
		salario *= entrada.nextDouble()  * 30;
		
		System.out.println("Salario por mes:"+salario);
		entrada.close();
		
	}

}




