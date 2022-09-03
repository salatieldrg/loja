package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return BigDecimal.ZERO;
	}
}
