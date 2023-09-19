package grupo41.Entidades;

public class Materia {
    
    private int IdMateria, anioMateria;
    private String nombre;
    private boolean estadoM;

    public Materia() {
    }

    public Materia(int anioMateria, String nombre, boolean estadoM) {
        this.anioMateria = anioMateria;
        this.nombre = nombre;
        this.estadoM = estadoM;
    }

    public Materia(int IdMateria, int anioMateria, String nombre, boolean estadoM) {
        this.IdMateria = IdMateria;
        this.anioMateria = anioMateria;
        this.nombre = nombre;
        this.estadoM = estadoM;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoM() {
        return estadoM;
    }

    public void setEstadoM(boolean estadoM) {
        this.estadoM = estadoM;
    }

    @Override
    public String toString() {
        return "Materia{" + "Id " + IdMateria +  ", " + nombre + '}';
    }
    
    
    
    
}
