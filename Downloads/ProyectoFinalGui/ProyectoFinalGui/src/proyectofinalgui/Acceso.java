/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalgui;

import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author manuelfuentes
 */
public class Acceso extends javax.swing.JFrame {

    private int PIN = 1234;
    private int intentos = 3;

    /**
     * Creates new form Acceso
     */
    public Acceso() {
        initComponents();

        setResizable(false);
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jusuario = new javax.swing.JTextField();
        jcontrasena = new javax.swing.JPasswordField();
        jMostrarC = new javax.swing.JCheckBox();
        jEntrar1 = new javax.swing.JButton();
        Cambiar = new javax.swing.JButton();
        JSalir2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/batman-dark-4k-4s.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 220, 142, 42);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 170, 120, 30);

        jusuario.setOpaque(true);
        jPanel1.add(jusuario);
        jusuario.setBounds(240, 150, 159, 23);

        jcontrasena.setOpaque(true);
        jPanel1.add(jcontrasena);
        jcontrasena.setBounds(240, 200, 159, 23);

        jMostrarC.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jMostrarC.setForeground(new java.awt.Color(255, 255, 255));
        jMostrarC.setText("Mostrar Contraseña");
        jMostrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarCActionPerformed(evt);
            }
        });
        jPanel1.add(jMostrarC);
        jMostrarC.setBounds(410, 200, 150, 21);

        jEntrar1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jEntrar1.setText("Entrar");
        jEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jEntrar1);
        jEntrar1.setBounds(260, 260, 130, 30);

        Cambiar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Cambiar.setText("Cambiar contraseña");
        Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarActionPerformed(evt);
            }
        });
        jPanel1.add(Cambiar);
        Cambiar.setBounds(230, 310, 180, 30);

        JSalir2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        JSalir2.setText("Salir");
        JSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSalir2ActionPerformed(evt);
            }
        });
        jPanel1.add(JSalir2);
        JSalir2.setBounds(260, 360, 130, 23);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CINEMA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 10, 290, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/batman-dark-4k-4s.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-10, -10, 770, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMostrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarCActionPerformed
        if (jMostrarC.isSelected()) {
            jcontrasena.setEchoChar((char) 0);
        } else {
            jcontrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_jMostrarCActionPerformed

    private void jEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrar1ActionPerformed
      
 HashMap<String, Integer> usuarios = new HashMap<>();

usuarios.put("CINE", 1234);    
usuarios.put("manuel", 5678);
usuarios.put("javier", 2155);
usuarios.put("arlington", 3345);
usuarios.put("astrid", 2233);
usuarios.put("nayeli", 5678);



int pinIngresado = Integer.parseInt(jcontrasena.getText());

if (jusuario.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Ingrese Usuario ");
} else if (jcontrasena.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Ingrese su contraseña ");
} else {
    
    String username = jusuario.getText();
    if (usuarios.containsKey(username) && pinIngresado == usuarios.get(username)) {
        JOptionPane.showMessageDialog(null, "Bienvenido a nuestro sistema de Cine!");
        dispose();
         
            Menu m = new Menu();
            m.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
    }
}
        
    }//GEN-LAST:event_jEntrar1ActionPerformed

    private void CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarActionPerformed

        String contrasenaActual = JOptionPane.showInputDialog(null, "Ingrese su contraseña actual:");

        if (Integer.parseInt(contrasenaActual) == PIN) {

            String nuevaContrasena = JOptionPane.showInputDialog(null, "Ingrese su nueva contraseña:");

            PIN = Integer.parseInt(nuevaContrasena);

            JOptionPane.showMessageDialog(null, "Su contraseña ha sido actualizada correctamente.");

        } else {

            JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
        }


    }//GEN-LAST:event_CambiarActionPerformed

    private void JSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSalir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambiar;
    private javax.swing.JButton JSalir2;
    private javax.swing.JButton jEntrar1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox jMostrarC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jcontrasena;
    private javax.swing.JTextField jusuario;
    // End of variables declaration//GEN-END:variables

}