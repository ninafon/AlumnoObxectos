
package alumnoobxectos;

import javax.swing.JOptionPane;


public class Metodos {
    
      public static float pedirDatosFloat(String dato){
        return Float.parseFloat(JOptionPane.showInputDialog(dato));
    }
      public static String pedirDatosString(String dato){
          return (JOptionPane.showInputDialog(dato));
      }
    
}
