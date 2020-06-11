package com.mastertech.investimento.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoServiceTest {
    //TODO implementar teste unitário do Service.
    
    private InvestimentoService investimentoService;

    @BeforeEach
    void setUp() {
        investimentoService = new InvestimentoService();
    }

    @AfterEach
    void tearDown() {
        investimentoService = null;
    }

    @Test
    void testaCalculoDoMontante() {

    }
}