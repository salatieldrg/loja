package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class DescontoParaOrcamentosComMaisDeCincoItens extends Desconto{
	
	public DescontoParaOrcamentosComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcular(orcamento);
	}
}
