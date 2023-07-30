/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import static proyectofinalgui.RegisCliente.lista;
import static proyectofinalgui.RegisPelicula.listapelicula;
import static proyectofinalgui.RegisSala.salas;

/**
 *
 * @author manuelfuentes
 */
public class RegisTicket extends javax.swing.JFrame {

    static ArrayList<Ticket> ticket = new ArrayList<Ticket>();
    //static ArrayList<Integer> sillas = new ArrayList<Integer>();

    double precioAdicional = 0, total = 0, precioNormal = 0;

    static int numAsiento = 0;

    String[][] asientosTicket = new String[3][6];//CAMBIAR
    String asientoSelecionado;

    public void Asientos(int fila, int columna, String asiento) {
        asientosTicket[fila][columna] = asiento;

    }

    public String valorAsiento(int fila, int columna) {
        String valor = asientosTicket[fila][columna];
        return valor;
    }

    public void cambiarColor(javax.swing.JButton button) {

        button.setBackground(Color.red);

        if (button.getName() == "A1") {
            A2.setBackground(Color.green);
            A3.setBackground(Color.green);
            A4.setBackground(Color.green);
            A5.setBackground(Color.green);
            A6.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);

        }
        if (button.getName() == "A2") {
            A1.setBackground(Color.green);
            A3.setBackground(Color.green);
            A4.setBackground(Color.green);
            A5.setBackground(Color.green);
            A6.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);

        }
        if (button.getName() == "A3") {
            A1.setBackground(Color.green);
            A2.setBackground(Color.green);
            A4.setBackground(Color.green);
            A5.setBackground(Color.green);
            A6.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);

        }
        if (button.getName() == "A4") {
            A1.setBackground(Color.green);
            A2.setBackground(Color.green);
            A3.setBackground(Color.green);
            A5.setBackground(Color.green);
            A6.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);
        }
        if (button.getName() == "A5") {
            A1.setBackground(Color.green);
            A2.setBackground(Color.green);
            A3.setBackground(Color.green);
            A4.setBackground(Color.green);
            A6.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);
        }
        if (button.getName() == "A6") {
            A1.setBackground(Color.green);
            A2.setBackground(Color.green);
            A3.setBackground(Color.green);
            A4.setBackground(Color.green);
            A5.setBackground(Color.green);
            B1.setBackground(Color.green);
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            B4.setBackground(Color.green);
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            C1.setBackground(Color.green);
            C2.setBackground(Color.green);
            C3.setBackground(Color.green);
            C4.setBackground(Color.green);
            C5.setBackground(Color.green);
            C6.setBackground(Color.green);
            if (button.getName() == "B1") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "B2") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);

            }
            if (button.getName() == "B3") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);

            }
            if (button.getName() == "B4") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);

            }
            if (button.getName() == "B5") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "B6") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C1") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C2") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C3") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C4") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C5.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C5") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C6.setBackground(Color.green);
            }
            if (button.getName() == "C6") {
                A1.setBackground(Color.green);
                A2.setBackground(Color.green);
                A3.setBackground(Color.green);
                A4.setBackground(Color.green);
                A5.setBackground(Color.green);
                A6.setBackground(Color.green);
                B1.setBackground(Color.green);
                B2.setBackground(Color.green);
                B3.setBackground(Color.green);
                B4.setBackground(Color.green);
                B5.setBackground(Color.green);
                B6.setBackground(Color.green);
                C1.setBackground(Color.green);
                C2.setBackground(Color.green);
                C3.setBackground(Color.green);
                C4.setBackground(Color.green);
                C5.setBackground(Color.green);
            }
        }
    }

    /**
     * Creates new form RegisTicket
     */
    public RegisTicket() {
        initComponents();

        setResizable(false);
        setLocationRelativeTo(null);
        this.cbocliente.removeAllItems();
        this.cbopelicula.removeAllItems();
        this.cbosala.removeAllItems();
        this.cbocliente.addItem("Seleccione un Cliente");
        this.cbopelicula.addItem("Seleccione una Pelicula");
        this.cbosala.addItem("Seleccione un Sala");

        cargarcliente();
        cargarpelicula();
        cargarsala();

        DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();

        for (int i = 0; i < ticket.size(); i++) {
            modelo.addRow(new Object[]{String.valueOf(ticket.get(i).id), String.valueOf(ticket.get(i).cliente), String.valueOf(ticket.get(i).pelicula), ticket.get(i).asiento,String.valueOf(ticket.get(i).tipo)});
        }
    }

    private void cargarcliente() {
        for (int i = 0; i < lista.size(); i++) {

            cbocliente.addItem(lista.get(i).nombre);

        }
    }

    private void cargarpelicula() {
        for (int i = 0; i < listapelicula.size(); i++) {

            cbopelicula.addItem(listapelicula.get(i).pelicula);

        }
    }
    
    private void cargarsala(){
        
        for (int i = 0; i < salas.size(); i++) {
            cbosala.addItem(salas.get(i).tipo);
            

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

        RistrarTicket = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbocliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbopelicula = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        A3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        A6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        A4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbosala = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RistrarTicket.setBackground(new java.awt.Color(102, 204, 255));
        RistrarTicket.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        RistrarTicket.setText("Registrar");
        RistrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RistrarTicketActionPerformed(evt);
            }
        });
        getContentPane().add(RistrarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 642, -1, -1));

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 710, 139, -1));

        jTable2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Ticket", "Cliente", "Pelicula", "Asiento", "Sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 642, 634, 104));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resgistro de Tickets");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 27, -1, 48));

        cbocliente.setEditable(true);
        cbocliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboclienteActionPerformed(evt);
            }
        });
        getContentPane().add(cbocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 261, 167, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 215, -1, 28));

        cbopelicula.setEditable(true);
        cbopelicula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbopelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbopeliculaItemStateChanged(evt);
            }
        });
        cbopelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(cbopelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 348, 167, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pelicula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 302, -1, 28));

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("C");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("1");

        A2.setBackground(new java.awt.Color(0, 145, 50));
        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A2.setName("A2"); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("2");

        A3.setBackground(new java.awt.Color(0, 145, 50));
        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A3.setName("A3"); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("3");

        A1.setBackground(new java.awt.Color(0, 145, 50));
        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A1.setName("A1"); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(0, 145, 50));
        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A5.setName("A5"); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("4");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("5");

        A6.setBackground(new java.awt.Color(0, 145, 50));
        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A6.setName("A6"); // NOI18N
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("6");

        A4.setBackground(new java.awt.Color(0, 145, 50));
        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        A4.setName("A4"); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel12.setText("Pantalla");

        B2.setBackground(new java.awt.Color(0, 145, 50));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B2.setName("B2"); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 145, 50));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B3.setName("B3"); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 145, 50));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B1.setName("B1"); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 145, 50));
        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B5.setName("B5"); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 145, 50));
        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B6.setName("B6"); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 145, 50));
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        B4.setName("B4"); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(0, 145, 50));
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C2.setName("C2"); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(0, 145, 50));
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C3.setName("C3"); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(0, 145, 50));
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C1.setName("C1"); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(0, 145, 50));
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C5.setName("C5"); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(0, 145, 50));
        C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C6.setName("C6"); // NOI18N
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(0, 145, 50));
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/seatCinema.png"))); // NOI18N
        C4.setName("C4"); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setText("A");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel14.setText("B");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBotonesLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(64, 64, 64))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBotonesLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(A3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(A6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(A5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(A4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(78, 78, 78)))
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B1)
                        .addComponent(jLabel14)))
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(69, 69, 69))
        );

        getContentPane().add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 81, 800, -1));

        cbosala.setEditable(true);
        cbosala.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbosala.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbosalaItemStateChanged(evt);
            }
        });
        cbosala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosalaActionPerformed(evt);
            }
        });
        getContentPane().add(cbosala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 424, 167, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sala");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 389, 142, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgui/batman-dark-4k-4s.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -140, 1400, 1080));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RistrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RistrarTicketActionPerformed
        if ( this.cbocliente.getSelectedItem().equals("") || this.cbopelicula.getSelectedItem().equals("") || this.cbosala.getSelectedItem().equals("") || asientoSelecionado.isEmpty()) {

            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS ESPACIOS", null, JOptionPane.ERROR_MESSAGE);

        } else {

            for (int i = 0; i < listapelicula.size(); i++) {

                
                if (listapelicula.get(i).pelicula == this.cbopelicula.getSelectedItem()) {
                    precioNormal = 100;
                    if (listapelicula.get(i).estreno == "Si") {

                        precioAdicional = 50;

                    } else {
                        //aqui precio adicional normal 
                        precioAdicional = 0;
                    }
                    total = precioAdicional + precioNormal;
                }

            }
            
          

            DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();
            
                    int newCode = 1;
        if (modelo.getRowCount() > 0) {
            int lastCode = Integer.parseInt(modelo.getValueAt(modelo.getRowCount() - 1, 0).toString());
            newCode = lastCode + 1;
        }

            modelo.addRow(new Object[]{String.valueOf(newCode), this.cbocliente.getSelectedItem(), this.cbopelicula.getSelectedItem(), asientoSelecionado,this.cbosala.getSelectedItem().toString()});
            //ticket.add(new Ticket(Integer.parseInt(newCode, precioNormal, precioAdicional, 0.0, total, asientoSelecionado, this.cbocliente.getSelectedItem().toString(), this.cbopelicula.getSelectedItem().toString(),this.cbosala.getSelectedItem().toString()));
               Ticket newTicket = new Ticket(newCode, precioNormal, precioAdicional, 0.0, total, asientoSelecionado, this.cbocliente.getSelectedItem().toString(), this.cbopelicula.getSelectedItem().toString(), this.cbosala.getSelectedItem().toString());
           ticket.add(newTicket);

            JOptionPane.showMessageDialog(null, "Su Registro Fue Exitoso");

           

            this.cbocliente.setSelectedIndex(0);
            this.cbopelicula.setSelectedIndex(0);
            this.cbosala.setSelectedIndex(0);

        }
    }//GEN-LAST:event_RistrarTicketActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cboclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboclienteActionPerformed

    }//GEN-LAST:event_cboclienteActionPerformed

    private void cbopeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopeliculaActionPerformed
        if (cbopelicula.isValid()) { // cbopelicula.isValid())
            Cliente cliente = new Cliente();

            for (int i = 0; i < lista.size(); i++) {

                if (lista.get(i).nombre.equals(cbocliente.getSelectedItem())) {
                    cliente = lista.get(i);
                }

            }
            for (int i = 0; i < listapelicula.size(); i++) {
                if (listapelicula.get(i).clasificacionp.equals("A12") && cliente.edad < 12) {
                    JOptionPane.showMessageDialog(null, "Pelicula apta solo para mayores de 12 años", null, JOptionPane.ERROR_MESSAGE);
                }else  if(listapelicula.get(i).clasificacionp.equals("A15") && cliente.edad < 15) {
                        JOptionPane.showMessageDialog(null, "Pelicula apta solo para mayores de 15 años", null, JOptionPane.ERROR_MESSAGE);
                }else    if(listapelicula.get(i).clasificacionp.equals("A18") && cliente.edad < 18) {
                            JOptionPane.showMessageDialog(null, "Pelicula apta solo para mayores de 18 años", null, JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            
   

    }//GEN-LAST:event_cbopeliculaActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        Asientos(0, 1, A2.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 1));
        cambiarColor(A2);
        asientoSelecionado = valorAsiento(0, 1);
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        Asientos(0, 2, A3.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 2));
        cambiarColor(A3);
        asientoSelecionado = valorAsiento(0, 2);
    }//GEN-LAST:event_A3ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed

        Asientos(0, 0, A1.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 0));
        cambiarColor(A1);
        asientoSelecionado = valorAsiento(0, 0);

    }//GEN-LAST:event_A1ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        Asientos(0, 3, A4.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 3));
        cambiarColor(A4);
        asientoSelecionado = valorAsiento(0, 3);
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        Asientos(0, 4, A5.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 4));
        cambiarColor(A5);
        asientoSelecionado = valorAsiento(0, 4);
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        Asientos(0, 5, A6.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(0, 5));
        cambiarColor(A6);
        asientoSelecionado = valorAsiento(0, 5);
    }//GEN-LAST:event_A6ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Asientos(1, 0, B1.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 0));
        cambiarColor(B1);
        asientoSelecionado = valorAsiento(1, 0);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Asientos(1, 1, B2.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 1));
        cambiarColor(B2);
        asientoSelecionado = valorAsiento(1, 1);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Asientos(1, 2, B3.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 2));
        cambiarColor(B3);
        asientoSelecionado = valorAsiento(1, 2);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Asientos(1, 3, B4.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 3));
        cambiarColor(B4);
        asientoSelecionado = valorAsiento(1, 3);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Asientos(1, 4, B5.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 4));
        cambiarColor(B5);
        asientoSelecionado = valorAsiento(1, 4);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Asientos(1, 5, B6.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(1, 5));
        cambiarColor(B6);
        asientoSelecionado = valorAsiento(1, 5);
    }//GEN-LAST:event_B6ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        Asientos(2, 0, C1.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 0));
        cambiarColor(C1);
        asientoSelecionado = valorAsiento(2, 0);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        Asientos(2, 1, C2.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 1));
        cambiarColor(C2);
        asientoSelecionado = valorAsiento(2, 1);
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        Asientos(2, 2, C3.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 2));
        cambiarColor(C3);
        asientoSelecionado = valorAsiento(2, 2);
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        Asientos(2, 3, C4.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 3));
        cambiarColor(C4);
        asientoSelecionado = valorAsiento(2, 3);
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        Asientos(2, 4, C5.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 4));
        cambiarColor(C5);
        asientoSelecionado = valorAsiento(2, 4);
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        Asientos(2, 5, C6.getName());
        JOptionPane.showMessageDialog(null, "Su Asiento a sido reservado " + valorAsiento(2, 5));
        cambiarColor(C6);
        asientoSelecionado = valorAsiento(2, 5);
    }//GEN-LAST:event_C6ActionPerformed

    private void cbopeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbopeliculaItemStateChanged
      

    }//GEN-LAST:event_cbopeliculaItemStateChanged

    private void cbosalaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbosalaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbosalaItemStateChanged

    private void cbosalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbosalaActionPerformed

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
            java.util.logging.Logger.getLogger(RegisTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton RistrarTicket;
    private javax.swing.JComboBox<String> cbocliente;
    private javax.swing.JComboBox<String> cbopelicula;
    private javax.swing.JComboBox<String> cbosala;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
