package com.bladi.currencyexchangeservice.controller;

import com.bladi.currencyexchangeservice.model.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public interface CurrencyExchangeController extends Serializable {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    ExchangeValue retrieveExchangeValue(@PathVariable String from , @PathVariable String to);
}
