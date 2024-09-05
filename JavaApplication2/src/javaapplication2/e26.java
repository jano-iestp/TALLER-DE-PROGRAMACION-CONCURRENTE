/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12
 */
public class e26 {
    
public static void main(String[] args) {
        int edad, añosexpo;
      
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad: "));
        añosexpo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los años de experiencia: "));
        
        if (edad >=18 && añosexpo >=2)
            JOptionPane.showMessageDialog(null,"Eres elegible" );
        else 
            JOptionPane.showMessageDialog(null,"No eres elegible" );

    }
}
