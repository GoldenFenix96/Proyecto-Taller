package Interfaces;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JIAutosClientes extends javax.swing.JInternalFrame {

    String user;
    int idC, idA;
    DefaultTableModel model = new DefaultTableModel();

    public JIAutosClientes() {
        initComponents();
        setSize(794, 548);
        setTitle("Asignar Autos a Clientes");
        setResizable(false);

        tblAutoCli = new JTable(model);
        jScrollPane1.setViewportView(tblAutoCli);

        model.addColumn("ID Cientifico");
        model.addColumn("Nombre del Cientifico");
        model.addColumn("ID Proyecto");
        model.addColumn("Nombre del Proyecto");

        TableColumnModel model = tblAutoCli.getColumnModel();

        model.getColumn(0).setPreferredWidth(50);
        model.getColumn(1).setPreferredWidth(150);
        model.getColumn(2).setPreferredWidth(50);
        model.getColumn(3).setPreferredWidth(150);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idClientes, NombreC, APaternoC, AMaternoC from clientes");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbClientes.addItem(rs.getString("idClientes") + " " + rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar clientes " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idAutos, NombreModelo from autos, modelo where Modelo_idModelo = idModelo ");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbAutos.addItem(rs.getString("idAutos") + " " + rs.getString("NombreModelo"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar autos" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbAutos = new javax.swing.JComboBox<>();
        cmbClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutoCli = new javax.swing.JTable();
        btnAgrCi = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblWall = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cmbAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 30));

        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 250, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cientifico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autos - Clientes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proyecto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        tblAutoCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAutoCli);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 700, 190));

        btnAgrCi.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnAgrCi.setText("Agregar Cliente");
        btnAgrCi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgrCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrCiActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgrCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 160, 30));

        btnBorrar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnBorrar.setText("Borrar Cientifico");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 180, 30));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnAgregar.setText("Agregar Cientifico a Proyecto");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 230, 30));

        lblWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Azul.png"))); // NOI18N
        jPanel1.add(lblWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        model.removeRow(tblAutoCli.getSelectedRow());
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         try {
                Connection conx = Conexion.conectar();
                PreparedStatement pesnt = conx.prepareStatement(
                    "insert into autos_has_clientes values (?,?)");
                
                for (int i = 0; i < tblAutoCli.getRowCount(); i++) {
                String idAutos, idClientes;
                idAutos = tblAutoCli.getValueAt(i, 2).toString();
                idClientes = tblAutoCli.getValueAt(i, 0).toString();
                
                pesnt.setString(1, idAutos);
                pesnt.setString(2, idClientes);
                
                pesnt.executeUpdate();
                
                }
                conx.close();
                JOptionPane.showMessageDialog(null, "Asignación exitosa de Clientes Autos");
                dispose();
            } catch (SQLException e) {
                System.err.println("Error al asignar Clientes a Autos " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador", "Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgrCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrCiActionPerformed
        idC = cmbClientes.getSelectedIndex() + 1;
        idA = cmbAutos.getSelectedIndex() + 1;
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idClientes, NombreC, APaternoC, AMaternoC, idAutos, NombreModelo from clientes, autos, modelo "
                            + "where idClientes = '" + idC + "' and idAutos = '" + idA + "' and Modelo_idModelo = idModelo ");
            ResultSet rs = pst.executeQuery();

            Object[] columna = new Object[4];
            while (rs.next()) {

                columna[0] = rs.getObject(1);
                columna[1] = rs.getObject(2) + " " + rs.getObject(3) + " " + rs.getObject(4);
                columna[2] = rs.getObject(5);
                columna[3] = rs.getObject(6);

                model.addRow(columna);
            }

        } catch (SQLException e) {
            System.err.println("¡¡¡Error en cargar Autos y Clientes " + e);
            JOptionPane.showMessageDialog(null, "¡¡¡Error en cargar, contacte al administrador!!!");
        }

    }//GEN-LAST:event_btnAgrCiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrCi;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<String> cmbAutos;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWall;
    private javax.swing.JTable tblAutoCli;
    // End of variables declaration//GEN-END:variables
}
