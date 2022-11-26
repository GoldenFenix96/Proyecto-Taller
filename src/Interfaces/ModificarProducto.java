/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Roberto Carlos Sanchez de la Cruz
 */
public class ModificarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(800, 500);
        this.setTitle("Modificar Productos");
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Taller P.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        lblExistencia = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        lblExistencia1 = new javax.swing.JLabel();
        cmbUDM = new javax.swing.JComboBox<>();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedores = new javax.swing.JComboBox<>();
        lblCategorias = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        lblPrecioCompra = new javax.swing.JLabel();
        txtPrecioC = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioV = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblExistencia2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CboxMP = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código de Barras:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(0, 153, 102));
        txtCodigo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.setEnabled(false);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 87, 160, -1));

        lblProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Nombre del Producto:");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 133, -1, -1));

        txtProducto.setBackground(new java.awt.Color(0, 153, 102));
        txtProducto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProducto.setEnabled(false);
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 233, -1));

        lblExistencia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencia:");
        jPanel1.add(lblExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 173, -1, -1));

        txtExistencia.setBackground(new java.awt.Color(0, 153, 102));
        txtExistencia.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtExistencia.setForeground(new java.awt.Color(255, 255, 255));
        txtExistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, -1));

        lblExistencia1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia1.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia1.setText("Unidad de Medida:");
        jPanel1.add(lblExistencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 213, -1, -1));

        cmbUDM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbUDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Caja", "Bote", "Bolsa" }));
        cmbUDM.setEnabled(false);
        jPanel1.add(cmbUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 160, -1));

        lblProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("Proveedores:");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 253, -1, -1));

        cmbProveedores.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nissan" }));
        cmbProveedores.setEnabled(false);
        jPanel1.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 160, -1));

        lblCategorias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias:");
        jPanel1.add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 293, -1, -1));

        cmbCategorias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Llantas", "Refacciones" }));
        cmbCategorias.setEnabled(false);
        jPanel1.add(cmbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 160, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioCompra.setText("Precio Compra:");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 333, -1, -1));

        txtPrecioC.setBackground(new java.awt.Color(0, 153, 102));
        txtPrecioC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioC.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrecioC.setEnabled(false);
        txtPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 160, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioVenta.setText("Precio Venta:");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 373, -1, -1));

        txtPrecioV.setBackground(new java.awt.Color(0, 153, 102));
        txtPrecioV.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioV.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrecioV.setEnabled(false);
        txtPrecioV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 160, -1));

        btnBuscar.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        btnBuscar.setText("Buscar Imagen");
        btnBuscar.setPreferredSize(new java.awt.Dimension(50, 23));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 110, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 160, 140));

        jButton1.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        jButton1.setText("Modificar Producto");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 130, 100));

        lblExistencia2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia2.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia2.setText("Estatus del Producto:");
        jPanel1.add(lblExistencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 413, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Baja" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 160, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        CboxMP.setBackground(new java.awt.Color(29, 81, 81));
        CboxMP.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        CboxMP.setForeground(new java.awt.Color(255, 255, 255));
        CboxMP.setText("Modificar Producto");
        CboxMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxMPActionPerformed(evt);
            }
        });
        jPanel1.add(CboxMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

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

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

        if (txtCodigo.getText().length() > 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped

        if (txtProducto.getText().length() > 45) {
            evt.consume();
        }

    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCKeyTyped

        if (txtPrecioC.getText().length() > 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioCKeyTyped

    private void txtPrecioVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVKeyTyped

        if (txtPrecioV.getText().length() > 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioVKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CboxMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxMPActionPerformed
         if (CboxMP.isSelected()) {
            txtCodigo.setEnabled(true);
        } else{
            txtCodigo.setEnabled(false);
        }
    }//GEN-LAST:event_CboxMPActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CboxMP;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JComboBox<String> cmbUDM;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblExistencia1;
    private javax.swing.JLabel lblExistencia2;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioV;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
