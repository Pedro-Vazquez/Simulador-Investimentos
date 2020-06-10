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

    public List<Investimento> getAll(){
        return investimentoRepository.findAll();
    }

    public Investimento create(Investimento investimento){
        investimento.calculaMontante();
        return investimentoRepository.save(investimento);
    }
}
