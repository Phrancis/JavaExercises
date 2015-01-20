package Chapter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francisveilleux-gaboury
 */
public class PowerOf {
    static double base = 100;
    static double exponent = 3;
    static double result = Math.pow(base, exponent);
    public static void main(String args[]) {
        System.out.println(base + " to the power of " + 
                             exponent + " equals " + result);
    }
}
