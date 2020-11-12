/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class LandTract {
    private double length;
    private double width;
    
    public LandTract(){}
    
    public LandTract(double length, double width){
        if(length < 0 && width < 0){
        throw new  NumberFormatException ("Enter a number greater than 0");
        }
        else{
            this.length  = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        
        if(length < 0){
        throw new  NumberFormatException ("Enter a number greater than 0");
        }
        else{
            this.length  = length;
            
        }
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
          if(width < 0){
            throw new  NumberFormatException ("Enter a number greater than 0");
        }
        else{
            this.width  = width;
            
        }
    }
    public double getArea(){
        return this.length * this.width;
    }
    
    public boolean equals(LandTract l){
        return this.getArea() == l.getArea();
    }

    @Override
    public String toString() {
        return "LandTract{" + "length= " + length + ", width= " + width + '}';
    }
    
    
    
}
