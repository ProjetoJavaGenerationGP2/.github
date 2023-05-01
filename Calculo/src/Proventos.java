import java.time.LocalDate;

public class Proventos extends Recisao{

    float saldoSalario, ferias, decimoTerceiro;

    public Proventos(int diasTrabalhados, int diasDoMes, int feirasVencidas, float salario, float saldoSalario, float ferias, float decimoTerceiro) {
        super(diasTrabalhados, diasDoMes, feirasVencidas, salario);
        this.saldoSalario = saldoSalario;
        this.ferias = ferias;
        this.decimoTerceiro = decimoTerceiro;
    }

    @Override
    public float getSaldoSalario() {
        return saldoSalario;
    }

    @Override
    public void setSaldoSalario(float saldoSalario) {
        this.saldoSalario = saldoSalario;
    }

    public float getFerias() {
        return ferias;
    }

    public void setFerias(float ferias) {
        this.ferias = ferias;
    }

    public float getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(float decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
    }

    public float calculoSaldoSalario (){
        saldoSalario = diasTrabalhados * (salario / diasDoMes ) ;
        return saldoSalario;
    }

    public float calculoFerias (){
        ferias = salario + (salario / 3 ) + (salario * feirasVencidas) ;
        return ferias;
    }

    public float calculo13 (){
        decimoTerceiro = (salario / 12 )*getFimTrabalho().getMonthValue() ;
        return decimoTerceiro;
    }




}
