package com.bladi.currencyexchangeservice.model;








import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ExchangeValue implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;

    private BigDecimal conversionMultiple;
    private int port;

    public ExchangeValue(){}

    public ExchangeValue(long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;

    }


    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;

    }

    public long getId() {

        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }


}
