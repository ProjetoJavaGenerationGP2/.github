package RescisaoTrabalhista;

import java.time.LocalDate;

public class FuncionarioCLT extends Funcionario {
    private String cargo;

    public FuncionarioCLT(String nome, String cpf, double salario, LocalDate dataAdmissao, String cargo) {
        super(nome, cpf, salario, dataAdmissao);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}