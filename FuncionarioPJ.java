package RescisaoTrabalhista;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FuncionarioPJ extends Funcionario {
    private String cnpj;

    public FuncionarioPJ(String nome, String cpf, double salario, LocalDate dataAdmissao, String cnpj) {
        super(nome, cpf, salario, dataAdmissao);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public double calcularRescisao() {
        LocalDate dataRescisao = LocalDate.now();
        long mesesTrabalhados = ChronoUnit.MONTHS.between(getDataAdmissao(), dataRescisao);
        double valorPago = getSalario() * mesesTrabalhados;
        double multa = valorPago * 0.2;
		return multa;
        
    }
}