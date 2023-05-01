package Calculo_Rescisao;

public class B_Deducoes {

	// (********** SALDO SALARIO **********)//

	// (********** CALCULO INSS**********)
	private float baseINSS = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private float inss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private float inss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private float inss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private float inss4 = 0.14;

	public float calcularINSS(float salarioBruto) { // saldo salario
		if (salarioBruto <= 1302.00) {
			return salarioBruto * inss1;
		} else if (salarioBruto >= 1302.01 && salarioBruto <= 2571.29) {
			return salarioBruto * inss2;
		} else if (salarioBruto >= 2571.30 && salarioBruto <= 3856.94) {
			return salarioBruto * inss3;
		} else if (salarioBruto >= 3856.95 && salarioBruto <= 7507.49) {
			return salarioBruto * inss4;
		}
	}

	// (********** CALCULO IRRF**********) // saldo salario
	private float baseIRRF = 4664.68;
	// FAIXA 1 = até 1.903.98
	private float irrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private float irrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private float irrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private float irrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private float irrf5 = 0.275;

	public static float calcularIRRF(float salarioBruto) {
		float baseCalculo = salarioBruto - calcularINSS(salarioBruto);

		if (baseCalculo <= 1903.98) {
			return 0.0;
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
	private float baseFeriasInss = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private float feriasInss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private float feriasInss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private float feriasInss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private float feriasInss4 = 0.14;

	public float calcularFeriasINSS(float baseFerias) { // alterar para ferias //
		if (baseFerias <= 1302.00) {
			return baseFerias * feriasInss1;
		} else if (baseFerias >= 1302.01 && baseFerias <= 2571.29) {
			return baseFerias * feriasInss2;
		} else if (baseFerias >= 2571.30 && baseFerias <= 3856.94) {
			return baseFerias * feriasInss3;
		} else if (baseFerias >= 3856.95 && baseFerias <= 7507.49) {
			return baseFerias * feriasInss4;
		}
	}

	// (********** CALCULO IRRF**********)
	private float baseFeriasIrrf = 4664.68;
	// FAIXA 1 = até 1.903.98
	private float FeriasIrrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private float FeriasIrrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private float FeriasIrrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private float FeriasIrrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private float FeriasIrrf5 = 0.275;

	public static float calcularFeriasIRRF(float baseFerias) {
		float baseCalculoFerias = baseFerias - calcularINSS(baseFerias);

		if (baseCalculoFerias <= 1903.98) {
			return 0.0;
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
	private float baseDecimoInss = 7507.49;
	// FAIXA 1 = 0 até 1.302,00
	private float baseDecimoInss1 = 0.075;
	// FAIXA 2 = 1.302,01 até 2.571,29
	private float baseDecimoInss2 = 0.09;
	// FAIXA 3 = 2.571,30 até 3.856,94
	private float baseDecimoInss3 = 0.12;
	// FAIXA 4 = 3.856,95 até 7.507,49
	private float baseDecimoInss4 = 0.14;

	public float calcularDecimoINSS(float baseDecimo) { // alterar para 13 terceiro //
		if (baseDecimo <= 1302.00) {
			return baseDecimo * baseDecimoInss1;
		} else if (baseDecimo >= 1302.01 && baseDecimo <= 2571.29) {
			return baseDecimo * baseDecimoInss2;
		} else if (baseDecimo >= 2571.30 && baseDecimo <= 3856.94) {
			return baseDecimo * baseDecimoInss3;
		} else if (baseDecimo >= 3856.95 && baseDecimo <= 7507.49) {
			return baseDecimo * baseDecimoInss4;
		}
	}

	// (********** CALCULO IRRF**********)
	private float baseDecimoIrrf = 4664.68;
	// FAIXA 1 = até 1.903.98
	private float baseDecimoIrrf1 = 0.0;
	// FAIXA 2 = 1.903.99 até 2.826.65
	private float baseDecimoIrrf2 = 0.075;
	// FAIXA 3 = 2.826.66 até 3.751,05
	private float baseDecimoIrrf3 = 0.15;
	// FAIXA 4 = 3.751,06 até 4.664,68
	private float baseDecimoIrrf4 = 0.225;
	// FAIXA 5 = acima 4.664,69
	private float baseDecimoIrrf5 = 0.275;

	public float calcularDecimoIRRF(float baseDecimo) {
		float baseCalculoDecimo = baseDecimo - calcularINSS(baseDecimo);

		if (baseCalculoDecimo <= 1903.98) {
			return 0.0;
		} else if (baseCalculoDecimo >= 1903.99 && baseCalculoDecimo <= 2826.65) {
			return (baseCalculoDecimo * baseDecimoIrrf2) - 142.80;
		} else if (baseCalculoDecimo >= 2826.66 && baseCalculoDecimo <= 3751.05) {
			return (baseCalculoDecimo * baseDecimoIrrf3) - 354.80;
		} else if (baseCalculoDecimo >= 3751.06 && baseCalculoDecimo <= 4664.68) {
			return (baseCalculoDecimo * baseDecimoIrrf4) - 636.13;
		} else {
			return (baseCalculoDecimo * baseDecimoIrrf5) - 869.36;
		}
		
		

	}

}
