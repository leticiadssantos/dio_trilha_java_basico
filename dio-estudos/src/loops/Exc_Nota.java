package loops;

import java.util.Scanner;

/**
 * Faça um programa que peça a mensagem de zero a dez, mostre uma mensagem caso o valor seja invalido.
 * @author Leticia Santos by Dio / Estruturas de Repetição e Arrays em Java.
 *
 */

public class Exc_Nota {
	public static void main (String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		int nota;

		System.out.println("Digite sua nota: ");
		nota = leitor.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido, digite novamente:");
			nota = leitor.nextInt();
		}
		
		System.out.println("fim");
		
	}

}
