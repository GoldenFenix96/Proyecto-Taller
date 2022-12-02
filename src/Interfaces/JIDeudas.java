package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIDeudas extends javax.swing.JInternalFrame {

    int idCliente;
    DefaultTableModel model = new DefaultTableModel();

    public JIDeudas() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Deudas de Clientes");

        tblDeudas = new JTable(model);
        jScrollPane2.setViewportView(tblDeudas);

        model.addColumn("ID Deuda");
        model.addColumn("Nombre Cliente");
        model.addColumn("Limite de Credito");
        model.addColumn("Saldo por Pagar");
        model.addColumn("Credito Restante");
        model.addColumn("Ultima Fecha de Pago");
        
        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreC, APaternoC, AMaternoC from clientes");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbClientes.addItem(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los clientes. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNPagos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUPagada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCRestante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLimiteCredito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCreRestante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeudas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deudas de Clientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        cmbClientes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, 25));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de Pagos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 75, -1, -1));

<<<<<<< HEAD
        jTextField6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 230, 25));
=======
        txtNPagos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNPagos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 250, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de Pagos Actual:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

<<<<<<< HEAD
        jTextField2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Última Fecha de Pago:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 125, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 220, 25));
=======
        txtNActual.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNActual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Última Cantidad Pagada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, -1));

<<<<<<< HEAD
        jTextField3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 25));
=======
        txtUPagada.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUPagada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUPagada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad Restante:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

<<<<<<< HEAD
        jTextField4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 220, 25));
=======
        txtCRestante.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCRestante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 125, 240, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Límite de Credito:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, -1, -1));

<<<<<<< HEAD
        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, 25));
=======
        txtLimiteCredito.setEditable(false);
        txtLimiteCredito.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtLimiteCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtLimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Credito Restante:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

<<<<<<< HEAD
        jTextField9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 220, 25));
=======
        txtCreRestante.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCreRestante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCreRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 175, 240, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        tblDeudas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDeudas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 710, 150));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       int idDD = Integer.parseInt(tblDeudas.getValueAt(tblDeudas.getSelectedRow(), 0).toString());
       
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select NumerodePagos, NumerodePagoActual, UltimaCantidadPagada, Cantidad_restante, CreditoRestante, idClientes, NombreC, APaternoC, "
                    + "AMaternoC, LimiteCredito"
                    + " from detalledeuda, clientes where idDetalleDeuda = '"+idDD+"' and idCliente_detalledeuda = idClientes");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtCRestante.setText(rs.getString("Cantidad_restante"));
                txtCreRestante.setText(rs.getString("CreditoRestante"));
                txtLimiteCredito.setText(rs.getString("LimiteCredito"));
                txtNActual.setText(rs.getString("NumerodePagoActual"));
                txtNPagos.setText(rs.getString("NumerodePagos"));
                txtUPagada.setText(rs.getString("UltimaCantidadPagada"));
                cmbClientes.setSelectedItem(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
            }
        } catch (SQLException e) {
            System.err.println("Error en deuda " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
       
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0, creditorestante;
        String np, npa, utc, cr, crer;
        
        np = txtNPagos.getText().trim();
        npa = txtNActual.getText().trim();
        utc = txtUPagada.getText().trim();
        cr = txtCRestante.getText().trim();
        
        idCliente = cmbClientes.getSelectedIndex() + 1;
        
        if (np.equals("")) {
            
            validacion++;
        }
        if (npa.equals("")) {
            
            validacion++;
        }
        if (utc.equals("")) {
            
            validacion++;
        }
        if (cr.equals("")) {
            
            validacion++;
        }
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
        
        creditorestante = Integer.parseInt(txtLimiteCredito.getText().trim()) - 0;
        txtCreRestante.setText(String.valueOf(creditorestante));
        crer = txtCreRestante.getText().trim();
        if (validacion == 0) {
            Connection cn = Conexion.conectar();
            PreparedStatement pst;
            try {
                pst = cn.prepareStatement(
                "insert into detalledeuda values (?,?,?,?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, np);
                pst.setString(3, npa);
                pst.setDate(4, fecha);
                pst.setString(5, utc);
                pst.setString(6, cr);
                pst.setInt(7, idCliente);
                pst.setString(8, crer);
                
                pst.executeUpdate();
                cn.close();
                
                txtCRestante.setText("");
                txtCreRestante.setText("");
                txtLimiteCredito.setText("");
                txtNActual.setText("");
                txtNPagos.setText("");
                txtUPagada.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Deuda de Cliente Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Deuda." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        idCliente = cmbClientes.getSelectedIndex() + 1;
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select LimiteCredito from clientes where idClientes = '" + idCliente+"'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtLimiteCredito.setText(rs.getString("LimiteCredito"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select "
                    + "idDetalleDeuda, NombreC, LimiteCredito, Cantidad_Restante, CreditoRestante, UltimaFechaPagoActual from clientes, detalledeuda "
                    + " where idCliente_detalledeuda = idClientes");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeudas;
    private javax.swing.JTextField txtCRestante;
    private javax.swing.JTextField txtCreRestante;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtNActual;
    private javax.swing.JTextField txtNPagos;
    private javax.swing.JTextField txtUPagada;
    // End of variables declaration//GEN-END:variables
}
