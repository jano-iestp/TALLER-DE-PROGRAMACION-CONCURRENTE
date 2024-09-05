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
public class e21 {
    
public static void main(String[] args) {
        int mes, dia;
      
        mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un mes"));
        dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un dia "));
                
        if (mes ==12 && dia ==25 )
            JOptionPane.showMessageDialog(null,"Es Navidad :3: ");
                    
            else 
            JOptionPane.showMessageDialog(null,"No es Navidad  " );
           

    }
}

