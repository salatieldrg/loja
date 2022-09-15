package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class DescontoParaOrcamentosDeValoresMaioresQueQuinhentos extends Desconto {

	public DescontoParaOrcamentosDeValoresMaioresQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
