
package grupo41.Vistas;

import grupo41.AccesoADatos.AlumnoData;
import grupo41.AccesoADatos.InscripcionData;
import grupo41.Entidades.Alumno;
import grupo41.Entidades.Inscripcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ManipulacionDeNotas extends javax.swing.JInternalFrame {

    public ManipulacionDeNotas() {
        initComponents();
        CargarCombo();
        armarTabla();
    }
private DefaultTableModel modelo =new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCB_alumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jB_Guardar = new javax.swing.JButton();
        jB_Salir = new javax.swing.JButton();

        jLabel1.setText("Carga de notas");

        jLabel2.setText("seleccione un alumno");

        jCB_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_alumnoActionPerformed(evt);
            }
        });

        jTable.setAutoCreateRowSorter(true);
        jTable.setModel(modelo);
        jTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable);
        jTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jB_Guardar.setText("Guardar");
        jB_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_GuardarMouseClicked(evt);
            }
        });

        jB_Salir.setText("Salir");
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
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jCB_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jB_Guardar)
                        .addGap(229, 229, 229)
                        .addComponent(jB_Salir)))
                .addContainerGap(268, Short.MAX_VALUE))
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
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
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
       InscripcionData indat=new InscripcionData();
       //indat.ActualizarNota();
    }//GEN-LAST:event_jB_GuardarMouseClicked

    private void jCB_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_alumnoActionPerformed
    if(jCB_alumno.getSelectedItem()!=null){
    Alumno alumno= (Alumno) jCB_alumno.getSelectedItem();
     cargarDatos(alumno);
    }
    
    }//GEN-LAST:event_jCB_alumnoActionPerformed
private void CargarCombo(){
    AlumnoData aldat = new AlumnoData();
     ArrayList<Alumno> alumnos = (ArrayList<Alumno>) aldat.ListarAlumno();
     for (Alumno alumno : alumnos) {
         System.out.println(alumno);
       jCB_alumno.addItem(alumno);
    }
}
private void armarTabla(){
    modelo.addColumn("Codigo");
    modelo.addColumn("nombre");
    modelo.addColumn("Nota");
    jTable.setModel(modelo);
}
        

private void cargarDatos(Alumno alumno){
    InscripcionData indat =new InscripcionData();
        if(alumno!=null){
    ArrayList<Inscripcion> Inscripciones = (ArrayList<Inscripcion>) indat.listaInscripcionesPorAlumno(alumno.getIdAlumno());
    for (Inscripcion inscripcion : Inscripciones) {
    System.out.println("ID Inscripción: " + inscripcion.getIdInscripcion());
    System.out.println("Nombre Materia: " + inscripcion.getMateria().getNombre());
    System.out.println("Nota: " + inscripcion.getNota());
        modelo.addRow(new Object []{inscripcion.getIdInscripcion(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
        jTable.validate();
        jTable.repaint();
    }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JComboBox<Alumno> jCB_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
