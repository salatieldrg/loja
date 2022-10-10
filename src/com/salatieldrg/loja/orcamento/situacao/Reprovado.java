package com.salatieldrg.loja.orcamento.situacao;

import com.salatieldrg.loja.orcamento.Orcamento;
import com.salatieldrg.loja.orcamento.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
