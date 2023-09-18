
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

    public InscripcionData() {
        con=ConexionBD.conectar();
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
        ArrayList<Inscripcion> inscripcion = new ArrayList<Inscripcion>();
        String ListaSql = "SELECT * FROM `inscripcion` WHERE idAlumno =1; ";
        AlumnoData aldat = new AlumnoData();
        MateriaData matdat = new MateriaData();
        Inscripcion insc=new Inscripcion();

        try {
            PreparedStatement ps = con.prepareStatement(ListaSql);
            ps.setInt(1, id);
            ps = con.prepareStatement(ListaSql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno nombre = aldat.buscarAlumno(id);
                Materia materia = matdat.buscarMateria(rs.getInt("idMateria"));
                insc.setIdInscripcion(rs.getInt("idInscripto"));
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
    
           
    public List<Materia> ListaMateriasNoCursadas(int id) {
      List<Materia>materias=new ArrayList<Materia>(); 
             String ListaSql="select * from materia where estado=1 and idMateria not in (select idmateria from inscripcion where idalumno =?)" ;
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

            
            public void BorrarInscripcionMateriaAlumno(int idMateria, int idAlumno){
                String sqlBorrar="delete from inscripcion where idalumno=? and idmateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(sqlBorrar);
            ps.setInt(1, idAlumno);
            ps.setInt(2,idMateria);
            int filas = ps.executeUpdate();
            if(filas>0){
                 JOptionPane.showMessageDialog(null, "inscripcion borrada ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }     
            }
            
    
       public void ActualizarNota(int idMateria, int idAlumno, double nota) {
        String sqlNota = "update inscripcion  set nota = ? where idalumno=? and idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlNota);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "nota actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "error al actualizar nota");
            }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
    }

       public List<Alumno> alumnosXmateria(int idMateria) {
           List<Alumno> AlumnosXmateria = new ArrayList<Alumno>();
           String ListaSql = "select idAlumno from inscripcion  where idMateria=?";
           AlumnoData aldat=new AlumnoData();
        try {
            PreparedStatement ps=con.prepareStatement(ListaSql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            Alumno nombre = aldat.buscarAlumno(rs.getInt("IdAlumno"));
            nombre.setApellido(rs.getString("apellido"));
            nombre.setNombre(rs.getString("nombre"));
            nombre.setDni(rs.getInt("dni"));
            nombre.setFechanac(rs.getDate("fechaNacimiento").toLocalDate());
            nombre.setIdAlumno(rs.getInt("idAlumno"));
            
            AlumnosXmateria.add(nombre);
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla inscripcion");
        }
        return AlumnosXmateria;

    }

}
