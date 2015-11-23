
package alumnoobxectos;

import javax.swing.JOptionPane;


public class AlumnoObxectos {

  
    public static void main(String[] args) {
       
            
        String nom,tele,correo,resposta;
        float teorica,practica,boletins ;
      do{
        nom = Metodos.pedirDatosString("nome :");
        tele = Metodos.pedirDatosString("telefono :");
        correo = Metodos.pedirDatosString("correo electronico :");
        teorica = Metodos.pedirDatosFloat("teoria :");
        practica =Metodos.pedirDatosFloat("practica :");
        boletins = Metodos.pedirDatosFloat("boletins :");
        DatosPersoais per = new DatosPersoais(nom,tele,correo);
        Alumno alum = new Alumno (teorica,practica,boletins,per);
        JOptionPane.showMessageDialog(null, alum);
        resposta= JOptionPane.showInputDialog(" outro alumno :");
        
    }while(resposta.equalsIgnoreCase("si")); 
     
       
    }   
}
