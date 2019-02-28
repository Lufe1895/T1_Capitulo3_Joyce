/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCap3;
import Capítulo3.ArithmeticMethods;
import Capítulo3.ArithmeticMethods2;
import Capítulo3.BankAccount;
import Capítulo3.Card;
import Capítulo3.CarlysEventPrice;
import Capítulo3.GasPrices;
import Capítulo3.Insurance;
import Capítulo3.Interest;
import Capítulo3.MetricConversion;
import Capítulo3.MyCharacter;
import Capítulo3.PaintCalculator;
import Capítulo3.Paintings;
import Capítulo3.Percentages;
import Capítulo3.Percentages2;
import Capítulo3.Salary;
import Capítulo3.SammysRentalPrice;
import Capítulo3.Sandwich;
import Capítulo3.Student;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("***************************************************************Arithmethic Methods");
        Scanner Sc = new Scanner(System.in);
        
        ArithmeticMethods am = new ArithmeticMethods(9,1000);
        
        System.out.println(am.displayNumberPlus10());
        System.out.println("\n"+am.displayNumberPlus100());
        System.out.println("\n"+am.displayNumberPlus1000());
        
        int a,b;
        
        System.out.println("Input first integer:");
        a=Sc.nextInt();
        System.out.println("Input second integer:");
        b=Sc.nextInt();
        
        ArithmeticMethods2 am2 = new ArithmeticMethods2(a,b);

        System.out.println(am2.displayNumberPlus10());
        System.out.println("\n"+am2.displayNumberPlus100());
        System.out.println("\n"+am2.displayNumberPlus1000());
        
        System.out.println("*******************************************************************Percentages");
        
        Percentages pg = new Percentages(5.0,10.0);
        
        System.out.println(pg.computePercent());
        
        double percentages1,percentages2;
        
        System.out.println("Input first double:");
        percentages1=Sc.nextDouble();
        System.out.println("Input second double:");
        percentages2=Sc.nextDouble();
        
        Percentages2 pg2 = new Percentages2(percentages1,percentages2);
        System.out.println(pg2.computePercent());
        
        System.out.println("******************************************************************Price per barrel");
        
        double pricePerBarrel;
       
        System.out.println("Input the price per barrel:");
        
        pricePerBarrel=Sc.nextDouble();
        
        GasPrices gp = new GasPrices(pricePerBarrel);
        
        System.out.println(gp.printPrice());
        
        System.out.println("*****************************************************************Metric Conversion");
        
        int conv;
        
        System.out.println("Input any Integer number:");
        conv=Sc.nextInt();
        
        MetricConversion conver = new MetricConversion(conv);
        
        System.out.println(conver.getConversor()+" inches equals to "+conver.inchesToCentimeters()+" centimeters.");
        System.out.println(conver.getConversor()+" gallons equals to "+conver.gallonsToLiters()+" liters.");
       
        System.out.println("******************************************************************Paint Calculator");
        
        int length,width,height;
        
        System.out.println("Input height:");
        height=Sc.nextInt();
        System.out.println("Input width:");
        width=Sc.nextInt();
        System.out.println("Input length:");
        length=Sc.nextInt();
        
        PaintCalculator pc = new PaintCalculator(height,width,length);
        
        pc.calcularArea();
        pc.numGalones();
        
        System.out.println("The cost to paint your room is $"+pc.cost());
       
        System.out.println("*****************************************************************Insurance");
        
        int currentYear,birthYear;
        
        System.out.println("Input your birth year:");
        birthYear=Sc.nextInt();
        System.out.println("Input the current year:");
        currentYear=Sc.nextInt();
        
        Insurance insurance = new Insurance(birthYear,currentYear);
        
        System.out.println("Your premium amount is $"+insurance.premiumAmount()+".00.");
       
        System.out.println("*******************************************************************Salary");
        
        double regularHours,extraHours,payRate;
        
        System.out.println("Inpur your pay rate:");
        payRate=Sc.nextDouble();
        System.out.println("Input your regular hours:");
        regularHours=Sc.nextDouble();
        System.out.println("Input your extra hours:");
        extraHours=Sc.nextDouble();
        
        Salary salary = new Salary(regularHours,extraHours,payRate);
        
        System.out.println("Your weekly salary is $"+salary.weeklySalary());
        
        System.out.println("*******************************************************************Interests");
        
        Double amount;
        
        System.out.println("Input your amount of money:");
        amount=Sc.nextDouble();
        
        Interest interest = new Interest(amount);
        
        System.out.println(interest.investment());
        
        System.out.println("******************************************************************Sandwiches");
        
        Scanner teclado=new Scanner(System.in);
        
        Sandwich sandwich = new Sandwich();
        String ingredient,breadType;
        Double cost;
        
        System.out.println("Input main ingredient for your sandwich:");
        ingredient=teclado.nextLine();
        sandwich.setIngredient(ingredient);
        
        System.out.println("Input your bread type:");
        breadType=teclado.nextLine();
        sandwich.setBreadType(breadType);
        
        System.out.println("Input sandwich cost:");
        cost=teclado.nextDouble();
        sandwich.setPrice(cost);
        
        System.out.println("Your sandwich's main ingredient is "+sandwich.getIngredient()+" and your bread type is "+sandwich.getBreadType()+" and it's price is $"+sandwich.getPrice()+".");
        
        System.out.println("*******************************************************************Students");
        
        Student s1 = new Student();
        Student s2 = new Student();
        int id;
        Double hours,credits;
        
        System.out.println("Input student's ID:");
        id=teclado.nextInt();
        s1.setId(id);
        
        System.out.println("Input student's credit hours earned:");
        hours=Sc.nextDouble();
        s1.setHours(hours);
        
        System.out.println("Input student's points earned:");
        credits=Sc.nextDouble();
        s1.setCredits(credits);
        
        System.out.println(s1.displayStudent());
        System.out.println(s2.displayStudent());
        System.out.println("*******************************************************************Bank Accounts");
        Scanner Sc1 = new Scanner (System.in);
        
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        String name;
        Double balance;
        Integer number;
        
        System.out.println("Input account owner's name:");
        name=Sc1.nextLine();
        acc2.setName(name);
        
        System.out.println("Input account number:");
        number=Sc.nextInt();
        acc2.setNumber(number);
        
        System.out.println("Input owner's balance:");
        balance=Sc.nextDouble();
        acc2.setBalance(balance);
       
        acc1.showValues();
        System.out.println("\n");
        acc2.showValues();
        
        System.out.println("********************************************************************Paintings");
        
        Paintings paint1=new Paintings();
        Paintings paint2=new Paintings();
        Paintings paint3=new Paintings();
        
        String aName,pName,medium,aName1,pName1,medium1;
        Double price,price1;
        
        System.out.println("Input painting's name:");
        pName=Sc1.nextLine();
        paint1.setpName(pName);
        
        System.out.println("Input author's name:");
        aName=Sc1.nextLine();
        paint1.setaName(aName);
        
        Scanner Sc2 = new Scanner (System.in);
        
        System.out.println("Input medium:");
        medium=Sc2.nextLine();
        paint1.setMedium(medium);
        
        System.out.println("Input price:");
        price=Sc.nextDouble();
        paint1.setPrice(price);
        
        System.out.println("Input painting's name:");
        pName1=Sc2.nextLine();
        paint2.setpName(pName1);
        
        System.out.println("Input author's name:");
        aName1=Sc2.nextLine();
        paint2.setaName(aName1);
        
        System.out.println("Input medium:");
        medium1=Sc2.nextLine();
        paint2.setMedium(medium1);
        
        System.out.println("Input price:");
        price1=teclado.nextDouble();
        paint2.setPrice(price1);
        
        System.out.println(paint1.showPaintingInfo());
        System.out.println(paint2.showPaintingInfo());
        System.out.println(paint3.showPaintingInfo());
        
        System.out.println("The gallery commission will be deducted by the 20% of its price.");
        
        System.out.println("****************************************************Cards");
        
        Card card = new Card();
        
        card.getTwoCards();
        
        System.out.println("****************************************************Characters");
        
        int nEyes,nLives;
        String color,color1;
        
        MyCharacter c1=new MyCharacter();
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("Input number of eyes for character 1:");
        nEyes=Sc.nextInt();
        System.out.println("Input number of lives for character 1:");
        nLives=Sc.nextInt();
        System.out.println("Input color for character 1:");
        color=teclado2.nextLine();
        
        c1.setColor(color);
        c1.setnEyes(nEyes);
        c1.setnLives(nLives);
        
        System.out.println("Input number of eyes for character 2:");
        nEyes=Sc.nextInt();
        System.out.println("Input number of lives for character 2:");
        nLives=Sc.nextInt();
        System.out.println("Input color for character 2:");
        color1=teclado2.nextLine();
        
        MyCharacter c2 = new MyCharacter(nEyes,nLives,color1);
        
        System.out.println("Character 1 has "+c1.getnEyes()+" eyes, "+c1.getnLives()+" lives and is "+c1.getColor()+".");
        System.out.println("Character 2 has "+c2.getnEyes()+" eyes, "+c2.getnLives()+" lives and is "+c2.getColor()+".");
       
       System.out.println("****************************************************Carly's Event Price");
        
        int guests;
        
        System.out.println("Input number of guests:");
        guests=Sc.nextInt();
        
        CarlysEventPrice cep = new CarlysEventPrice(guests);
        
        System.out.println(cep.carlysMotto2());
        System.out.println(cep.toString());
        System.out.println(cep.isLarge());
        
        System.out.println("****************************************************Sammy's Rental Price");
        
        int minutes;
        
        System.out.println("Input minutes:");
        minutes=Sc.nextInt();
        
        SammysRentalPrice total = new SammysRentalPrice(minutes);
        
        System.out.println(total.motto());
        System.out.println(total.toString());
        
    }
}
