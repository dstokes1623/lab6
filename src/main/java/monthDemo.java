/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class monthDemo {
    public static void main(String[] args) {
        // test all constructors
        Month month1 = new Month();
        Month month2 = new Month(6);
        Month month3 = new Month("July");
        
        // test toString, getMonthName, and constructor accuracy
        System.out.println(month1.toString() + " " + month2.toString() + " " + month3.toString());
        
        // test bad month number input
        Month testMonth = new Month(-5);
        System.out.println(testMonth.toString());
        
        // test setMonth Number
        month2.setMonthNumber(-5);
        System.out.println(month2.getMonthNumber());
        
        // test equals method
        Month monthToCompare = new Month(7);
        System.out.println(month3.equals(monthToCompare));
        
        // test greaterThan method
        System.out.println(month3.greaterThan(monthToCompare));
        
        // test lessThan method
        System.out.println(month2.lessThan(monthToCompare));
        
    }
}
