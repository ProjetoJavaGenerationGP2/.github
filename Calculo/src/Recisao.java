import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Recisao {

    String nome, sInicioTrabalho, sFimTrabalho;
    LocalDate inicioTrabalho,fimTrabalho;
    int diasTrabalhados = fimTrabalho.getDayOfMonth();
    int diasDoMes = fimTrabalho.lengthOfMonth();
    long mesesTrabalhados = ChronoUnit.MONTHS.between(inicioTrabalho, fimTrabalho);
    boolean demissaoVoluntario;
    int feirasVencidas;
    LocalDate monthsOfWork;
    float salario, saldoSalario;

    public Recisao(String nome, String sInicioTrabalho, String sFimTrabalho, boolean demissaoVoluntario, int feirasVencidas, float salario) {
        this.nome = nome;
        this.sInicioTrabalho = sInicioTrabalho;
        this.sFimTrabalho = sFimTrabalho;
        this.demissaoVoluntario = demissaoVoluntario;
        this.feirasVencidas = feirasVencidas;
        this.salario = salario;
    }

    public Recisao(String nome, String sInicioTrabalho, String sFimTrabalho, LocalDate inicioTrabalho, LocalDate fimTrabalho, int diasTrabalhados, int diasDoMes, long mesesTrabalhados, boolean demissaoVoluntario, int feirasVencidas, LocalDate monthsOfWork, float salario, float saldoSalario) {
        this.nome = nome;
        this.sInicioTrabalho = sInicioTrabalho;
        this.sFimTrabalho = sFimTrabalho;
        this.inicioTrabalho = inicioTrabalho;
        this.fimTrabalho = fimTrabalho;
        this.diasTrabalhados = diasTrabalhados;
        this.diasDoMes = diasDoMes;
        this.mesesTrabalhados = mesesTrabalhados;
        this.demissaoVoluntario = demissaoVoluntario;
        this.feirasVencidas = feirasVencidas;
        this.monthsOfWork = monthsOfWork;
        this.salario = salario;
        this.saldoSalario = saldoSalario;
    }

    public Recisao(int diasTrabalhados, int diasDoMes, int feirasVencidas, float salario) {
        this.diasTrabalhados = diasTrabalhados;
        this.diasDoMes = diasDoMes;
        this.feirasVencidas = feirasVencidas;
        this.salario = salario;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getsInicioTrabalho() {
        return sInicioTrabalho;
    }

    public void setsInicioTrabalho(String sInicioTrabalho) {
        this.sInicioTrabalho = sInicioTrabalho;
    }

    public String getsFimTrabalho() {
        return sFimTrabalho;
    }

    public void setsFimTrabalho(String sFimTrabalho) {
        this.sFimTrabalho = sFimTrabalho;
    }

    public LocalDate getInicioTrabalho() {
        return inicioTrabalho;
    }

    public void setInicioTrabalho(LocalDate inicioTrabalho) {
        this.inicioTrabalho = inicioTrabalho;
    }

    public LocalDate getFimTrabalho() {
        return fimTrabalho;
    }

    public void setFimTrabalho(LocalDate fimTrabalho) {
        this.fimTrabalho = fimTrabalho;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public int getDiasDoMes() {
        return diasDoMes;
    }

    public void setDiasDoMes(int diasDoMes) {
        this.diasDoMes = diasDoMes;
    }

    public long getMesesTrabalhados() {
        return mesesTrabalhados;
    }

    public void setMesesTrabalhados(long mesesTrabalhados) {
        this.mesesTrabalhados = mesesTrabalhados;
    }

    public boolean isDemissaoVoluntario() {
        return demissaoVoluntario;
    }

    public void setDemissaoVoluntario(boolean demissaoVoluntario) {
        this.demissaoVoluntario = demissaoVoluntario;
    }

    public int getFeirasVencidas() {
        return feirasVencidas;
    }

    public void setFeirasVencidas(int feirasVencidas) {
        this.feirasVencidas = feirasVencidas;
    }

    public LocalDate getMonthsOfWork() {
        return monthsOfWork;
    }

    public void setMonthsOfWork(LocalDate monthsOfWork) {
        this.monthsOfWork = monthsOfWork;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldoSalario() {
        return saldoSalario;
    }

    public void setSaldoSalario(float saldoSalario) {
        this.saldoSalario = saldoSalario;
    }

    public LocalDate monthsOfWork(){
        return fimTrabalho.minusMonths(inicioTrabalho.getMonthValue());
    }
}
