package com.bladi.currencyexchangeservice.controllerImpl;

import com.bladi.currencyexchangeservice.controller.CurrencyExchangeController;
import com.bladi.currencyexchangeservice.model.ExchangeValue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public class CurrencyExchangeControllerImpl implements CurrencyExchangeController {

    private static final Log logger = LogFactory.getLog(CurrencyExchangeControllerImpl.class);

    @Autowired
    private Environment environment;

    @Override
    public ExchangeValue retrieveExchangeValue(String from, String to) {
        logger.info(" -- GET //currency-exchange/from/"+from+"/to/"+to);
        ExchangeValue ev = new ExchangeValue(100l,from,to,BigDecimal.valueOf(65));
        ev.setPort(Integer.parseInt(this.environment.getProperty("local.server.port")));
        return ev;
    }
}
