package com.mastertech.investimento.persistence;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Investimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double valor;

    private int quantidadeMeses;

    private double montante;

    private double taxa;

    public void calculaMontante() {
        setTaxa(0.007);
        setMontante(getValor() * Math.pow(1 + getTaxa(), getQuantidadeMeses()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
