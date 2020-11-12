/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class Month {
    private int monthNumber;
    
    public Month(){
        this.monthNumber = 1;
    }
    
    public Month(int num){
        if(num >= 1 && num <= 12){
          this.monthNumber = num;  
        }
        else{
            this.monthNumber = 1;
        }
    }
    
    public Month(String monthName){
        switch (monthName){
                case "January": 
                    this.monthNumber = 1;
                    break;
                case "February":
                    this.monthNumber = 2;
                    break;
                case "March":
                    this.monthNumber = 3;
                    break;
                case "April":
                    this.monthNumber = 4;
                    break;
                case "May":
                    this.monthNumber = 5;
                    break;
                case "June":
                    this.monthNumber = 6;
                    break;
                case "July":
                    this.monthNumber = 7;
                    break;
                case "August":
                    this.monthNumber = 8;
                    break;
                case "September":
                    this.monthNumber = 9;
                    break;
                case "October":
                    this.monthNumber = 10;
                    break;
                case "November":
                    this.monthNumber = 11;
                    break;
                case "December":
                    this.monthNumber = 12;
                    break;
                    
                    
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = monthNumber;
        }
    }
    
    public String getMonthName(int monthNumber){
        String monthName = "";
        switch (monthNumber){
                case 1: 
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
        }
            return monthName;
                    
                    
    }

    @Override
    public String toString() {
        
        return "It is " + this.getMonthName(monthNumber);
    }
    
    public boolean equals(Month m){
        
        return this.getMonthNumber() == m.getMonthNumber();
        
    }
    
    public boolean greaterThan(Month m){
        
        return this.getMonthNumber() > m.getMonthNumber();
    }
    
    public boolean lessThan(Month m){
        
        return this.getMonthNumber() < m.getMonthNumber();
    }
    
}
