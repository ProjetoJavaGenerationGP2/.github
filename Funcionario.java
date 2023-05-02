package RescisaoTrabalhista;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private LocalDate dataAdmissao,dataDemissao;

	public Funcionario(String nome, String cpf, double salario, LocalDate dataAdmissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public double calcularRescisao() {
		LocalDate dataRescisao = LocalDate.now();
		long mesesTrabalhados = ChronoUnit.MONTHS.between(dataAdmissao, dataRescisao);
		double ferias = salario / 12 * mesesTrabalhados;
		double decimoTerceiro = salario / 12 * mesesTrabalhados;
		double multa = salario * 0.4;
		return salario + ferias + decimoTerceiro + multa;
	}
}