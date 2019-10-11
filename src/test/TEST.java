/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author w_ara
 */
public class TEST 
{
    Scanner keyboard = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //ME CAGO EN 1000 
        Student myStudent = new Student(001);
        myStudent.setName("Miguelito");
        
        //Caso numero 2
        // Miguel lleno la inforamcion y que despues la envie, el sistema cree todo
        Student fullStudent =new Student("Pepito", 1001110);
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
    
    public static int operation(int num1, int num2, int num3) 
    {
        //int num2 = 0;
        int ans = 0;
        ans = num2+num2;
        return num2;
    }
    
}
