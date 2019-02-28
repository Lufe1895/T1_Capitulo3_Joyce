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
public class Insurance {
    private static final Integer ADDITION=15;
    private static final Integer MULTIPLIER=20;
    
    private Integer currentYear;
    private Integer birthYear;
    
    public Insurance(int currentYear,int birthYear){
        this.currentYear=currentYear;
        this.birthYear=birthYear;
    }
    
    public Integer premiumAmount(){
        return ((this.currentYear-this.birthYear)/10+ADDITION)*MULTIPLIER;
    }
}
