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
public class Percentages {
    private Double a;
    private Double b;
    
    public Percentages(double a, double b){
        this.a=a;
        this.b=b;
    }
    
    public Percentages(){
        this.a=0.0;
        this.b=0.0;
    }
    
    public String computePercent(){
        return String.format("%f is %f percent of %f", this.getA(),this.getA()*100/this.getB(), this.getB());
    }

    /**
     * @return the a
     */
    public Double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Double b) {
        this.b = b;
    }
}
