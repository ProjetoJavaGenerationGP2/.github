package CalculadoraTrabalhista;

public class Proventos extends Rescisao {
	float saldoSalario, ferias, decimoTerceiro,totalProventos=0;

	public Proventos(int diasTrabalhados, int diasDoMes, int feirasVencidas, float salario, float saldoSalario,
			float ferias, float decimoTerceiro) {
		super(diasTrabalhados, diasDoMes, feirasVencidas, salario);
		this.saldoSalario = saldoSalario;
		this.ferias = ferias;
		this.decimoTerceiro = decimoTerceiro;
	}

	public Proventos(float saldoSalario, float ferias, float decimoTerceiro) {
		super(saldoSalario, ferias, decimoTerceiro);
		this.saldoSalario = saldoSalario;
		this.ferias = ferias;
		this.decimoTerceiro = decimoTerceiro;
		// TODO Auto-generated constructor stub
	}
	

	public Proventos(float totalProventos, float totalProventos2) {
		super(totalProventos);
		totalProventos = totalProventos2;
	}

	public float getTotalProventos() {
		return totalProventos;
	}

	public void setTotalProventos(float totalProventos) {
		this.totalProventos = totalProventos;
	}

	public float getSaldoSalario() {
		return saldoSalario;
	}

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

	public float calculoSaldoSalario() {
		saldoSalario = diasTrabalhados * (salario / diasDoMes);
		return saldoSalario;
	}

	public float calculoFerias() {
		ferias = salario + (salario / 3) + (salario * feirasVencidas);
		return ferias;
	}

	public float calculo13() {
		decimoTerceiro = (salario / 12) * getFimTrabalho().getMonthValue();
		return decimoTerceiro;
	}
	
	public void calculototalProventos() {
		float totalProventos = saldoSalario +  ferias +  decimoTerceiro;
		
		
	}

}
