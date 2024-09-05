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
public class e29 {
    
    
public static void main(String[] args) {
        int edad ;
      
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad:  "));
        
        if (edad >=65)
            JOptionPane.showMessageDialog(null,"Eres un Adulto Mayor" );
        else if (edad >=18 && edad <=64)
            JOptionPane.showMessageDialog(null,"Eres un Adulto " );
        else if (edad >=13 && edad <18)
            JOptionPane.showMessageDialog(null,"Eres un Adolscente " );
        else
            JOptionPane.showMessageDialog(null,"Eres un Niño " );

    }
}
