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
public class e210 {
public static void main(String[] args) {
        int lado1,lado2,lado3 ;
      
        lado1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la longitud en cm del lado 1:  "));
        lado2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la longitud en cm del lado 2:  "));
        lado3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la longitud en cm del lado 3:  "));
        
        if (lado1 ==lado2 && lado2==lado3)
            JOptionPane.showMessageDialog(null,"El triangulo es equilatero" );
        else if (lado1 !=lado2 && lado3!=lado1)
            JOptionPane.showMessageDialog(null,"El triangulo es escaleno " );
        else 
            JOptionPane.showMessageDialog(null,"El triangulo es isóceles " );
    }
}
