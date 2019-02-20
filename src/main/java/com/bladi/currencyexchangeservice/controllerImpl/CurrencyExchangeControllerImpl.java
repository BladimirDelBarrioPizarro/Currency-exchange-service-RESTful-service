package com.bladi.currencyexchangeservice.controllerImpl;

import com.bladi.currencyexchangeservice.controller.CurrencyExchangeController;
import com.bladi.currencyexchangeservice.model.ExchangeValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public class CurrencyExchangeControllerImpl implements CurrencyExchangeController {
    @Override
    public ExchangeValue retrieveExchangeValue(String from, String to) {
        return new ExchangeValue(100l,from,to,BigDecimal.valueOf(65));
    }
}
