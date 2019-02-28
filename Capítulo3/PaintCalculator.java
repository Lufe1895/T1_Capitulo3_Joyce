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
public class PaintCalculator {
    public static final Integer PRICE=32;
    public static final Integer COVER=350;
    
    private Integer l;
    private Integer a;
    private Integer al;
    
    public PaintCalculator(int al,int a,int l){
        this.l=l;
        this.a=a;
        this.al=al;
    }
    
    public Integer calcularArea(){
        return this.l*this.al*2+this.a*this.al*2;
    }
    
    public Integer numGalones(){
        return calcularArea()/COVER + (calcularArea()%COVER > 0 ? 1:0);
    }
    
    public Integer cost(){
        return numGalones()*PRICE;
    }
}
