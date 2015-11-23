
package alumnoobxectos;

public class DatosPersoais {
    private String nome,correoElec,telefono;

    public DatosPersoais() {
    }

    public DatosPersoais(String nome, String correoElec, String telefono) {
        this.nome = nome;
        this.correoElec = correoElec;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DatosPersoais{" + "nome=" + nome + ", correoElec=" + correoElec + ", telefono=" + telefono + '}';
    }
    
    
}
