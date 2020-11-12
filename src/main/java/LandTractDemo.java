
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class LandTractDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        LandTract landTract1 = new LandTract();
        LandTract landTract2 = new LandTract();
        
        System.out.println("Enter the length of Land Tract 1: ");
        landTract1.setLength(keyboard.nextDouble());
        
        System.out.println("Enter the width Land Tract 1: ");
        landTract1.setWidth(keyboard.nextDouble());
        
        System.out.println("Enter the length of Land Tract 2: ");
        landTract2.setLength(keyboard.nextDouble());
        
        System.out.println("Enter the width of Land Tract 2: ");
        landTract2.setWidth(keyboard.nextDouble());
        
        System.out.println(landTract1.toString());
        System.out.println(landTract2.toString()); 
        
        System.out.println("Area of Land Tract 1: " + landTract1.getArea());
        System.out.println("Area of Land Tract 2: " + landTract2.getArea());
        
        if (landTract1.equals(landTract2)){
            System.out.println("The two tracts of land are equal");
        }
        else
            System.out.println("The two tracts of land are not equal");
    }
}

    