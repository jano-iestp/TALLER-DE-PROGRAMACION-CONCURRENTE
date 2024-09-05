/*
 3.	Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12
 */
public class e3 {
    
public static void main(String[] args) {
        int n;
      
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el  numero"));
        
        if (n>999 ){
            JOptionPane.showMessageDialog(null,"ERROR!!! " );}
            else if(n >99 ){
            JOptionPane.showMessageDialog(null,"El numero tiene 3 cifras " );
                    }
            else if(n >9 ){
            JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras " );
                    }
            else if(n >0 ){
            JOptionPane.showMessageDialog(null,"El numero tiene 1 cifra " );
                    }
    }
    
}
