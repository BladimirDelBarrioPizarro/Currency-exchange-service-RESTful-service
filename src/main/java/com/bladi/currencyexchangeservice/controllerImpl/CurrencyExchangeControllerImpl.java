package com.bladi.currencyexchangeservice.controllerImpl;

import com.bladi.currencyexchangeservice.controller.CurrencyExchangeController;
import com.bladi.currencyexchangeservice.model.ExchangeValue;
import com.bladi.currencyexchangeservice.repository.ExchangeValueRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


import java.math.BigDecimal;

public class CurrencyExchangeControllerImpl implements CurrencyExchangeController {

    private static final Log logger = LogFactory.getLog(CurrencyExchangeControllerImpl.class);

    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeValueRepository repository;

    @Override
    public ExchangeValue retrieveExchangeValue(String from, String to) {
        logger.info(" -- GET /currency-exchange/from/"+from+"/to/"+to);

        ExchangeValue ev = repository.findByFromAndTo(from,to);

        ev.setPort(Integer.parseInt(this.environment.getProperty("local.server.port")));
        return ev;
    }
}
