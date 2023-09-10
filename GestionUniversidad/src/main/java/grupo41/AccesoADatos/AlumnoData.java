
package grupo41.AccesoADatos;

import grupo41.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AlumnoData {
    private Connection con=null;

    public AlumnoData() {
        con=ConexionBD.conectar();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sqlAlumno="insert into alumno(dni, apellido, nombre, fechanacimiento, estado)values(?, ?, ?, ?, ? ) ";
        try {
            PreparedStatement ps = con.prepareStatement(sqlAlumno, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechanac()));
            ps.setBoolean(5, alumno.isEstadoA());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
              JOptionPane.showMessageDialog(null, "alumno agregado correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        String sqlModificar= "update alumno set dni= ?, apellido =?, nombre=?, fechanacimiento=?  where IdAlumno=? ";
        try {
            PreparedStatement ps= con.prepareStatement(sqlModificar);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechanac()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "alumno modificado correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
     }
    
    
     public void EliminarAlumno(int id){
         String sqlEliminar = "update alumno set estado= 0 where IdAlumno = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sqlEliminar);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "alumno eliminado");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
           
         
         
         
         
         
     }
    
    
    
    
    
     
}
