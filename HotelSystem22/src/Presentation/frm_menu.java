/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author fabio
 */
public class frm_menu extends javax.swing.JFrame {

    /**
     * Creates new form frm_menu
     */
    public frm_menu() {
        initComponents();
        this.setExtendedState(frm_menu.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reservas para Hotéis -  Pousada FLGC");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPaneMenu = new javax.swing.JDesktopPane();
        lbl_Acess = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuSystem = new javax.swing.JMenu();
        menuFile = new javax.swing.JMenu();
        subMenuBedrooms = new javax.swing.JMenuItem();
        subMenuProducts = new javax.swing.JMenuItem();
        menuReservation = new javax.swing.JMenu();
        subMenuReservasConsumption = new javax.swing.JMenuItem();
        subMenuClient = new javax.swing.JMenuItem();
        subMenuPayment = new javax.swing.JMenuItem();
        menuQuery = new javax.swing.JMenu();
        subMenuUserAndAcecessory = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuTools = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPaneMenu.setBackground(new java.awt.Color(255, 255, 255));
        desktopPaneMenu.setAutoscrolls(true);

        lbl_Acess.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lbl_Acess.setForeground(new java.awt.Color(255, 0, 51));
        lbl_Acess.setText("LB_Acess");
        desktopPaneMenu.add(lbl_Acess);
        lbl_Acess.setBounds(10, 20, 160, 20);

        lbl_ID.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(255, 0, 51));
        lbl_ID.setText("LB_ID");
        desktopPaneMenu.add(lbl_ID);
        lbl_ID.setBounds(10, 0, 100, 20);

        lbl_Name.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(255, 0, 51));
        lbl_Name.setText("LB_Name");
        desktopPaneMenu.add(lbl_Name);
        lbl_Name.setBounds(10, 10, 170, 20);

        menuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Inicio.png"))); // NOI18N
        menuSystem.setMnemonic('f');
        menuSystem.setText("Sistema");
        menuSystem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menuSystem);

        menuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/arquivo.png"))); // NOI18N
        menuFile.setMnemonic('e');
        menuFile.setText("Arquivo");
        menuFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        subMenuBedrooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/quartos.png"))); // NOI18N
        subMenuBedrooms.setMnemonic('t');
        subMenuBedrooms.setText("Quartos");
        subMenuBedrooms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuBedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuBedroomsActionPerformed(evt);
            }
        });
        menuFile.add(subMenuBedrooms);

        subMenuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/produtos.png"))); // NOI18N
        subMenuProducts.setMnemonic('y');
        subMenuProducts.setText("Produtos");
        subMenuProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductsActionPerformed(evt);
            }
        });
        menuFile.add(subMenuProducts);

        menuBar.add(menuFile);

        menuReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Reservas.png"))); // NOI18N
        menuReservation.setMnemonic('h');
        menuReservation.setText("Reservas");
        menuReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        subMenuReservasConsumption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/reservas-consumos.png"))); // NOI18N
        subMenuReservasConsumption.setMnemonic('c');
        subMenuReservasConsumption.setText("Reservas e Consumos");
        subMenuReservasConsumption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuReservasConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuReservasConsumptionActionPerformed(evt);
            }
        });
        menuReservation.add(subMenuReservasConsumption);

        subMenuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/clientes.png"))); // NOI18N
        subMenuClient.setMnemonic('a');
        subMenuClient.setText("Clientes");
        subMenuClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subMenuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClientActionPerformed(evt);
            }
        });
        menuReservation.add(subMenuClient);

        subMenuPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/pagamentos.png"))); // NOI18N
        subMenuPayment.setText("Pagamentos");
        subMenuPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuReservation.add(subMenuPayment);

        menuBar.add(menuReservation);

        menuQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/buscar.png"))); // NOI18N
        menuQuery.setText("Consultas");
        menuQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menuQuery);

        subMenuUserAndAcecessory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/configurações.png"))); // NOI18N
        subMenuUserAndAcecessory.setText("Configurações");
        subMenuUserAndAcecessory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/restringir usuario 32x32.png"))); // NOI18N
        jMenuItem1.setText("Usuários e Acessos");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        subMenuUserAndAcecessory.add(jMenuItem1);

        menuBar.add(subMenuUserAndAcecessory);

        menuTools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ferramentas.png"))); // NOI18N
        menuTools.setText("Ferramentas");
        menuTools.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menuTools);

        menuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ajuda.png"))); // NOI18N
        menuHelp.setText("Ajuda");
        menuHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBar.add(menuHelp);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/sair.png"))); // NOI18N
        menuExit.setText("Sair");
        menuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClientActionPerformed
        frm_clients form = new frm_clients();
        desktopPaneMenu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_subMenuClientActionPerformed

    private void subMenuBedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuBedroomsActionPerformed
        frm_bedrooms form = new frm_bedrooms();
        desktopPaneMenu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_subMenuBedroomsActionPerformed

    private void subMenuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductsActionPerformed
        frm_products form = new frm_products();
        desktopPaneMenu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_subMenuProductsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frm_employee form = new frm_employee();
        desktopPaneMenu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_menuExitMouseClicked

    private void subMenuReservasConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuReservasConsumptionActionPerformed
        frm_reservations form = new frm_reservations();
        desktopPaneMenu.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_subMenuReservasConsumptionActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPaneMenu;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lbl_Acess;
    public static javax.swing.JLabel lbl_ID;
    public static javax.swing.JLabel lbl_Name;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    public static javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuQuery;
    private javax.swing.JMenu menuReservation;
    private javax.swing.JMenu menuSystem;
    private javax.swing.JMenu menuTools;
    private javax.swing.JMenuItem subMenuBedrooms;
    private javax.swing.JMenuItem subMenuClient;
    private javax.swing.JMenuItem subMenuPayment;
    private javax.swing.JMenuItem subMenuProducts;
    private javax.swing.JMenuItem subMenuReservasConsumption;
    public static javax.swing.JMenu subMenuUserAndAcecessory;
    // End of variables declaration//GEN-END:variables

}
