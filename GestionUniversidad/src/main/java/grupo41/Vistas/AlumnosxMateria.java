/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package grupo41.Vistas;

import grupo41.AccesoADatos.InscripcionData;
import grupo41.AccesoADatos.MateriaData;
import grupo41.Entidades.Alumno;
import grupo41.Entidades.Inscripcion;
import grupo41.Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class AlumnosxMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlumnosxMateria
     */
    public AlumnosxMateria() {
        initComponents();
        cargarCombo();
        armarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcb_materia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB_Salir = new javax.swing.JButton();

        jLabel1.setText("listado de alumnos por materia");

        jLabel2.setText("seleccione una materia");

        jcb_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_materiaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jB_Salir.setText("Salir");
        jB_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_SalirMouseClicked(evt);
            }
        });
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcb_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jB_Salir)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jB_Salir)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_SalirActionPerformed

    private void jB_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_SalirMouseClicked
        dispose();
    }//GEN-LAST:event_jB_SalirMouseClicked

    private void jcb_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_materiaActionPerformed
      if (jcb_materia.getSelectedItem()!= null){
         Materia materia= (Materia) jcb_materia.getSelectedItem();
         cargarDatos (materia);
         
      }
    }//GEN-LAST:event_jcb_materiaActionPerformed

    private void cargarCombo() {

        MateriaData matdat = new MateriaData();
        ArrayList<Materia> materias = (ArrayList<Materia>) matdat.ListarMaterias();
        for (Materia materia : materias) {
            System.out.println(materia);
            jcb_materia.addItem(materia);
        }

    }

    private DefaultTableModel modelo = new DefaultTableModel();

    private void armarTabla() {
        modelo.addColumn("Id");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTable1.setModel(modelo);

    }

    public void cargarDatos(Materia materia) {
         jTable1.getModel();
         modelo.setRowCount(0);
         jTable1.repaint();
        InscripcionData indat= new InscripcionData ();
        if (materia != null) {
           List <Alumno> alumnos= indat.alumnosXmateria(materia.getIdMateria());
           
         for (Alumno alumno: alumnos){
              modelo.addRow(new Object []{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre()}); 

         }
           
        }
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Materia> jcb_materia;
    // End of variables declaration//GEN-END:variables
}
