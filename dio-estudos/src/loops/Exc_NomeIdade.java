package loops;

import java.util.Scanner;

/**
 * Escreva um programa que leia um conjunto de dois valores: nome e idade.
 * O programa só será finalizado quando o nome for igual a 0.
 * @author leticia Santos by Dio / Estruturas de Repetição e Arrays em Java.
 *
 */
public class Exc_NomeIdade {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in); //entrada de dados.
		
		String nome;
		int idade;
		
		while(true) {
		System.out.print("Nome: ");
		nome = leitor.next();
		
		if (nome.equals("0")){
			
			break;
			
		}
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		}
		
	}

}
