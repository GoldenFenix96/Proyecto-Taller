package Interfaces;

import java.awt.Color;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
=======
import java.sql.*;
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIMarca extends javax.swing.JInternalFrame {
      DefaultTableModel model = new DefaultTableModel();

    DefaultTableModel model = new DefaultTableModel();
    
    public JIMarca() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Registros de Marcas");
        
<<<<<<< HEAD
          jtbmarca = new JTable(model);
=======
        jtbmarca = new JTable(model);
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
        jScrollPane1.setViewportView(jtbmarca);

        model.addColumn("ID del marca");
        model.addColumn("Nombre de la marca");
        actualizarTabla();
<<<<<<< HEAD
=======
        
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        texmarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbmarca = new javax.swing.JTable();
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
=======
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de la Marca:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        texmarca.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        texmarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
<<<<<<< HEAD
        texmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texmarcaKeyTyped(evt);
            }
        });
        jPanel1.add(texmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 125, 150, 25));
=======
        jPanel1.add(texmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, 220, 25));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registros de Marcas de Autos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jtbmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jtbmarca);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 700, 100));

<<<<<<< HEAD
        jLabel1.setText("Insertar Imagen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 150, 150));

        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setText("Buscar Imagen");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 110, 70));

        agregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        consultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        eliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        actualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));
=======
        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

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

<<<<<<< HEAD
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        
          int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());
=======
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreMarca from marca where idMarca = '" + idMarca + "'");
            ResultSet rs = pst.executeQuery();
<<<<<<< HEAD

            if (rs.next()) {
                texmarca.setText(rs.getString("NombreMarca"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar Marca" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        
           int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from marca  where idMarca= '" + idMarca + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "El estatus seleccionado fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar Marca " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }
     
    }//GEN-LAST:event_eliminarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
           int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());
        int validacion = 0;
        String nombre;

=======

            if (rs.next()) {
                texmarca.setText(rs.getString("NombreMarca"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar Marca" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from marca where idMarca= '" + idMarca + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "La marca seleccionada fue dada de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar Marca " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int idMarca = Integer.parseInt(jtbmarca.getValueAt(jtbmarca.getSelectedRow(), 0).toString());
        int validacion = 0;
        String nombre;

>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
        nombre = texmarca.getText().trim();

        if (nombre.equals("")) {
            texmarca.setBackground(Color.red);
            validacion++;
        }
        
        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
<<<<<<< HEAD
                        "select NombreMarca from estatus where NombreMarca = '" + nombre + "' and not idMarca = '" + idMarca + "'");
=======
                        "select NombreMarca from marca where NombreMarca = '" + nombre + "' and not idMarca = '" + idMarca + "'");
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    texmarca.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de marca no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update marca set NombreMarca=? where idMarca = '" + idMarca + "'");
                    pest.setString(1, nombre);
                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    texmarca.setText("");
                }
                actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al actualizar marca" + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
<<<<<<< HEAD
        
        
        
    }//GEN-LAST:event_actualizarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
             int validacion = 0;
=======
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
        String nombre;

        nombre = texmarca.getText().trim();

        if (nombre.equals("")) {
            texmarca.setBackground(Color.red);
            validacion++;
        }
        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into marca values (?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombre);

                pst.executeUpdate();

                cn.close();

                texmarca.setText("");

                JOptionPane.showMessageDialog(null, "Registro de marca Exitoso");

            } catch (SQLException e) {
                System.err.println("Error en Registrar Estatus." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
<<<<<<< HEAD
        
        
        
    }//GEN-LAST:event_agregarActionPerformed

    private void texmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texmarcaKeyTyped
        // TODO add your handling code here:
                if (texmarca.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_texmarcaKeyTyped

       public void actualizarTabla() {
=======
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void actualizarTabla() {
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef

        model.setRowCount(0);
        Object[] fila = new Object[2];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from marca");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
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
<<<<<<< HEAD
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
>>>>>>> a1266d7ca31d32a4c31210a1fbe09bafcfca04ef
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbmarca;
    private javax.swing.JTextField texmarca;
    // End of variables declaration//GEN-END:variables
}
