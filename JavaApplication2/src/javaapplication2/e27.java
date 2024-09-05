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
public class e27 {
    
public static void main(String[] args) {
        int nota, asistencia;
        float asistenciaporcentaje;
      
        nota=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la calificacion "));
        asistencia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los días asistidos: "));
        asistenciaporcentaje =asistencia*100/16;
        
        if (asistenciaporcentaje >=70 && nota >=13)
            JOptionPane.showMessageDialog(null,"El alumno aprueba" );
        else 
            JOptionPane.showMessageDialog(null,"El alumno no aprueba" );

    }
}