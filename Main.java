package RescisaoTrabalhista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

			System.out.println("Digite a data de admissão do funcionário (no formato dd/MM/yyyy): ");
			LocalDate dataAdmissao = LocalDate.parse(leia.nextLine(), formatter);

			System.out.println("Digite a data de demissão do funcionário (no formato dd/MM/yyyy): ");
			LocalDate dataDemissao = LocalDate.parse(leia.nextLine(), formatter);

			FuncionarioCLT funcionario = new FuncionarioCLT(nome, salario, dataAdmissao, dataDemissao, cpf);
			double rescisao = funcionario.calcularRescisao();

			System.out.println("Rescisão de " + funcionario.getNome() + ": R$" + rescisao);
		} else if (tipoContrato.equalsIgnoreCase("PJ")) {
			System.out.println("Digite o nome da empresa contratante: ");
			String nomeEmpresa = leia.nextLine();

			System.out.println("Digite o valor total recebido pelo funcionário: ");
			double valorTotal = leia.nextDouble();

			leia.nextLine();

			System.out.println("Digite a data de início do contrato (no formato dd/MM/yyyy): ");
			LocalDate dataInicioContrato = LocalDate.parse(leia.nextLine(), formatter);

			System.out.println("Digite a data de fim do contrato (no formato dd/MM/yyyy): ");
			LocalDate dataFimContrato = LocalDate.parse(leia.nextLine(), formatter);

			FuncionarioPJ funcionariopj = new FuncionarioPJ(nome, valorTotal, dataInicioContrato, dataFimContrato,
					nomeEmpresa);
			double rescisao = funcionariopj.calcularRescisao();

			System.out.println("Rescisão de " + funcionariopj.getNome() + ": R$" + rescisao);
		} else {
			System.out.println("Tipo de contrato inválido!");
		}

		leia.close();
	}
}