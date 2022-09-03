package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;
	public abstract BigDecimal calcular(Orcamento orcamento);
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
}
