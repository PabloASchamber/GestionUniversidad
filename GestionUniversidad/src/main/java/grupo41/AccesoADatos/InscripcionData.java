
package grupo41.AccesoADatos;

import grupo41.Entidades.Alumno;
import grupo41.Entidades.Inscripcion;
import grupo41.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    private Connection con=null;
    MateriaData matDat;
    AlumnoData alDat;

    public InscripcionData(MateriaData matDat, AlumnoData alDat) {
        con=ConexionBD.conectar();
        this.matDat = matDat;
        this.alDat = alDat;
    }

    public void guardarInscripcion(Inscripcion insc){
        String sqlInscripcion="insert into inscripcion(nota, idAlumno, idMateria)values(?, ?, ? ) ";
        try {
            PreparedStatement ps = con.prepareStatement(sqlInscripcion, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                 JOptionPane.showMessageDialog(null, "inscripcion correcta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
    }
    
    
    public List<Inscripcion>listaInscripciones(){
        List<Inscripcion>inscripcion=new ArrayList<Inscripcion>(); 
        String ListaSql="select * from  inscripcion ";
        AlumnoData aldat=new AlumnoData();
        MateriaData matdat= new MateriaData();
        try {
            PreparedStatement ps = con.prepareStatement(ListaSql);
            ResultSet rs =ps.executeQuery();
              while (rs.next()){
                Alumno nombre = aldat.buscarAlumno(rs.getInt("IdAlumno"));
                Materia materia = matdat.buscarMateria(rs.getInt("idMateria"));
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setAlumno(nombre);
                insc.setMateria(materia);
                insc.setNota(rs.getDouble("nota"));
                inscripcion.add(insc);
              }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
        return inscripcion;
    }
    
    
    public List<Inscripcion> listaInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripcion = new ArrayList<Inscripcion>();
        String ListaSql = "select * from  inscripcion where IdAlumno=?";
        AlumnoData aldat = new AlumnoData();
        MateriaData matdat = new MateriaData();

        try {
            PreparedStatement ps = con.prepareStatement(ListaSql);
            ps.setInt(1, id);
            ps = con.prepareStatement(ListaSql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno nombre = aldat.buscarAlumno(rs.getInt("IdAlumno"));
                Materia materia = matdat.buscarMateria(rs.getInt("idMateria"));
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setAlumno(nombre);
                insc.setMateria(materia);
                insc.setNota(rs.getDouble("nota"));
                inscripcion.add(insc);
            }
               ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
        return inscripcion;

    }
    
         public List<Materia>ListaMateriasCursadas(int id){
             List<Materia>materias=new ArrayList<Materia>(); 
             String ListaSql="select inscripcion.IdMateria, nombre, anio from inscripcion JOIN materia ON (inscripcion.idMateria=materia.idMateria) where inscripcion.idAlumno=?;  ";
        try {
            PreparedStatement ps = con.prepareStatement(ListaSql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
         return materias;
         }
    
    // corregir string sql 
         
             public List<Materia> ListaMateriasNoCursadas() {
        List<Materia> materias = new ArrayList<Materia>();
        String ListaSql = "select * materia from materia join inscripción on (materia.idmateria = inscripción.idmateria) ";
        try {
            PreparedStatement ps = con.prepareStatement(ListaSql);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
        return materias;
    }

            
            public void BorrarInscripcionMateriaAlumno(int idMateria, int idAlumno){
                
                
            }
            
    
            public void ActualizarNota(int idMateria, int idAlumno, double nota){
                
                
            }
    
            
             public List<Alumno>alumnosXmateria(int idMateria){
             
             
         return null;
             
             
         }
       
    
    
}
