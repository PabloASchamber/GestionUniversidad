package grupo41.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
       private static final String bd = "ulp";
       private static final String url = "jdbc:mariadb://localhost:3306/";
       private static final String usuario = "root";
       private static final String pass = "";
       private static final String driver = "org.mariadb.jdbc.Driver";
       private static Connection cx;
    

    private ConexionBD() {
    }

    public static Connection conectar() {
        if (cx==null){
        try {
            
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, usuario, pass);
            System.out.println("conexion exitosa");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error en la conexion");
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        return cx;
    }
    
    public static Connection desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
           return cx;
    }

}

