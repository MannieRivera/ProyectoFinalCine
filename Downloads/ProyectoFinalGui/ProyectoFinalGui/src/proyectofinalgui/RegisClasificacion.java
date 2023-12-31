/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectofinalgui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class RegisClasificacion extends javax.swing.JInternalFrame {

    static ArrayList<Clasificacion> listaclasificacion = new ArrayList<Clasificacion>();

    /**
     * Creates new form RegisClasificacion
     */
    public RegisClasificacion() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();

        for (int i = 0; i < listaclasificacion.size(); i++) {
            modelo.addRow(new Object[]{String.valueOf(listaclasificacion.get(i).idclasificacion), String.valueOf(listaclasificacion.get(i).clasificacion)});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ClasificacionTxt = new javax.swing.JTextField();
        IdClasificacionTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        RegistarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro Clasificacion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Clasificacion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 173, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Clasificacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 107, 202, -1));

        ClasificacionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasificacionTxtActionPerformed(evt);
            }
        });
        ClasificacionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClasificacionTxtKeyTyped(evt);
            }
        });
        getContentPane().add(ClasificacionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 175, 186, 30));

        IdClasificacionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdClasificacionTxtActionPerformed(evt);
            }
        });
        IdClasificacionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdClasificacionTxtKeyTyped(evt);
            }
        });
        getContentPane().add(IdClasificacionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 108, 186, 30));

        jTable2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Clasificacion", "Nombre Clasificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, 700, 134));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 101, 139, -1));

        RegistarCliente.setBackground(new java.awt.Color(102, 153, 255));
        RegistarCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        RegistarCliente.setText("Registrar");
        RegistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(RegistarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 155, 139, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/batman-dark-4k-4s.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -30, 720, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClasificacionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasificacionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClasificacionTxtActionPerformed

    private void IdClasificacionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdClasificacionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdClasificacionTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarClienteActionPerformed
        // obterner los datos del cliente y guardarlos en un arrayList

        if ( this.ClasificacionTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS ESPACIOS", null, JOptionPane.ERROR_MESSAGE);
        } else {

           

            DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();
            
                int newCode = 1;
        if (modelo.getRowCount() > 0) {
            int lastCode = Integer.parseInt(modelo.getValueAt(modelo.getRowCount() - 1, 0).toString());
            newCode = lastCode + 1;
        }

            modelo.addRow(new Object[]{String.valueOf(newCode), this.ClasificacionTxt.getText()});

            listaclasificacion.clear();

            for (int i = 0; i < this.jTable2.getRowCount(); i++) {
                listaclasificacion.add(new Clasificacion(Integer.parseInt(String.valueOf(this.jTable2.getValueAt(i, 0))), String.valueOf(this.jTable2.getValueAt(i, 1))));
            }

            JOptionPane.showMessageDialog(null, "Su Registro Fue Exitoso");

           
            ClasificacionTxt.setText("");

        }

    }//GEN-LAST:event_RegistarClienteActionPerformed

    private void IdClasificacionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdClasificacionTxtKeyTyped
        int tecla = evt.getKeyChar();

        boolean num = tecla >= 48 && tecla <= 57;

        if (!(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_IdClasificacionTxtKeyTyped

    private void ClasificacionTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClasificacionTxtKeyTyped

    }//GEN-LAST:event_ClasificacionTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClasificacionTxt;
    private javax.swing.JTextField IdClasificacionTxt;
    private javax.swing.JButton RegistarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
