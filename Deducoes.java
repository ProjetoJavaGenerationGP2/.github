package CalculadoraTrabalhista;

public class Deducoes extends Proventos {

	// (********** SALDO SALARIO **********)//

	// (********** CALCULO INSS**********)
	// private double baseINSS = 7507.49;

	public Deducoes(float saldoSalario, float ferias, float decimoTerceiro) {
		super(saldoSalario, ferias, decimoTerceiro);

	}

	// FAIXA 1 = 0 até 1.302,00
	private double inss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private double inss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private double inss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private double inss4 = 0.14;

	public double calcularINSS(double saldoSalario) { // saldo salario

		if (saldoSalario <= 1302.00) {
			return saldoSalario * inss1;
		} else if (saldoSalario >= 1302.01 && saldoSalario <= 2571.29) {
			return saldoSalario * inss2;
		} else if (saldoSalario >= 2571.30 && saldoSalario <= 3856.94) {
			return saldoSalario * inss3;
		} else {
			return saldoSalario * inss4;
		}
	}

	// (********** CALCULO IRRF**********) // saldo salario
	// private double baseIRRF = 4664.68;
	// FAIXA 1 = até 1.903.98
	private double irrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private double irrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private double irrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private double irrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private double irrf5 = 0.275;

	public double calcularIRRF(double saldoSalario) {
		double baseCalculo = saldoSalario - calcularINSS(saldoSalario);

		if (baseCalculo <= 1903.98) {
			return irrf1;
		} else if (baseCalculo >= 1903.99 && baseCalculo <= 2826.65) {
			return (baseCalculo * irrf2) - 142.80;
		} else if (baseCalculo >= 2826.66 && baseCalculo <= 3751.05) {
			return (baseCalculo * irrf3) - 354.80;
		} else if (baseCalculo >= 3751.06 && baseCalculo <= 4664.68) {
			return (baseCalculo * irrf4) - 636.13;
		} else {
			return (baseCalculo * irrf5) - 869.36;
		}
	}
	// (********** FÉRIAS **********)//

	// (********** CALCULO INSS**********)
	// private double feriasInss = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private double feriasInss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private double feriasInss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private double feriasInss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private double feriasInss4 = 0.14;

	public double calcularFeriasINSS(double ferias) { // alterar para ferias //
		if (ferias <= 1302.00) {
			return ferias * feriasInss1;
		} else if (ferias >= 1302.01 && ferias <= 2571.29) {
			return ferias * feriasInss2;
		} else if (ferias >= 2571.30 && ferias <= 3856.94) {
			return ferias * feriasInss3;
		} else {
			return ferias * feriasInss4;
		}
	}

	// (********** CALCULO IRRF**********)
	// private double feriasIrrf = 4664.68;
	// FAIXA 1 = até 1.903.98
	private double FeriasIrrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private double FeriasIrrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private double FeriasIrrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private double FeriasIrrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private double FeriasIrrf5 = 0.275;

	public double calcularFeriasIRRF(double ferias) {
		double baseCalculoFerias = ferias - calcularFeriasINSS(ferias);

		if (baseCalculoFerias <= 1903.98) {
			return FeriasIrrf1;
		} else if (baseCalculoFerias >= 1903.99 && baseCalculoFerias <= 2826.65) {
			return (baseCalculoFerias * FeriasIrrf2) - 142.80;
		} else if (baseCalculoFerias >= 2826.66 && baseCalculoFerias <= 3751.05) {
			return (baseCalculoFerias * FeriasIrrf3) - 354.80;
		} else if (baseCalculoFerias >= 3751.06 && baseCalculoFerias <= 4664.68) {
			return (baseCalculoFerias * FeriasIrrf4) - 636.13;
		} else {
			return (baseCalculoFerias * FeriasIrrf5) - 869.36;
		}
	}

	// (********** 13º SALARIO **********)//

	// (********** CALCULO INSS**********)
	// private double decimoTerceiroInss = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private double decimoTerceiroInss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private double decimoTerceiroInss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private double decimoTerceiroInss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private double decimoTerceiroInss4 = 0.14;

	public double calcularDecimoINSS(double decimoTerceiro) { // alterar para 13 terceiro //
		if (decimoTerceiro <= 1302.00) {
			return decimoTerceiro * decimoTerceiroInss1;
		} else if (decimoTerceiro >= 1302.01 && decimoTerceiro <= 2571.29) {
			return decimoTerceiro * decimoTerceiroInss2;
		} else if (decimoTerceiro >= 2571.30 && decimoTerceiro <= 3856.94) {
			return decimoTerceiro * decimoTerceiroInss3;
		} else {
			return decimoTerceiro * decimoTerceiroInss4;
		}
	}

	// (********** CALCULO IRRF**********)
	// private double decimoTerceiroIrrf = 4664.68;
	// FAIXA 1 = até 1.903.98
	private double decimoTerceiroIrrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private double decimoTerceiroIrrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private double decimoTerceiroIrrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private double decimoTerceiroIrrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private double decimoTerceiroIrrf5 = 0.275;

	public double calcularDecimoIRRF(double decimoTerceiro) {
		double baseCalculoDecimo = decimoTerceiro - calcularINSS(decimoTerceiro);

		if (baseCalculoDecimo <= 1903.98) {
			return decimoTerceiroIrrf1;
		} else if (baseCalculoDecimo >= 1903.99 && baseCalculoDecimo <= 2826.65) {
			return (baseCalculoDecimo * decimoTerceiroIrrf2) - 142.80;
		} else if (baseCalculoDecimo >= 2826.66 && baseCalculoDecimo <= 3751.05) {
			return (baseCalculoDecimo * decimoTerceiroIrrf3) - 354.80;
		} else if (baseCalculoDecimo >= 3751.06 && baseCalculoDecimo <= 4664.68) {
			return (baseCalculoDecimo * decimoTerceiroIrrf4) - 636.13;
		} else {
			return (baseCalculoDecimo * decimoTerceiroIrrf5) - 869.36;
		}

	}

}
