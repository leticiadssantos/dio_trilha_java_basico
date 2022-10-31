package loops;

import java.util.Scanner;

public class Exc_MaiorMedia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		int numero;
		int soma = 0;
		int i = 0;
		int maior = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			i = i + 1;
			soma = soma + numero;
			
			if (numero > maior) {
				maior = maior + numero;
			}
			
		} while (i < 5);
		
		System.out.println("Soma: " + soma);
		System.out.println("Média " + soma/5);

	}

}
