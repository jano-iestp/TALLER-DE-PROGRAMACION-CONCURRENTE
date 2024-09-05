/*
 * To change this license header, choose Lice   nse Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import javax.swing.JOptionPane;
/**
 *
 * @author 12
 */
public class nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola");
        int edad;
        String nombre;
        //double n4;
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad"));
                    
        
        JOptionPane.showMessageDialog(null,"Su nombre es "+nombre + " y su edad es " +edad);
        // TODO code application logic here
    }
    
}
