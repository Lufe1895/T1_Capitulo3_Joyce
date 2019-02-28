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
public class MyCharacter {
    private Integer nEyes;
    private Integer nLives;
    public String color;
    
    public MyCharacter(){
        this.nEyes=0;
        this.nLives=0;
        this.color="White";
    }
    
    public MyCharacter(int nEyes, int nLives, String color){
        this.nEyes=nEyes;
        this.nLives=nLives;
        this.color=color;
    }

    /**
     * @return the nEyes
     */
    public Integer getnEyes() {
        return nEyes;
    }

    /**
     * @param nEyes the nEyes to set
     */
    public void setnEyes(Integer nEyes) {
        this.nEyes = nEyes;
    }

    /**
     * @return the nLives
     */
    public Integer getnLives() {
        return nLives;
    }

    /**
     * @param nLives the nLives to set
     */
    public void setnLives(Integer nLives) {
        this.nLives = nLives;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
