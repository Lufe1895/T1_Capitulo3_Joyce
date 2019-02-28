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
public class Card {
    private final String SUITS []={"Spades","Hearts","Diamonds","Clubs"};
    private final String CARDS []={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    
    private Integer nSuit;
    private Integer nCard;
    
    public Card(){
        this.nSuit=0;
        this.nCard=0;
    }
    
    public void getTwoCards(){
        this.nSuit=(int)(Math.random()*4);
        this.nCard=(int)(Math.random()*13);
        System.out.print("You've got "+CARDS[nCard]+" of "+SUITS[nSuit]+" and ");
        this.nSuit=(int)(Math.random()*4);
        this.nCard=(int)(Math.random()*13);
        System.out.println(CARDS[nCard]+" of "+SUITS[nSuit]+".");
    }
    
    /**
     * @return the SUITS
     */
    public String[] getSUITS() {
        return SUITS;
    }

    /**
     * @return the CARDS
     */
    public String[] getCARDS() {
        return CARDS;
    }

    /**
     * @return the nSuit
     */
    public Integer getnSuit() {
        return nSuit;
    }

    /**
     * @param nSuit the nSuit to set
     */
    public void setnSuit(Integer nSuit) {
        this.nSuit = nSuit;
    }

    /**
     * @return the nCard
     */
    public Integer getnCard() {
        return nCard;
    }

    /**
     * @param nCard the nCard to set
     */
    public void setnCard(Integer nCard) {
        this.nCard = nCard;
    }
    
}
