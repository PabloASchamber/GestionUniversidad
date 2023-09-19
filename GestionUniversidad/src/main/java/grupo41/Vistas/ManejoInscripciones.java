package grupo41.Vistas;

import grupo41.AccesoADatos.AlumnoData;
import grupo41.AccesoADatos.InscripcionData;
import grupo41.Entidades.Alumno;
import grupo41.Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ManejoInscripciones extends javax.swing.JInternalFrame {

    public ManejoInscripciones() {
        initComponents();
        cargarCombo();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCB_alumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRB_materiasInsc = new javax.swing.JRadioButton();
        jRB_materiasNOinsc = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB_inscribir = new javax.swing.JButton();
        jB_anularInsc = new javax.swing.JButton();
        jB_salir = new javax.swing.JButton();

        jLabel1.setText("Formulario de inscripciones");

        jLabel2.setText("selecciones un alumno");

        jCB_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_alumnosActionPerformed(evt);
            }
        });

        jLabel3.setText("listado de materias");

        jRB_materiasInsc.setText("materias inscriptas");

        jRB_materiasNOinsc.setText("materias no inscriptas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jB_inscribir.setText("Inscribir");

        jB_anularInsc.setText("Anular inscripcion");

        jB_salir.setText("Salir");
        jB_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jCB_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jRB_materiasInsc)
                        .addGap(87, 87, 87)
                        .addComponent(jRB_materiasNOinsc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_inscribir)
                                .addGap(82, 82, 82)
                                .addComponent(jB_anularInsc)
                                .addGap(95, 95, 95)
                                .addComponent(jB_salir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCB_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB_materiasInsc)
                    .addComponent(jRB_materiasNOinsc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_inscribir)
                    .addComponent(jB_anularInsc)
                    .addComponent(jB_salir))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_alumnosActionPerformed
        if (jCB_alumnos.getSelectedItem() != null) {
            Alumno alumno = (Alumno) jCB_alumnos.getSelectedItem();
            cargarDatos(alumno);
        }
    }//GEN-LAST:event_jCB_alumnosActionPerformed

    private void jB_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_salirMouseClicked
        dispose();
    }//GEN-LAST:event_jB_salirMouseClicked

    private void cargarCombo() {

        AlumnoData aldat = new AlumnoData();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) aldat.ListarAlumno();
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            jCB_alumnos.addItem(alumno);

        }
    }

    private DefaultTableModel modelo = new DefaultTableModel();

    private void armarTabla() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTable1.setModel(modelo);
    }

    public void cargarDatos(Alumno alumno) {
        jTable1.getModel();
        modelo.setRowCount(0);
        jTable1.repaint();
        InscripcionData indat = new InscripcionData();
        if (alumno != null && jRB_materiasInsc.isSelected()) {
            List<Materia> materias = indat.ListaMateriasCursadas(alumno.getIdAlumno());

            for (Materia materia : materias) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});

            }

        }

        if (alumno != null && jRB_materiasNOinsc.isSelected()) {
            List<Materia> materias = indat.ListaMateriasNoCursadas(alumno.getIdAlumno());

            for (Materia materia : materias) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});

            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_anularInsc;
    private javax.swing.JButton jB_inscribir;
    private javax.swing.JButton jB_salir;
    private javax.swing.JComboBox<Alumno> jCB_alumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRB_materiasInsc;
    private javax.swing.JRadioButton jRB_materiasNOinsc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
