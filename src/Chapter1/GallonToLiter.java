/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter1;

/**
 *
 * @author francisveilleux-gaboury
 */
public class GallonToLiter {
    public static final double CONVERSION_RATIO = 3.7854;
    public static void main(String args[]) {
        double gallons = 3.827;
        double liters = gallons * CONVERSION_RATIO;
        System.out.println(gallons + " gallons equals " +
                           liters + " liters.");
    }
}
