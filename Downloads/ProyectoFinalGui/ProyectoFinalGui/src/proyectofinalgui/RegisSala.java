/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalgui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyectofinalgui.RegisGenero.listagenero;

/**
 *
 * @author manuelfuentes
 */
public class RegisSala extends javax.swing.JFrame {

    static ArrayList<Sala> salas = new ArrayList<Sala>();
    public RegisSala() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
         DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();

        for (int i = 0; i < salas.size(); i++) {
            modelo.addRow(new Object[]{String.valueOf(salas.get(i).idsala), String.valueOf(salas.get(i).tipo)});
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
        TipoSalaTxt = new javax.swing.JTextField();
        IdSalaTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        RegistarSala = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro Sala");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo Sala");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 163, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Sala:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 85, -1));

        TipoSalaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoSalaTxtActionPerformed(evt);
            }
        });
        TipoSalaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipoSalaTxtKeyTyped(evt);
            }
        });
        getContentPane().add(TipoSalaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 164, 186, 25));

        IdSalaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdSalaTxtActionPerformed(evt);
            }
        });
        IdSalaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdSalaTxtKeyTyped(evt);
            }
        });
        getContentPane().add(IdSalaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 111, 186, 25));

        jTable2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sala", "Tipo Sala"
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 235, 628, 129));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 154, 139, -1));

        RegistarSala.setBackground(new java.awt.Color(102, 153, 255));
        RegistarSala.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        RegistarSala.setText("Registrar");
        RegistarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(RegistarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 101, 139, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/batman-dark-4k-4s.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoSalaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoSalaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoSalaTxtActionPerformed

    private void TipoSalaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoSalaTxtKeyTyped
        int tecla = evt.getKeyChar();

        boolean may = tecla >= 65 && tecla <= 90;
        boolean min = tecla >= 97 && tecla <= 122;
        boolean espacio = tecla == 32;

        if (!(may || min || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TipoSalaTxtKeyTyped

    private void IdSalaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdSalaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdSalaTxtActionPerformed

    private void IdSalaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdSalaTxtKeyTyped
        int tecla = evt.getKeyChar();

        boolean num = tecla >= 48 && tecla <= 57;

        if (!(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_IdSalaTxtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistarSalaActionPerformed
        // obterner los datos del cliente y guardarlos en un arrayList

        if (this.IdSalaTxt.getText().equals("") || this.TipoSalaTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS ESPACIOS", null, JOptionPane.ERROR_MESSAGE);
        } else {
            
     

            DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();

            modelo.addRow(new Object[]{this.IdSalaTxt.getText(), this.TipoSalaTxt.getText()});

            salas.clear();

            for (int i = 0; i < this.jTable2.getRowCount(); i++) {
                salas.add(new Sala(Integer.parseInt(String.valueOf(this.jTable2.getValueAt(i, 0))), String.valueOf(this.jTable2.getValueAt(i, 1))));
            }

            JOptionPane.showMessageDialog(null, "Su Registro Fue Exitoso");

            IdSalaTxt.setText("");
            TipoSalaTxt.setText("");

        }

    }//GEN-LAST:event_RegistarSalaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdSalaTxt;
    private javax.swing.JButton RegistarSala;
    private javax.swing.JTextField TipoSalaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
