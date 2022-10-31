package edu.fluxosControle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=========EXEMPLO 1 COM IF-ELSE========");
		int mes = 16;
		
		if (mes == 1) {
			System.out.println("janeiro");
		} else if (mes == 2){
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5){
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("invalido");
		}
		
		
		
	
		
		System.out.println("=========EXEMPLO 2 COM IF-ELSE========");
		double salarioMensal = 7200.00;
		double mediaSalarial = 5260.00;
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		boolean salarioBaixo = salarioMensal < mediaSalarial;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
	if ((salarioBaixo) && (muitosDependentes)) {
		System.out.println("Funcionário deve receber auxilio");
	} else {
		System.out.println("Funcionário não deve receber auxilio");
	}
	
	
	
	System.out.println("=========EXEMPLO 3 COM SWITCH========");
	String dia = "Quarta";
	switch (dia) {
	case "Segunda":
		System.out.println("Hoje é Segunda");
		break;
	case "Terça":
		System.out.println("Hoje é Terça");
		break;
	case "Quarta":
		System.out.println("Hoje é Quarta");
		break;
	case "Quinta":
		System.out.println("Hoje é Quinta");
		break;
	case "Sexta":
		System.out.println("Hoje é sexta");
		break;
	case "Sabádo":
		System.out.println("Final de semana! Sabádo");
		break;
	case "Domingo":
		System.out.println("Fim de semana! Domingo");
		break;
	default:
		System.out.println("invalido");
		break;
	}

	}

}
