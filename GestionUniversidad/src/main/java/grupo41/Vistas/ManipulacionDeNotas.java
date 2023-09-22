package grupo41.Vistas;

import grupo41.AccesoADatos.AlumnoData;
import grupo41.AccesoADatos.InscripcionData;
import grupo41.Entidades.Alumno;
import grupo41.Entidades.Inscripcion;
import grupo41.Entidades.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ManipulacionDeNotas extends javax.swing.JInternalFrame {

    public ManipulacionDeNotas() {
        initComponents();
        CargarCombo();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCB_alumno = new javax.swing.JComboBox<>();
        jB_Guardar = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel1.setText("Carga de notas");

        jLabel2.setText("seleccione un alumno");

        jCB_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCB_alumnoMouseClicked(evt);
            }
        });
        jCB_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_alumnoActionPerformed(evt);
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

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "codigo", "nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jCB_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_Guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_Salir)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCB_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Guardar)
                    .addComponent(jB_Salir))
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jB_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_GuardarMouseClicked

    }//GEN-LAST:event_jB_GuardarMouseClicked

    private void jCB_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_alumnoActionPerformed

    }//GEN-LAST:event_jCB_alumnoActionPerformed

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        InscripcionData insdat = new InscripcionData();
        int filaS = jTable.getSelectedRow();
        if (filaS != -1) {
            int nota = Integer.parseInt((String) jTable.getValueAt(filaS, 2));
            int id = Integer.parseInt((String) jTable.getValueAt(filaS, 0));
            InscripcionData insdt = new InscripcionData();
            Alumno alumno = (Alumno) jCB_alumno.getSelectedItem();
            Inscripcion nuevaNota = insdt.buscarInscripcion(id);
            Materia materia = nuevaNota.getMateria();
            nuevaNota = new Inscripcion(alumno, materia, nota);
            insdat.ActualizarNota(nuevaNota.getMateria().getIdMateria(), nuevaNota.getAlumno().getIdAlumno(), nota);
        }
    }//GEN-LAST:event_jB_GuardarActionPerformed


    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked

    }//GEN-LAST:event_jTableMouseClicked

    private void jCB_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCB_alumnoMouseClicked
        if (jCB_alumno.getSelectedItem() != null) {
            Alumno a = (Alumno) jCB_alumno.getSelectedItem();
            cargarDatos(a);
            System.out.println(a);
        }
    }//GEN-LAST:event_jCB_alumnoMouseClicked

    private void CargarCombo() {
        AlumnoData aldat = new AlumnoData();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) aldat.ListarAlumno();
        for (Alumno al : alumnos) {
            jCB_alumno.addItem(al);
        }
    }
    private DefaultTableModel modelo = new DefaultTableModel();

    private void armarTabla() {
        modelo.addColumn("Codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("Nota");
        jTable.setModel(modelo);
    }

    private void cargarDatos(Alumno a) {
        jTable.getModel();

        modelo.setRowCount(0);
        InscripcionData idat = new InscripcionData();
        System.out.println("antes del if" + a);
        if (a != null) {

            ArrayList<Inscripcion> Inscripciones = (ArrayList<Inscripcion>) idat.listaInscripcionesPorAlumno(a.getIdAlumno());
            System.out.println("despues  del if" + a);
            for (Inscripcion inscripcion : Inscripciones) {
                modelo.addRow(new Object[]{inscripcion.getIdInscripcion(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
                System.out.println("en el for" + a);

            }
            jTable.repaint();

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JComboBox<Alumno> jCB_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
