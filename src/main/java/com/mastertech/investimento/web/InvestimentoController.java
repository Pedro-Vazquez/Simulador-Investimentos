package com.mastertech.investimento.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mastertech.investimento.persistence.Investimento;
import com.mastertech.investimento.service.InvestimentoService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService;

    @GetMapping("investimento")
    public List<Investimento> getAll(){
        List<Investimento> responses = new ArrayList<Investimento>();

        for(Investimento investimento : investimentoService.getAll()){
            responses.add(investimento);
        }

        return responses;
    }

    @PostMapping("investimento")
    public Investimento create(@RequestBody Investimento investimento){
        return investimentoService.create(investimento);
    }

}
