package com.bladi.currencyexchangeservice.boot;

import com.bladi.currencyexchangeservice.controller.CurrencyExchangeController;
import com.bladi.currencyexchangeservice.controllerImpl.CurrencyExchangeControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public CurrencyExchangeController currencyExchangeController(){
        return new CurrencyExchangeControllerImpl();
    }


}
