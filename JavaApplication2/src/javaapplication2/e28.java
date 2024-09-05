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
public class e28 {
    
public static void main(String[] args) {
        int estatura ;
      
        estatura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la estatura en cm "));
        
        if (estatura >=120 && estatura <200)
            JOptionPane.showMessageDialog(null,"La persona SI puede montarse en la atraccion" );
        else 
            JOptionPane.showMessageDialog(null,"La persona NO puede montarse en la atraccion" );

    }
}

