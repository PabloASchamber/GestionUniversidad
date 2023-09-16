package grupo41.Entidades;

import java.time.LocalDate;

public class Alumno {
    
    private int IdAlumno, dni;
    private String nombre, apellido;
    private LocalDate fechanac;
    private boolean estadoA;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fechanac, boolean estadoA) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
        this.estadoA = estadoA;
    }

    public Alumno(int IdAlumno, int dni, String nombre, String apellido, LocalDate fechanac, boolean estadoA) {
        this.IdAlumno = IdAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
        this.estadoA = estadoA;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public boolean isEstadoA() {
        return estadoA;
    }

    public void setEstadoA(boolean estadoA) {
        this.estadoA = estadoA;
    }

    @Override
    public String toString() {
        return "Alumno{" +  ", nombre=" + nombre + ", apellido=" + apellido + "dni=" + dni + '}';
    }


    

  
    
    
}
