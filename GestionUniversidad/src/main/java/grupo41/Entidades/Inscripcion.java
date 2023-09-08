package grupo41.Entidades;

public class Inscripcion {
    
    private int IdInscripcion;
    private Alumno alumno;
    private Materia materia;
    double nota;

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int IdInscripcion, Alumno alumno, Materia materia, double nota) {
        this.IdInscripcion = IdInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return IdInscripcion;
    }

    public void setIdInscripcion(int IdInscripcion) {
        this.IdInscripcion = IdInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc=IdInscripcion+" "+alumno.getApellido()+" "+alumno.getNombre()+" "+materia.getNombre();
        return insc;
    }

    
    
}
