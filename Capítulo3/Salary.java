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
public class Salary {
    private static final Integer WEEK=5;
    private static final Double EXTRA=1.5;
    
    private Double regularHours;
    private Double extraHours;
    private Double payRate;
    
    public Salary(double regularHours,double extraHours,double payRate){
        this.extraHours=extraHours;
        this.payRate=payRate;
        this.regularHours=regularHours;
    }
    
    public Double weeklySalary(){
        return this.regularHours*WEEK*payRate + this.extraHours*EXTRA*this.payRate;
    }
}
