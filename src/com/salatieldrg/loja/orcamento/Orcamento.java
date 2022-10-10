package com.salatieldrg.loja.orcamento;

import com.salatieldrg.loja.orcamento.situacao.EmAnalise;

import java.math.BigDecimal;

public class Orcamento {
	private BigDecimal valor;
	private int quantidade;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra(){
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public void aprovar(){
		this.situacao.aprovar(this);
	}

	public void reprovar(){
		this.situacao.reprovar(this);
	}

	public void finalizar(){
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
}
