package CalculadoraTrabalhista;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome, sInicioTrabalho, sFimTrabalho;
		int mesesTrabalhados;
		boolean demissaoVoluntário;
		int feirasVencidas;
		LocalDate monthsOfWork;
		float salario,TotalDescontos;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Quando você começou a trabalhar ? digite no formato [ DD/MM/AAAA ]");
		sInicioTrabalho = leia.nextLine();
		LocalDate inicioTrabalho = LocalDate.parse(sInicioTrabalho, formatter);

		System.out.println("Quando você saiu do trabalho ? digite no formato [ DD/MM/AAAA ]");
		sFimTrabalho = leia.nextLine();
		LocalDate fimTrabalho = LocalDate.parse(sFimTrabalho, formatter);

		System.out.println("digite seu ultimo salario: ");
		salario = leia.nextFloat();

		Rescisao resc = new Rescisao(nome, inicioTrabalho, fimTrabalho, salario);


		Proventos prov = new Proventos();

		System.out.println(prov.calculototalProventos());

		//float totalProventos = saldoSalario +  ferias +  decimoTerceiro;;
		//Rescisao calculoProvento = new Rescisao(totalProventos );

		//System.out.println(resc.diasTrabalhados(fimTrabalho));
		//System.out.println(resc.diasDoMes(fimTrabalho));




	}

}