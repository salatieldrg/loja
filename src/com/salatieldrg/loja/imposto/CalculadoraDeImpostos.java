package com.salatieldrg.loja.imposto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Imposto;
import com.salatieldrg.loja.Orcamento;

public class CalculadoraDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
