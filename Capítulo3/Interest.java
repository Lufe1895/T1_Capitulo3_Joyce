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
public class Interest {
    private static final Double INVESTMENT=1.05;
    
    private Double amount;
    
    public Interest(double amount){
        this.amount=amount;
    }
    
    public String investment(){
        return String.format("In one year you could have up to $%f",this.amount*INVESTMENT);
    }
}
