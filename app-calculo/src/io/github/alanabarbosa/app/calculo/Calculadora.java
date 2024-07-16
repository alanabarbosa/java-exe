package io.github.alanabarbosa.app.calculo;

import io.github.alanabarbosa.app.calculo.interno.*;

public class Calculadora {
	
	private OperacoesAritmeticas opArtimeticas = new OperacoesAritmeticas();
	
	public double soma(double... nums) {
		return opArtimeticas.soma(nums);
	}
}
