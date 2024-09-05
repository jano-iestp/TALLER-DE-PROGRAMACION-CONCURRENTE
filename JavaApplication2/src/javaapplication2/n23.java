package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 12
 */
public class n23 {
    
public static void main(String[] args) {
        int n1, n2,n3;
      
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 1"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 2 "));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero 3 "));
        if (n1 >=10 && n2>=10 && n3<10 )
            JOptionPane.showMessageDialog(null,"Alguno de los valores es menor a 10 ");
        else if ((n1 >=10 && n2<10 && n3>=10 ))
                JOptionPane.showMessageDialog(null,"Alguno de los valores es menor a 10 ");
        else if ((n1 <10 && n2>=10 && n3>=10 ))
                JOptionPane.showMessageDialog(null,"Alguno de los valores es menor a 10 ");
    }
}
