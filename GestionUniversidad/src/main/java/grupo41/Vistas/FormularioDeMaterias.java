
package grupo41.Vistas;

import grupo41.AccesoADatos.MateriaData;
import grupo41.Entidades.Materia;

public class FormularioDeMaterias extends javax.swing.JInternalFrame {

    public FormularioDeMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jT_codigo = new javax.swing.JTextField();
        jB_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTF_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_anio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRB_estado = new javax.swing.JRadioButton();
        jB_nuevo = new javax.swing.JButton();
        jB_eliminar = new javax.swing.JButton();
        jB_Guardar = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("codigo");

        jT_codigo.setText(" ");
        jT_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_codigoActionPerformed(evt);
            }
        });

        jB_buscar.setText("Buscar");
        jB_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_buscarMouseClicked(evt);
            }
        });
        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("nombre");

        jLabel3.setText("año");

        jLabel4.setText("estado");

        jRB_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_estadoActionPerformed(evt);
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

        jB_Guardar.setText("Guardar");
        jB_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_GuardarMouseClicked(evt);
            }
        });
        jB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarActionPerformed(evt);
            }
        });

        jB_salir.setText("salir");
        jB_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_salirMouseClicked(evt);
            }
        });
        jB_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_salirActionPerformed(evt);
            }
        });

        jLabel5.setText("Materia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_nuevo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRB_estado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jB_eliminar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jT_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                        .addComponent(jTF_nombre)
                                        .addComponent(jTF_anio))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(jB_buscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jB_Guardar)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jB_salir)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRB_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_nuevo)
                    .addComponent(jB_eliminar)
                    .addComponent(jB_Guardar)
                    .addComponent(jB_salir))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_codigoActionPerformed

    private void jRB_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_estadoActionPerformed

    private void jB_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_nuevoMouseClicked
        jRB_estado.setSelected(false);
        jTF_nombre.setText("");
        jTF_anio.setText("");
        jT_codigo.setText("");
    }//GEN-LAST:event_jB_nuevoMouseClicked

    private void jB_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_buscarMouseClicked

    }//GEN-LAST:event_jB_buscarMouseClicked

    private void jB_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_GuardarMouseClicked
  
    }//GEN-LAST:event_jB_GuardarMouseClicked

    private void jB_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_salirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_salirMouseClicked

    private void jB_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jB_salirActionPerformed

    private void jB_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_eliminarMouseClicked
         MateriaData matdat=new MateriaData();
        matdat.eliminarMateria(Integer.parseInt(jT_codigo.getText()));
    }//GEN-LAST:event_jB_eliminarMouseClicked

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        MateriaData matdat=new MateriaData();
        String nombre = jTF_nombre.getText();
        Integer anio = Integer.valueOf(jTF_anio.getText());
        boolean estado = jRB_estado.isSelected();
        Materia mat = new Materia(anio, nombre, estado);
        matdat.GuardarMateria(mat);
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarActionPerformed
        MateriaData matdat= new MateriaData();
        Integer id= Integer.valueOf(jT_codigo.getText().trim());
        Materia mat=matdat.buscarMateria(id);
        jRB_estado.setSelected(true);
        jTF_nombre.setText(mat.getNombre());
        jTF_anio.setText(Integer.toString(mat.getAnioMateria()));
    }//GEN-LAST:event_jB_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_buscar;
    private javax.swing.JButton jB_eliminar;
    private javax.swing.JButton jB_nuevo;
    private javax.swing.JButton jB_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRB_estado;
    private javax.swing.JTextField jTF_anio;
    private javax.swing.JTextField jTF_nombre;
    private javax.swing.JTextField jT_codigo;
    // End of variables declaration//GEN-END:variables
}
