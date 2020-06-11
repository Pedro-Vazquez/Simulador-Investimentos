package com.mastertech.investimento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mastertech.investimento.persistence.Investimento;
import com.mastertech.investimento.persistence.InvestimentoRepository;
import java.util.List;

@Service
public class InvestimentoService {
    @Autowired
    private InvestimentoRepository investimentoRepository;
    private double taxa;

    public List<Investimento> getAll(){
        return investimentoRepository.findAll();
    }

    public Investimento create(Investimento investimento){
        calculaMontante(investimento);
        return investimentoRepository.save(investimento);
    }

    public void calculaMontante(Investimento investimento) {
        taxa = 0.007;
        investimento.setMontante(investimento.getValor() * Math.pow(1 + taxa, investimento.getQuantidadeMeses()));
    }
}
