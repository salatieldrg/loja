package com.salatieldrg.loja.imposto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Imposto;
import com.salatieldrg.loja.Orcamento;

public class ISS implements Imposto{
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
