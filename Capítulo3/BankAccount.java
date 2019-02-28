/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capítulo3;

/**
 *
 * @author luisl
 */
public class BankAccount {
    private String name;
    private Integer number;
    private Double balance;
    
    public BankAccount(){
        this.name="Luis Fernando Antonio Toral";
        this.number=12345;
        this.balance=2000.0;
    }
    
    public Double deductMonthlyFee(){
        return this.getBalance()-4;
    }
    
    public String explainAccountPolicy(){
        return String.format("The $4.00 fee will be deducted each month.");
    }
    
    public void showValues(){
        System.out.println(explainAccountPolicy());
        System.out.println("Account owner's name: "+this.name+"\nAccount number: "+this.number+"\nActual balance: "+this.balance+"\nNext month's balance: "+deductMonthlyFee());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
}
