/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.model;

/**
 *
 * @author usuario
 */
public class Money {
    private String amount;
    private Currency currency;

    public String getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money(String amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
