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
public class MetricConversion {
    private static Double CM=2.54;
    private static Double L=3.7854;
    
    private Integer conversor;
    
    public MetricConversion(int conversor){
        this.conversor=conversor;
    }
    
    public Double inchesToCentimeters(){
        return this.conversor*CM;
    }
    
    public Double gallonsToLiters(){
        return this.conversor*L;
    }

    /**
     * @return the CM
     */
    public static Double getCM() {
        return CM;
    }

    /**
     * @return the L
     */
    public static Double getL() {
        return L;
    }

    /**
     * @return the conversor
     */
    public Integer getConversor() {
        return conversor;
    }

    /**
     * @param conversor the conversor to set
     */
    public void setConversor(Integer conversor) {
        this.conversor = conversor;
    }
    
    
    
}
