
package grupo41;

import grupo41.AccesoADatos.ConexionBD;
import grupo41.Vistas.Vista;
import java.sql.Connection;

public class MainGrupo41 {
    
    public static void main(String[] args) {

        Connection cbd = ConexionBD.conectar();
        Vista inicio = new Vista();
        
    }

}