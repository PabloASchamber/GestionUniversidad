
package grupo41.AccesoADatos;

import grupo41.Entidades.Alumno;
import grupo41.Entidades.Inscripcion;
import grupo41.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
        
    }
    
    
    public List<Inscripcion>listaInscripciones(){
        
        
        
        return null;
        
    }
    
        public List<Inscripcion>listaInscripcionesPorAlumno(int id){
        
        
        
        return null;
        
    }
    
         public List<Materia>ListaMateriasCursadas(int id){
             List<Materia>materias=new ArrayList<Materia>(); 
             String ListaSql="select inscripcion.IdMateria, nombre, anio from inscripcion JOIN materia ON (inscripción.idMateria=materia.idMateria) where inscripcion.idAlumno=?;  ";
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
             
             
         return null;
         }
    
         
         
            public List<Materia>ListaMateriasNoCursadas(){
             
             
         return null;
             
             
         }
    
            
            public void BorrarInscripcionMateriaAlumno(int idMateria, int idAlumno){
                
                
            }
            
    
            public void ActualizarNota(int idMateria, int idAlumno, double nota){
                
                
            }
    
            
             public List<Alumno>alumnosXmateria(int idMateria){
             
             
         return null;
             
             
         }
       
    
    
}
