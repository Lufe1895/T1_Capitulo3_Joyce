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
public class Paintings {
    private String pName;
    private String aName;
    private String medium;
    private Double price;
    
    private Double calculateComission(){
        return getPrice()*0.2;
    }
    
    public Paintings(){
        this.pName="aaaa";
        this.aName="bbbb";
        this.medium="cccc";
        this.price=0.0;
    }
    
    public String showPaintingInfo(){
        return String.format("Painting's name: %s\nAuthor's name: %s\nMedium: %s\nPrice: $%f\nComission: $%f\n",this.pName,this.aName,this.medium,this.price,calculateComission());
    }

    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the aName
     */
    public String getaName() {
        return aName;
    }

    /**
     * @param aName the aName to set
     */
    public void setaName(String aName) {
        this.aName = aName;
    }

    /**
     * @return the medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     * @param medium the medium to set
     */
    public void setMedium(String medium) {
        this.medium = medium;
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
