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
public class e24 {
    
public static void main(String[] args) {
        int n1, n2,n3;
      
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 1"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 2 "));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 3 "));
        
        if (n1 ==n2 && n2==n3)
            JOptionPane.showMessageDialog(null,"imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero es:  " +((n1+n2)*n3) );

    }
}