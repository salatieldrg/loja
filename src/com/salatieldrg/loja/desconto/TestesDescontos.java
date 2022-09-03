package com.salatieldrg.loja.desconto;

import java.math.BigDecimal;

import com.salatieldrg.loja.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);
		CalculadoraDeDescontos desconto = new CalculadoraDeDescontos();
		System.out.println(desconto.calcular(orcamento));
		System.out.println(desconto.calcular(orcamento2));
	}
}
