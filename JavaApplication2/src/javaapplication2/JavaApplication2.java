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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola");
        int num1,num2,nombre;
        //double n4;
        float n,suma;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 1er numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 2do numero"));
        nombre=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el 3er numero"));
        //n4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el 4to numero"));
        n=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el 5to numero"));
        suma=num1+num2+nombre+n;
        JOptionPane.showMessageDialog(null,"La suma total seria: \n "+suma );
        // TODO code application logic here
    }
    
}
