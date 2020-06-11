package com.mastertech.investimento.web;

import com.mastertech.investimento.web.dto.InvestimentoPayload;
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
    public List<InvestimentoPayload> getAll() {
        List<InvestimentoPayload> responses = new ArrayList<>();

        for (Investimento investimento : investimentoService.getAll()) {
            responses.add(new InvestimentoPayload(investimento));
        }

        return responses;
    }

    @PostMapping("investimento")
    public InvestimentoPayload create(@RequestBody InvestimentoPayload investimentoPayload) {
        Investimento investimento = investimentoPayload.buildEntity();
        return new InvestimentoPayload(investimentoService.create(investimento));
    }

}
