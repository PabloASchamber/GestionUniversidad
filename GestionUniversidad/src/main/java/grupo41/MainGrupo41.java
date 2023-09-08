
package grupo41;

import grupo41.AccesoADatos.ConexionBD;
import java.sql.Connection;

public class MainGrupo41 {
    public static void main(String[] args) {
        Connection cbd = ConexionBD.conectar();
    }
}
