package com.salatieldrg.loja.orcamento.situacao;

import com.salatieldrg.loja.orcamento.Orcamento;
import com.salatieldrg.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {
    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("O.05"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }

}
