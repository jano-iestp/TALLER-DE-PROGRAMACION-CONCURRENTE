/*
1.	Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 */
package javaapplication2;
import javax.swing.JOptionPane;
/**
 *
 * @author 12
 */
public class e1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola");
        int num1,num2,num3;
        //double n4;
        //float n,suma;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 1er numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 2do numero"));
        num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 3er numero"));
        //n4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el 4to numero"));
        //n=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el 5to numero"));
        if (num1>=num2 && num1 >=num3 ){
            JOptionPane.showMessageDialog(null,"El numero mayor es: \n "+num1 );}
            else if(num2>=num1 && num2 >=num3 ){
            JOptionPane.showMessageDialog(null,"El numero mayor es: \n "+num2 );
                    }
                    else
                JOptionPane.showMessageDialog(null,"El numero mayor es: \n "+num3 );
        //JOptionPane.showMessageDialog(null,"La suma total seria: \n "+suma );
        // TODO code application logic here
    }
    
}
