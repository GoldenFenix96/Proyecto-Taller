package Interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menú");
        this.setSize(800, 600);
        this.setResizable(false);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Taller P.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo Menú.jpg"));
        Image img = icon.getImage();
        DPEscritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(), this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NUsuario = new javax.swing.JMenuItem();
        MUsuario = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        Cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AutosC = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        NuevaCompra = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        RegistrosVentas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DPEscritorio.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout DPEscritorioLayout = new javax.swing.GroupLayout(DPEscritorio);
        DPEscritorio.setLayout(DPEscritorioLayout);
        DPEscritorioLayout.setHorizontalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        DPEscritorioLayout.setVerticalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        getContentPane().add(DPEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Archivo");

        NUsuario.setText("Nuevo Usuario");
        NUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(NUsuario);

        MUsuario.setText("Gestión de Usuarios");
        MUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(MUsuario);

        jMenuItem13.setText("Permisos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Estatus");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setText("Puestos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        Cerrar.setText("Cerrar Sesión");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jMenu1.add(Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");

        jMenuItem3.setText("Nuevo Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Existencias de Productos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setText("Categorias");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem10.setText("Estatus de los Productos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem16.setText("Unidades de Medida");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Autos");

        AutosC.setText("Autos");
        AutosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutosCActionPerformed(evt);
            }
        });
        jMenu3.add(AutosC);

        jMenuItem7.setText("Modelos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem6.setText("Marcas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem9.setText("Autos-Clientes");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Clientes");

        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        jMenu4.add(Clientes);

        jMenuBar1.add(jMenu4);

        jMenu8.setText("Compras");

        NuevaCompra.setText("Nueva Compra");
        NuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCompraActionPerformed(evt);
            }
        });
        jMenu8.add(NuevaCompra);

        jMenuItem18.setText("Registros de Compras");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Ventas");

        NuevaVenta.setText("Nueva Venta");
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        jMenu5.add(NuevaVenta);

        RegistrosVentas.setText("Registros de Ventas");
        RegistrosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosVentasActionPerformed(evt);
            }
        });
        jMenu5.add(RegistrosVentas);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Proveedores");

        jMenuItem1.setText("Proveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem12.setText("Ciudades");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem11.setText("Estados");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Creditos");

        jMenuItem2.setText("Niveles de Confianza");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem5.setText("Deudas de Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUsuarioActionPerformed
       JINuevoUsuario NU = new JINuevoUsuario();
       DPEscritorio.add(NU);
       NU.show();
    }//GEN-LAST:event_NUsuarioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       JINuevoProducto JINP = new JINuevoProducto();
        DPEscritorio.add(JINP);
        JINP.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_CerrarActionPerformed

    private void MUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUsuarioActionPerformed
        JIGestionUsuario JIGU = new JIGestionUsuario();
        DPEscritorio.add(JIGU);
        JIGU.show();
    }//GEN-LAST:event_MUsuarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JIExistencias JIE = new JIExistencias();
        DPEscritorio.add(JIE);
        JIE.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void AutosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutosCActionPerformed
        JIAutos JIA = new JIAutos();
        DPEscritorio.add(JIA);
        JIA.show();
    }//GEN-LAST:event_AutosCActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        JIClientes JIC = new JIClientes();
        DPEscritorio.add(JIC);
        JIC.show();
    }//GEN-LAST:event_ClientesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JINivelesCon JINCON = new JINivelesCon();
        DPEscritorio.add(JINCON);
        JINCON.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       JIDeudas JIDe = new JIDeudas();
       DPEscritorio.add(JIDe);
       JIDe.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JIMarca JIM = new JIMarca();
        DPEscritorio.add(JIM);
        JIM.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JIModelos JIMO = new JIModelos();
        DPEscritorio.add(JIMO);
        JIMO.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JIProveedores JIPro = new JIProveedores();
        DPEscritorio.add(JIPro);
        JIPro.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JICategorias JICA = new JICategorias();
        DPEscritorio.add(JICA);
        JICA.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JIEstatusProducto JIEP = new JIEstatusProducto();
        DPEscritorio.add(JIEP);
        JIEP.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JIEstados JIEst = new JIEstados();
        DPEscritorio.add(JIEst);
        JIEst.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JICiudades JICi = new JICiudades();
        DPEscritorio.add(JICi);
        JICi.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JIPermisos JIPer = new JIPermisos();
        DPEscritorio.add(JIPer);
        JIPer.show();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        JIEstatus JIEstat = new JIEstatus();
        DPEscritorio.add(JIEstat);
        JIEstat.show();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        JIPuestos JIPues = new JIPuestos();
        DPEscritorio.add(JIPues);
        JIPues.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        JIUnidadesDeMedida JIUDM = new JIUnidadesDeMedida();
        DPEscritorio.add(JIUDM);
        JIUDM.show();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void RegistrosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosVentasActionPerformed
        JIRegistrosVentas JIRV = new JIRegistrosVentas();
        DPEscritorio.add(JIRV);
        JIRV.show();
    }//GEN-LAST:event_RegistrosVentasActionPerformed

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
        JINuevaVenta JINV = new JINuevaVenta();
        DPEscritorio.add(JINV);
        JINV.show();
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void NuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCompraActionPerformed
        JINuevaCompra JINC = new JINuevaCompra();
        DPEscritorio.add(JINC);
        JINC.show();
    }//GEN-LAST:event_NuevaCompraActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        JIRegistrosCompras JIRC = new JIRegistrosCompras();
        DPEscritorio.add(JIRC);
        JIRC.show();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JIAutosClientes JIAC = new JIAutosClientes();
        DPEscritorio.add(JIAC);
        JIAC.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AutosC;
    private javax.swing.JMenuItem Cerrar;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JDesktopPane DPEscritorio;
    private javax.swing.JMenuItem MUsuario;
    private javax.swing.JMenuItem NUsuario;
    private javax.swing.JMenuItem NuevaCompra;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuItem RegistrosVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
