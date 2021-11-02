package br.com.beerapi.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerStockExceededException extends Exception{

    public BeerStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Beer with id %s not found in the system.  ", id, quantityToIncrement));
    }
}
