
package alumnoobxectos;

import javax.swing.JOptionPane;

public class Alumno {
    public static int refe ;
    private float notTeorica,notPractica,boletins ;
    private DatosPersoais persoal;
    private int referencia;

    public Alumno() {
    refe ++ ;
    referencia = refe;
    
    }
    public Alumno(float notTeorica, float notPractica, float boletins, DatosPersoais persoal) {
        refe ++;
        referencia= refe;
        this.notTeorica = notTeorica;
        this.notPractica = notPractica;
        this.boletins = boletins;
        this.persoal = persoal;
    }

   

    public float getNotTeorica() {
        return notTeorica;
    }

    public void setNotTeorica(float notTeorica) {
        this.notTeorica = notTeorica;
    }

    public float getNotPractica() {
        return notPractica;
    }

    public void setNotPractica(float notPractica) {
        this.notPractica = notPractica;
    }

    public float getBoletins() {
        return boletins;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }

    public DatosPersoais getPersoal() {
        return persoal;
    }

    public void setPersoal(DatosPersoais persoal) {
        this.persoal = persoal;
    }

    @Override
    public String toString() {
        return "Alumno{" +"\n referencia"+ referencia + "\n notTeorica=" + notTeorica + "\n notPractica=" + notPractica + "\n boletins=" + boletins + " \n"+ persoal + '}';
    }
    
    public float acharNotaMedia(){
        return ( notTeorica*0.40f + notPractica * 0.40f + boletins);
        
    }
  
    
}
