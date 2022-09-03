package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class DescontoParaOrcamentosDeValoresMaioresQueQuinhentos extends Desconto{
	
	public DescontoParaOrcamentosDeValoresMaioresQueQuinhentos(Desconto proximo) {
		super(proximo);
	}
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {

		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcular(orcamento);
	}
}
