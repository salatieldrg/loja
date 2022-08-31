package com.salatieldrg.loja;

import java.math.BigDecimal;

import com.salatieldrg.loja.imposto.CalculadoraDeImpostos;
import com.salatieldrg.loja.imposto.ICMS;
import com.salatieldrg.loja.imposto.ISS;

public class TestesImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculador = new CalculadoraDeImpostos();
		System.out.println(calculador.calcular(orcamento, new ICMS()));
		System.out.println(calculador.calcular(orcamento, new ISS()));
	}
}
