/*
2.	Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, negativo o nulo (es decir cero)
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12
 */
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola");
        int n;
        //double n4;
      
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 1er numero"));
        
        if (n>0 ){
            JOptionPane.showMessageDialog(null,"El numero es positivo " );}
            else if(n ==0 ){
            JOptionPane.showMessageDialog(null,"El numero es nulo " );
                    }
                    else
                JOptionPane.showMessageDialog(null,"El numero es negativo " );
        //JOptionPane.showMessageDialog(null,"La suma total seria: \n "+suma );
        // TODO code application logic here
    }
    
}


