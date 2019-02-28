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
public class Student {
    private Integer id;
    private Double hours;
    private Double credits;
    private Double average;
    
    public Double cAverage(){
        return this.average=this.credits/this.hours;
    }
    
    public String displayStudent(){
        return String.format("Student ID: %d\nCredit hours earned: %f\nPoints Earned: %f\nAverage: %f\n",this.id,this.hours,this.credits,cAverage());
    }
    
    public Student(){
        this.id=9999;
        this.credits=12.0;
        this.hours=3.0;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hours
     */
    public Double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(Double hours) {
        this.hours = hours;
    }

    /**
     * @return the credits
     */
    public Double getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(Double credits) {
        this.credits = credits;
    }
    
    
}
