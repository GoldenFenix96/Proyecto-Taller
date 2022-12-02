package Interfaces;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JIRegistrosCompras extends javax.swing.JInternalFrame {

    String user, sku, IDVenta;
    DefaultTableModel model = new DefaultTableModel();

    public JIRegistrosCompras() {
        initComponents();
        setSize(794, 548);
        setTitle("Registro de ventas - Sesion de ");
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ventas = new javax.swing.JTable();
        Imprimir = new javax.swing.JButton();
        CalendarCaducidad = new com.toedter.calendar.JDateChooser();
        LblFecha = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        LblFecha1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LblFecha2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Compras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jTable_ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_ventas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 760, 190));

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        Imprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 100, 100));

        CalendarCaducidad.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(CalendarCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 65, 160, 25));

        LblFecha.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha.setText("Fecha:");
        jPanel1.add(LblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, 100));

        LblFecha1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha1.setText("Proveedor:");
        jPanel1.add(LblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 65, 150, 25));

        LblFecha2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha2.setText("Producto:");
        jPanel1.add(LblFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 70, -1, -1));

        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 65, 150, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed


    }//GEN-LAST:event_ImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarCaducidad;
    private javax.swing.JButton Imprimir;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblFecha1;
    private javax.swing.JLabel LblFecha2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ventas;
    // End of variables declaration//GEN-END:variables
}
