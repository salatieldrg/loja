package com.salatieldrg.loja.orcamento.situacao;

import com.salatieldrg.loja.DomainException;
import com.salatieldrg.loja.orcamento.Orcamento;
import com.salatieldrg.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {
    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("O.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
