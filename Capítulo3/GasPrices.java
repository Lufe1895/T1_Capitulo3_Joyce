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
public class GasPrices {
    private Double min;
    private Double max;
    private Double price;
    
    public GasPrices(double price){
        this.price=price;
        this.min=this.price*3.5/100;
        this.max=this.price*4.0/100;
    }
    
    public String printPrice(){
        return String.format("The price at the pump is between $%f and $%f.",this.min,this.max);
    }

    /**
     * @return the min
     */
    public Double getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public Double getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
