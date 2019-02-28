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
public class Sandwich {
    private String ingredient;
    private String breadType;
    private Double price;
    
    public Sandwich(){
        this.ingredient="tuna";
        this.ingredient="wheat";
        this.price=4.99;
    }

    /**
     * @return the ingredient
     */
    public String getIngredient() {
        return ingredient;
    }

    /**
     * @param ingredient the ingredient to set
     */
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * @return the breadType
     */
    public String getBreadType() {
        return breadType;
    }

    /**
     * @param breadType the breadType to set
     */
    public void setBreadType(String breadType) {
        this.breadType = breadType;
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
