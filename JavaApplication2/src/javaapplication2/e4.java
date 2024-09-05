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
public class e4 {
    
public static void main(String[] args) {
        float total, correcto, porcentaje;
      
        total=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el  numero total de preguntas"));
        correcto=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el  numero preguntas correctas "));
        porcentaje = correcto*100/total;
                
        if (porcentaje >=90 ){
            JOptionPane.showMessageDialog(null,"Nivel maximo " );}
            else if(porcentaje >=75 && porcentaje<90 ){
            JOptionPane.showMessageDialog(null,"Nivel medio " );
                    }
            else if(porcentaje >=50 &&  porcentaje<75){
            JOptionPane.showMessageDialog(null,"Nivel regular " );
                    }
            else if(porcentaje <50 ){
            JOptionPane.showMessageDialog(null,"Fuera de nivel " );

    }
}
}
