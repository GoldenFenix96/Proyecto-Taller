package Interfaces;

public class JINuevaCompra extends javax.swing.JInternalFrame {

    public JINuevaCompra() {
        initComponents();
        setSize(794, 548);
        setTitle("Nueva Orden de Compra - Sesion de ");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblSKU = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        LbDescripción = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        LblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        LblCodigo1 = new javax.swing.JLabel();
        txtUDM = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Venta = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Orden de Compra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, -1));

        LblSKU.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblSKU.setForeground(new java.awt.Color(255, 255, 255));
        LblSKU.setText("Proveedor:");
        jPanel1.add(LblSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 95, 80, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 25));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 40, 40));

        LbDescripción.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LbDescripción.setForeground(new java.awt.Color(255, 255, 255));
        LbDescripción.setText("Producto:");
        jPanel1.add(LbDescripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 95, -1, -1));

        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 25));

        LblCantidad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad.setText("Cantidad:");
        jPanel1.add(LblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 165, 130, 25));

        LblCodigo1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo1.setText("Precio de Compra:");
        jPanel1.add(LblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        txtUDM.setEditable(false);
        txtUDM.setBackground(new java.awt.Color(255, 255, 255));
        txtUDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, 190, 25));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 90, 80));

        jTable_Venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Venta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 740, 120));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 70));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 70));

        LblTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal.setText("Total a pagar:");
        jPanel1.add(LblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        txtTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 385, 150, 30));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar.png"))); // NOI18N
        btnPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 435, 90, 70));

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

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed

    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbDescripción;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblCodigo1;
    private javax.swing.JLabel LblSKU;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Venta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUDM;
    // End of variables declaration//GEN-END:variables
}
