/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author w_ara
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //ME CAGO EN 1000 
        
    }
    
    // Method to do math operations.
    public static int operation(int num1, int num2)
    {
        // Var declaration.
        int result = 0;
        
        // Adding Two Numbers.
        result = num1 + num2;
        
        
        return result;
    }
    
    // Method Overload.---> Same name but Differents Parameters. No inheritance needed
    public static int operation(int num1)
    {
        // Var declaration.
        int result = 0;
        
        // Number Squared.
        result = num1 * num1;
        
        
        return result;
    }
    
}
