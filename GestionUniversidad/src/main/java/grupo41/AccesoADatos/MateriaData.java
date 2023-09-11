
package grupo41.AccesoADatos;

import grupo41.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
        private Connection con=null;

    public MateriaData() {
        con=ConexionBD.conectar();
    }
    
 public void GuardarMateria(Materia materia){
     String sqlMateria="INSERT INTO materia (Nombre, anio, estado) VALUES (?, ?, ?)";
            try {
                PreparedStatement ps = con.prepareStatement(sqlMateria, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnioMateria());
                ps.setBoolean(3, true);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
            }
 }    
    
 public Materia buscarMateria(int id){
       String sqlBuscar="select nombre, anio from materia where idMateria=? and estado=1";
       Materia materia= null;   
            try {
                PreparedStatement ps = con.prepareStatement(sqlBuscar);
                ps.setInt(1, id);
                ResultSet rs =ps.executeQuery();
                if(rs.next()){
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("anio"));
                    materia.setEstadoM(true);
                } else{
                JOptionPane.showMessageDialog(null, "no existe esa materia");
            } 
             ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
            }
            return materia;
 }
 
 public void modificarMateria(Materia materia){
     String sqlModificar= "update materia set  nombre=?, anio=? where idMateria=?";
            try {
                PreparedStatement ps= con.prepareStatement(sqlModificar);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnioMateria());
                ps.setInt(3, materia.getIdMateria());
                int exito = ps.executeUpdate();
                if(exito==1){
                JOptionPane.showMessageDialog(null, "materia modificada correctamente");
            }
                
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
            }
 }
 
 
 public void eliminarMateria(int id){
     String sqlEliminar = "update materia set estado= 0 where idMateria = ?";
       PreparedStatement ps;
            try {
                ps = con.prepareStatement(sqlEliminar);
                 ps.setInt(1, id);
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "materia eliminada");
            }
              
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
            }
 }
 
 public List<Materia>ListarMaterias(){
         String Listasql = "SELECT  IdMateria ,  nombre ,  anio  FROM  materia  WHERE estado=1";
         ArrayList<Materia> materias = new ArrayList<>();
         
         try {
           PreparedStatement ps = con.prepareStatement(Listasql);
            ResultSet rs =ps.executeQuery();
            
            while (rs.next()){
                Materia materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
            
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla alumno");
        }
        return materias;
     }

        
}
