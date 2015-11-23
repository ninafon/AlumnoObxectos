
package alumnoobxectos;

import javax.swing.JOptionPane;

public class Alumno {
    public static int referencia ;
    private float notTeorica,notPractica,boletins ;
    private DatosPersoais persoal;

    public Alumno() {
    referencia ++ ;
    }
    public Alumno(float notTeorica, float notPractica, float boletins, DatosPersoais persoal) {
        referencia ++;
        this.notTeorica = notTeorica;
        this.notPractica = notPractica;
        this.boletins = boletins;
        this.persoal = persoal;
    }

    public static int getReferencia() {
        return referencia;
    }

    public static void setReferencia(int referencia) {
        Alumno.referencia = referencia;
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
