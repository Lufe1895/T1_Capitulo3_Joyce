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
public class ArithmeticMethods2 {
        private Integer a;
    private Integer b;
    
    public ArithmeticMethods2(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    public ArithmeticMethods2(){
        this.a=0;
        this.b=0;
    }
    
    public String displayNumberPlus10(){
        return String.format("%d + 10 = %d\n%d + 10 = %d",this.a,this.a+10,this.b,this.b+10);
    }
    
    public String displayNumberPlus100(){
        return String.format("%d + 100 = %d\n%d + 100 = %d",this.a,this.a+100,this.b,this.b+100);
    }
    
    public String displayNumberPlus1000(){
        return String.format("%d + 1000 = %d\n%d + 1000 = %d",this.a,this.a+1000,this.b,this.b+1000);
    }
    
    /**
     * @return the a
     */
    public Integer getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Integer a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Integer getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Integer b) {
        this.b = b;
    }
}
