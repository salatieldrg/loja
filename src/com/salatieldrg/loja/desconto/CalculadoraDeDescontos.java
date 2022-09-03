package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentosComMaisDeCincoItens(
				new DescontoParaOrcamentosDeValoresMaioresQueQuinhentos(
						new SemDesconto()));
		
		
		return desconto.calcular(orcamento);
	}
}
