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
public class e25 {
    
    public static void main(String[] args) {
            int n1, n2;

            n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la absisa: "));
            n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la ordenada: "));

            if (n1 >0 && n2>0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al 1er cuadrante" );
            else if (n1 <0 && n2>0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al 2do cuadrante" );
            else if (n1 <0 && n2<0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al 3er cuadrante" );
            else if (n1 >0 && n2<0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al 4to cuadrante" );
            else if (n1 ==0 && n2==0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al origen" );
            else if (n1 ==0 && n2!=0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al eje de las absisas" );
            else if (n1 !=0 && n2==0)
                JOptionPane.showMessageDialog(null,"iLa coordenada "+n1+","+n2+" pertenece al eje de las ordenadas " );
        }
    }
