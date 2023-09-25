package grupo41.Vistas;

import grupo41.AccesoADatos.AlumnoData;
import grupo41.AccesoADatos.ConexionBD;
import grupo41.Entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FormularioDeAlumnos extends javax.swing.JInternalFrame {

    public FormularioDeAlumnos() {
        initComponents();
        Connection cbd = ConexionBD.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTF_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRB_estado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jB_Buscar = new javax.swing.JButton();
        jB_nuevo = new javax.swing.JButton();
        jB_eliminar = new javax.swing.JButton();
        jB_guardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setText("D.N.I.");

        jLabel2.setText("Apellido");

        jTF_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_apellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("nombre");

        jLabel4.setText("estado");

        jRB_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_estadoActionPerformed(evt);
            }
        });

        jLabel5.setText("fecha de nacimiento");

        jLabel6.setText("Alumno");

        jB_Buscar.setText("Buscar");
        jB_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BuscarMouseClicked(evt);
            }
        });

        jB_nuevo.setText("Nuevo");
        jB_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_nuevoMouseClicked(evt);
            }
        });

        jB_eliminar.setText("Eliminar");
        jB_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_eliminarMouseClicked(evt);
            }
        });

        jB_guardar.setText("Guardar");
        jB_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_guardarMouseClicked(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_nuevo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRB_estado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTF_dni)
                                            .addComponent(jTF_apellido)
                                            .addComponent(jTF_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                        .addGap(117, 117, 117)
                                        .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jB_eliminar)
                                .addGap(80, 80, 80)
                                .addComponent(jB_guardar)
                                .addGap(88, 88, 88)
                                .addComponent(jBSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRB_estado))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_nuevo)
                    .addComponent(jB_eliminar)
                    .addComponent(jB_guardar)
                    .addComponent(jBSalir))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_apellidoActionPerformed

    private void jRB_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_estadoActionPerformed

    private void jB_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BuscarMouseClicked
        AlumnoData alumno = new AlumnoData();
        Integer dni = Integer.parseInt(jTF_dni.getText());
        Alumno al = alumno.buscarAlumnoDni(dni);
        jTF_apellido.setText(al.getApellido());
        jTF_nombre.setText(al.getNombre());
        LocalDate f = al.getFechanac();
        Date d = Date.from(f.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDateChooser1.setDate(d);
        if(al.isEstadoA()){
        jRB_estado.setSelected(true);
                }
    }//GEN-LAST:event_jB_BuscarMouseClicked

    private void jB_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_nuevoMouseClicked
        jTF_apellido.setText("");
        jTF_dni.setText("");
        jTF_nombre.setText("");
        jDateChooser1.setDate(null);
        jRB_estado.setSelected(false);
    }//GEN-LAST:event_jB_nuevoMouseClicked

    private void jB_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_guardarMouseClicked
        AlumnoData alumno = new AlumnoData();
        Integer dni = Integer.parseInt(jTF_dni.getText());
//        Alumno al = alumno.buscarAlumnoDni(dni);
//       if(al.isEstadoA()){
//        String apellido = jTF_apellido.getText();
//        String nombre = jTF_nombre.getText();
//        boolean estado = jRB_estado.isSelected();
//        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        Alumno a = new Alumno(dni, nombre, apellido, fecha, estado);
//        alumno.modificarAlumno(a);
//        }else{
        String apellido = jTF_apellido.getText();
        String nombre = jTF_nombre.getText();
        boolean estado = jRB_estado.isSelected();
        LocalDate fecha = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Alumno a = new Alumno(dni, nombre, apellido, fecha, estado);
        alumno.guardarAlumno(a);
//        }
    }//GEN-LAST:event_jB_guardarMouseClicked

    private void jB_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_eliminarMouseClicked
        AlumnoData alumno = new AlumnoData();
        Integer dni = Integer.parseInt(jTF_dni.getText());
        Alumno al = alumno.buscarAlumnoDni(dni);
        alumno.EliminarAlumno(al.getIdAlumno());


    }//GEN-LAST:event_jB_eliminarMouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
         dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jB_Buscar;
    private javax.swing.JButton jB_eliminar;
    private javax.swing.JButton jB_guardar;
    private javax.swing.JButton jB_nuevo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRB_estado;
    private javax.swing.JTextField jTF_apellido;
    private javax.swing.JTextField jTF_dni;
    private javax.swing.JTextField jTF_nombre;
    // End of variables declaration//GEN-END:variables
}
