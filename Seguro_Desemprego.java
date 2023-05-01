package CalculadoraTrabalhista;

import javax.print.attribute.standard.Media;

public class Seguro_Desemprego extends Rescicao {

	float ultimoSalario, penultimoSalario, antepenultimoSalario;

	// fazer a media da soma dos 3 salarios:

	public float calcularMedia(ultimoSalario, penultimoSalario, antepenultimoSalario) {
		
		float somaSalarios = ultimoSalario + penultimoSalario + antepenultimoSalario;
		media = somaSalarios/3;
		
		return media;
	}

	// se a média < R$ 1.599,61 * 0,8
	// se a média >= R$ 1.599,62 e R$ 2.666,29 * 0.5 e somado a R$ 1.279,69
	// se média > R$ 2.666,29 o valor do seguro é R$1.813,03
	// se média < R$ 1.039,00 o valor do seguro é R$1.039,00

	public float compararMedia(media) {
		
		int salarioMinimo = 1305;
		
		if(media < 1599.61) {
			int valorBaixo = media * 0.8;
			System.out.println("Valor do seguro R$ " + valorBaixo);
			
		}else if(media >= 1599.62 && media <= 2666.29 ) {
			int valorMedio = media * 0,5;
			System.out.println("Valor do seguro R$ " + valorMedio);
			
		}else if(media > 2666.29) {
			System.out.println("Valor do seguro R$ 1.813,03");
			
		}else (media < 1039.00){
			System.out.println("Valor do seguro R$ 1.039,00");
			
		}
		return media;
	}

	// quantidade de tempo:

	// se for 1 vez:
	// se mais de 12 meses = tem direito a 4 parcelas;
	// se mais de 23 meses = tem direito a 5 parcelas;
	// menos de 12 meses "Você não tem direito ao seguro desemprego"

	public int primeiraSolicitacao(mesesTrabalhado) {
		
		if(mesesTrabalhado <= 22 && mesesTrabalhado >= 12) {
			System.out.println("Tem direito a 4 parcelas");
		
		}else if(mesesTrabalhado >= 23){
			System.out.println("Tem direito a 5 parcelas");
			
		}else(mesesTrabalhado < 12){
			System.out.println("Não tem direito ao seguro desemprego");
			
		}
		
		return (mesesTrabalhado);
	}

	// se for a 2 vez:
	// entre 9 e 11 meses = recebe 3 parcelas;
	// entre 12 e 23 meses = recebe 4 parcelas;
	// mais de 24 meses = recebe 5 parcelas;
	// menos de 9 meses "Não tem direito a nenhuma parcela do seguro desemprego."

	public int segundaSolicitacao(mesesTrabalhado) {
		
		if(mesesTrabalhado >= 9 && mesesTrabalhado <= 11) {
			System.out.println("Tem direito a 3 parcelas");
		
		}else if(mesesTrabalhado >= 12 && mesesTrabalhado <=23){
			System.out.println("Tem direito a 4 parcelas");
			
		}else if(mesesTrabalhado >= 24){
			System.out.println("Tem direito a 5 parcelas");
			
		}else (mesesTrabalhado < 9){
			System.out.println("Não tem direito a nenhuma parcela");
		}
		
		return (mesesTrabalhando);
	}

	// se for a 3 vez:
	// entre 6 e 11 meses = recebe 3 parcelas;
	// entre 12 e 23 meses = recebe 4 parcelas;
	// mais de 24 meses = recebe 5 parcelas;
	// menos de 6 meses "Não tem direito a nenhuma parcela do seguro desemprego."

	public int terceiraSolicitacao(mesesTrabalhado) {
		
		if(mesesTrabalhado >= 6 && mesesTrabalhado <= 11) {
			System.out.println("Tem direito a 3 parcelas");
		
		}else if(mesesTrabalhado >= 12 && mesesTrabalhado <= 23){
			System.out.println("Tem direito a 4 parcelas");
			
		}else if(mesesTrabalhado >= 24){
			System.out.println("Tem direito a 5 parcelas");
			
		}else (mesesTrabalhado < 6){
			System.out.println("Não tem direito a nenhuma parcela");
		}
		
		return (mesesTrabalhando);
	}
	
}
