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

        menuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Inicio.png"))); // NOI18N
        menuSystem.setMnemonic('f');
        menuSystem.setText("Sistema");
        menuBar.add(menuSystem);

        menuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/arquivo.png"))); // NOI18N
        menuFile.setMnemonic('e');
        menuFile.setText("Arquivo");

        subMenuBedrooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/quartos.png"))); // NOI18N
        subMenuBedrooms.setMnemonic('t');
        subMenuBedrooms.setText("Quartos");
        menuFile.add(subMenuBedrooms);

        subMenuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/produtos.png"))); // NOI18N
        subMenuProducts.setMnemonic('y');
        subMenuProducts.setText("Produtos");
        menuFile.add(subMenuProducts);

        menuBar.add(menuFile);

        menuReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/Reservas.png"))); // NOI18N
        menuReservation.setMnemonic('h');
        menuReservation.setText("Reservas");

        subMenuReservasConsumption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/reservas-consumos.png"))); // NOI18N
        subMenuReservasConsumption.setMnemonic('c');
        subMenuReservasConsumption.setText("Reservas e Consumos");
        menuReservation.add(subMenuReservasConsumption);

        subMenuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/clientes.png"))); // NOI18N
        subMenuClient.setMnemonic('a');
        subMenuClient.setText("Clientes");
        subMenuClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClientActionPerformed(evt);
            }
        });
        menuReservation.add(subMenuClient);

        subMenuPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/pagamentos.png"))); // NOI18N
        subMenuPayment.setText("Pagamentos");
        menuReservation.add(subMenuPayment);

        menuBar.add(menuReservation);

        menuQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/buscar.png"))); // NOI18N
        menuQuery.setText("Consultas");
        menuBar.add(menuQuery);

        subMenuUserAndAcecessory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/configurações.png"))); // NOI18N
        subMenuUserAndAcecessory.setText("Configurações");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/restringir usuario 32x32.png"))); // NOI18N
        jMenuItem1.setText("Usuários e Acessos");
        subMenuUserAndAcecessory.add(jMenuItem1);

        menuBar.add(subMenuUserAndAcecessory);

        menuTools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ferramentas.png"))); // NOI18N
        menuTools.setText("Ferramentas");
        menuBar.add(menuTools);

        menuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/ajuda.png"))); // NOI18N
        menuHelp.setText("Ajuda");
        menuBar.add(menuHelp);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/sair.png"))); // NOI18N
        menuExit.setText("Sair");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuClientActionPerformed

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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuFile;
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
    private javax.swing.JMenu subMenuUserAndAcecessory;
    // End of variables declaration//GEN-END:variables

}