package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy implements Orcavel {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento){
        this.valor = valor;
        this.orcamento = orcamento;
    }

    public BigDecimal getValor(){
        if(valor == null){
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}
