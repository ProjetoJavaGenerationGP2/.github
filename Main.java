package RescisaoTrabalhista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário: ");
		String nome = leia.nextLine();

		System.out.println("Digite o CPF do funcionário: ");
		String cpf = leia.nextLine();

		System.out.println("Digite o salário do funcionário: ");
		double salario = leia.nextDouble();

		leia.nextLine();

		System.out.println("O funcionário é CLT ou PJ? Digite 'CLT' ou 'PJ': ");
		String tipoContrato = leia.nextLine();

		if (tipoContrato.equalsIgnoreCase("CLT")) {
			System.out.println("Digite o cargo do funcionário: ");
			String cargo = leia.nextLine();

			System.out.println("Digite a data de admissão do funcionário (no formato AAAA-MM-DD): ");
			LocalDate dataAdmissao = LocalDate.parse(leia.nextLine());

			FuncionarioCLT funcionario = new FuncionarioCLT(nome, cpf, salario, dataAdmissao, cargo);
			double rescisao = funcionario.calcularRescisao();

			System.out.println("Rescisão de " + funcionario.getNome() + ": R$" + rescisao);
		} else if (tipoContrato.equalsIgnoreCase("PJ")) {
			System.out.println("Digite o nome da empresa contratante: ");
			String nomeEmpresa = leia.nextLine();

			System.out.println("Digite o valor total recebido pelo funcionário: ");
			double valorTotal = leia.nextDouble();

			leia.nextLine();

			System.out.println("Digite a data de início do contrato (no formato AAAA-MM-DD): ");
			LocalDate dataInicioContrato = LocalDate.parse(leia.nextLine());

			FuncionarioPJ funcionario = new FuncionarioPJ(nome, cpf, valorTotal, dataInicioContrato, nomeEmpresa);
			double rescisao = funcionario.calcularRescisao();

			System.out.printf("Rescisão de " , funcionario.getNome() , ": R$" , rescisao);
		} else {
			System.out.println("Tipo de contrato inválido!");
		}

		leia.close();
	}
}