package com.mastertech.investimento.web.dto;

import com.mastertech.investimento.persistence.Investimento;

public class InvestimentoPayload {
    private double valor;

    private int quantidadeMeses;

    private double montante;

    //region Get/Set
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeMeses() {
        return quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }
    //endregion

    public InvestimentoPayload() {
    }

    public InvestimentoPayload(Investimento investimento) {
        setValor(investimento.getValor());
        setQuantidadeMeses(investimento.getQuantidadeMeses());
        setMontante(investimento.getMontante());
    }

    public Investimento buildEntity() {
        Investimento investimento = new Investimento();
        investimento.setValor(getValor());
        investimento.setQuantidadeMeses(getQuantidadeMeses());
        investimento.setMontante(getMontante());
        return investimento;
    }


}
