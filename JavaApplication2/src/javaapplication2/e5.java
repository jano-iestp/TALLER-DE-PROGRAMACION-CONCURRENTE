/*
1.	Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12
 */
public class e5 {
    
public static void main(String[] args) {
        float actual, cualquiera;
      
        actual=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el  año actual"));
        cualquiera=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese un año cualquiera "));
                
        if (cualquiera > actual ){
            JOptionPane.showMessageDialog(null,"Los años faltantes son: " +(cualquiera-actual));}
            else if(actual > cualquiera ){
            JOptionPane.showMessageDialog(null,"Los años que han pasado son: "+(actual-cualquiera) );
                    }
            else 
            JOptionPane.showMessageDialog(null,"Haz ingresado el mismo año " );
           

    }
}

