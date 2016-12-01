/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator.ui.Swing;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import moneycalculator.model.Currency;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;

/**
 *
 * @author usuario
 */
public class SwingMoneyDisplay extends JFrame implements MoneyDisplay {
    private Money money;

    public SwingMoneyDisplay(){
        setLayout(new FlowLayout());
    }

    
    @Override
    public void display(Money money) {
        this.money = money;
        this.removeAll();
        this.add(amount());
        this.add(currency());
    }

    private Component currency() {
        return new JLabel(money.getCurrency().getCode());
    }

    private Component amount() {
        return new JLabel(String.valueOf(money.getAmount()));
    }

}
