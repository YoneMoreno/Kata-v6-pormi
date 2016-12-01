/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.model;

/**
 *
 * @author usuario
 */
public class Currency {
    private String symbol;
    private String name;
    private String code;
    

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Currency(String symbol, String name, String code) {
        this.symbol = symbol;
        this.name = name;
        this.code = code;
    }
}
