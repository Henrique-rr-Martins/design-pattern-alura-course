package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.efetuarCalculo(primeiro));
        System.out.println(calculadora.efetuarCalculo(segundo));
        System.out.println(calculadora.efetuarCalculo(terceiro));
    }
}
