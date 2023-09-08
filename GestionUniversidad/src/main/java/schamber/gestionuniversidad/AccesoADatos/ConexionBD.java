package schamber.gestionuniversidad.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private String url, bd, usuario, pass, driver;
    private Connection cx;

    private ConexionBD() {
        bd = "ulp";
        url = "jdbc:mariadb://localhost:3306/";
        usuario = "root";
        pass = "";
        driver = "org.mariadb.jdbc.Driver";

    }

    public Connection conectar() {
        try {

            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, usuario, pass);
            System.out.println("conexion exitosa");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error en la conexion");
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

