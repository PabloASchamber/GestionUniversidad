
package grupo41.Vistas;

import grupo41.AccesoADatos.ConexionBD;
import java.sql.Connection;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        Connection cbd = ConexionBD.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMI_FormularioAlumnos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMI_FormularioMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMI_ManipulacionNotas = new javax.swing.JMenuItem();
        jMI_ManejoInscripciones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JMI_AlumnosxMateria = new javax.swing.JMenuItem();
        jMenu_Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jMI_FormularioAlumnos.setText("Formulario de alumnos");
        jMI_FormularioAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMI_FormularioAlumnosMouseClicked(evt);
            }
        });
        jMI_FormularioAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_FormularioAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_FormularioAlumnos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMI_FormularioMaterias.setText("Formulario de materias");
        jMI_FormularioMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_FormularioMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMI_FormularioMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jMI_ManipulacionNotas.setText("Manipulacion de notas");
        jMI_ManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jMI_ManipulacionNotas);

        jMI_ManejoInscripciones.setText("Manejo de inscripciones");
        jMI_ManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jMI_ManejoInscripciones);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        JMI_AlumnosxMateria.setText("Alumnos por materia");
        JMI_AlumnosxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_AlumnosxMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(JMI_AlumnosxMateria);

        jMenuBar1.add(jMenu4);

        jMenu_Salir.setText("Salir");
        jMenu_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_SalirMouseClicked(evt);
            }
        });
        jMenu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMI_ManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ManipulacionNotasActionPerformed
       fondo.removeAll();
       fondo.repaint();
       ManipulacionDeNotas MdN =new ManipulacionDeNotas();
       fondo.add(MdN);
       MdN.setVisible(true);
       MdN.moveToFront();
    }//GEN-LAST:event_jMI_ManipulacionNotasActionPerformed

    private void jMI_FormularioAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_FormularioAlumnosActionPerformed
       fondo.removeAll();
       fondo.repaint();
       FormularioDeAlumnos FdA =new FormularioDeAlumnos();
       fondo.add(FdA);
       FdA.setVisible(true);
       FdA.moveToFront();
    }//GEN-LAST:event_jMI_FormularioAlumnosActionPerformed

    private void jMenu_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_SalirMouseClicked
    System.exit(0);
    
    
    }//GEN-LAST:event_jMenu_SalirMouseClicked

    private void jMI_FormularioAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMI_FormularioAlumnosMouseClicked

    }//GEN-LAST:event_jMI_FormularioAlumnosMouseClicked

    private void jMI_FormularioMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_FormularioMateriasActionPerformed
       fondo.removeAll();
       fondo.repaint();
       FormularioDeMaterias FdM =new FormularioDeMaterias();
       fondo.add(FdM);
       FdM.setVisible(true);
       FdM.moveToFront();
    }//GEN-LAST:event_jMI_FormularioMateriasActionPerformed

    private void jMI_ManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ManejoInscripcionesActionPerformed
        fondo.removeAll();
        fondo.repaint();
        ManejoInscripciones MI = new ManejoInscripciones();
        fondo.add(MI);
        MI.setVisible(true);
        MI.moveToFront();
          
    }//GEN-LAST:event_jMI_ManejoInscripcionesActionPerformed

    private void JMI_AlumnosxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_AlumnosxMateriaActionPerformed
        fondo.removeAll();
        fondo.repaint();
        AlumnosxMateria AM = new AlumnosxMateria();
        fondo.add(AM);
        AM.setVisible(true);
        AM.moveToFront();
    }//GEN-LAST:event_JMI_AlumnosxMateriaActionPerformed

    private void jMenu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SalirActionPerformed

    }//GEN-LAST:event_jMenu_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMI_AlumnosxMateria;
    private javax.swing.JPanel fondo;
    private javax.swing.JMenuItem jMI_FormularioAlumnos;
    private javax.swing.JMenuItem jMI_FormularioMaterias;
    private javax.swing.JMenuItem jMI_ManejoInscripciones;
    private javax.swing.JMenuItem jMI_ManipulacionNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Salir;
    // End of variables declaration//GEN-END:variables
}
