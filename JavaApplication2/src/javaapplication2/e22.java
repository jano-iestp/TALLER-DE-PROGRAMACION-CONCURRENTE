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
public class e22 {
    
public static void main(String[] args) {
        int n1, n2,n3;
      
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 1"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 2 "));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 3 "));
        if (n1 <10 && n2<10 && n3<10 )
            JOptionPane.showMessageDialog(null,"Todos los numeros son menores a 10 ");
                    
    }
}