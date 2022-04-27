/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Logic.ConnectFormBedrooms;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author fabio
 */
public class frm_bedrooms extends javax.swing.JFrame {

    /**
     * Creates new form frm_bedrooms
     */
    public frm_bedrooms() {
        initComponents();
    }
    
    private String action="save";
    
    //Disable table colum
    void  hide_column(){
         TB_Lista.getColumnModel().getColumn(0).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(0).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    void componentDisable(){
        txt_id_br.setVisible(false);
        txt_numero.setVisible(false);
        cmb_andar.setVisible(false);
        txt_descricao.setVisible(false);
        txt_caracteristica.setVisible(false);
        txt_valDiaria.setVisible(false);
        cmb_estado.setVisible(false);
        cmb_tipoQuarto.setVisible(false);
        
        btn_novo.setEnabled(false);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
        txt_id_br.setText("");
        txt_numero.setText("");
        txt_descricao.setText("");
        txt_caracteristica.setText("");
        txt_valDiaria.setText("");
    }

      void componentEnable(){
        txt_id_br.setVisible(true);
        txt_numero.setVisible(true);
        cmb_andar.setVisible(true);
        txt_descricao.setVisible(true);
        txt_caracteristica.setVisible(true);
        txt_valDiaria.setVisible(true);
        cmb_estado.setVisible(true);
        cmb_tipoQuarto.setVisible(true);
        
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        txt_id_br.setText("");
        txt_numero.setText("");
        txt_descricao.setText("");
        txt_caracteristica.setText("");
        txt_valDiaria.setText("");
    }  
      
      void show(String searching){
          
          try {
              DefaultTableModel model;
              ConnectFormBedrooms func=new ConnectFormBedrooms();
              model = func.show(searching);
              TB_Lista.setModel(model);
              
              hide_column();
              lbl_registros.setText("Total Registros "+Integer.toString(func.recordTotal));
          } catch (Exception e) {
                 JOptionPane.showConfirmDialog(null, e);
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

        jpa_cadQuartos = new javax.swing.JPanel();
        lbl_cadQuarto = new javax.swing.JLabel();
        lbl_numero = new javax.swing.JLabel();
        lbl_andar = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        cmb_andar = new javax.swing.JComboBox<>();
        lbl_descricao = new javax.swing.JLabel();
        jsc_descricao = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
        lbl_caracteristica = new javax.swing.JLabel();
        jsc_caracteristica = new javax.swing.JScrollPane();
        txt_caracteristica = new javax.swing.JTextArea();
        lbl_valDiaria = new javax.swing.JLabel();
        txt_valDiaria = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        cmb_estado = new javax.swing.JComboBox<>();
        lbl_tipoQuarto = new javax.swing.JLabel();
        cmb_tipoQuarto = new javax.swing.JComboBox<>();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        txt_id_br = new javax.swing.JTextField();
        jpa_listaQuartos = new javax.swing.JPanel();
        lbl_cadQuarto1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_Lista = new javax.swing.JTable();
        txt_pesquisar = new javax.swing.JTextField();
        lbl_pesquisar = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        lbl_registros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));

        jpa_cadQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_cadQuarto.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_cadQuarto.setText("Cadastro de Quartos");

        lbl_numero.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_numero.setText("Número");

        lbl_andar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_andar.setText("Andar");

        cmb_andar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1°", "2°", "3°", "4°", "5°", "6°", "7°" }));

        lbl_descricao.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_descricao.setText("Descrição");

        txt_descricao.setColumns(20);
        txt_descricao.setRows(5);
        jsc_descricao.setViewportView(txt_descricao);

        lbl_caracteristica.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_caracteristica.setText("Caracteristicas");

        txt_caracteristica.setColumns(20);
        txt_caracteristica.setRows(5);
        jsc_caracteristica.setViewportView(txt_caracteristica);

        lbl_valDiaria.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_valDiaria.setText("Valor Diária");

        lbl_estado.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_estado.setText("Estado");
        lbl_estado.setPreferredSize(new java.awt.Dimension(28, 13));

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Ocupado", "Manutenção", " " }));

        lbl_tipoQuarto.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_tipoQuarto.setText("Tipo Quarto");
        lbl_tipoQuarto.setPreferredSize(new java.awt.Dimension(28, 13));

        cmb_tipoQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Família", "Presidencial" }));

        btn_novo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_novo.setText("Novo");

        btn_cancelar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");

        btn_salvar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");

        javax.swing.GroupLayout jpa_cadQuartosLayout = new javax.swing.GroupLayout(jpa_cadQuartos);
        jpa_cadQuartos.setLayout(jpa_cadQuartosLayout);
        jpa_cadQuartosLayout.setHorizontalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_numero)
                            .addComponent(lbl_descricao)
                            .addComponent(lbl_caracteristica)
                            .addComponent(lbl_valDiaria)
                            .addComponent(lbl_tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                                    .addComponent(txt_valDiaria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(lbl_andar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmb_andar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jsc_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jsc_caracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_id_br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_cadQuarto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jpa_cadQuartosLayout.setVerticalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadQuarto)
                    .addComponent(txt_id_br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_andar)
                            .addComponent(cmb_andar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsc_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_numero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_descricao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_caracteristica)
                    .addComponent(jsc_caracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valDiaria)
                    .addComponent(txt_valDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpa_listaQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_cadQuarto1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_cadQuarto1.setText("Lista de Quartos");

        TB_Lista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TB_Lista);

        lbl_pesquisar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_pesquisar.setText("Pesquisar");

        btn_sair.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair.setText("Sair");

        btn_buscar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_apagar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_apagar.setText("Apagar");

        lbl_registros.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_registros.setText("Registros");

        javax.swing.GroupLayout jpa_listaQuartosLayout = new javax.swing.GroupLayout(jpa_listaQuartos);
        jpa_listaQuartos.setLayout(jpa_listaQuartosLayout);
        jpa_listaQuartosLayout.setHorizontalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cadQuarto1)
                            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                                .addComponent(lbl_pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_apagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_sair)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registros)
                .addGap(31, 31, 31))
        );
        jpa_listaQuartosLayout.setVerticalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addComponent(lbl_cadQuarto1)
                .addGap(18, 18, 18)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_sair)
                    .addComponent(btn_apagar)
                    .addComponent(lbl_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_bedrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_bedrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_bedrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_bedrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_bedrooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Lista;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cmb_andar;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JComboBox<String> cmb_tipoQuarto;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpa_cadQuartos;
    private javax.swing.JPanel jpa_listaQuartos;
    private javax.swing.JScrollPane jsc_caracteristica;
    private javax.swing.JScrollPane jsc_descricao;
    private javax.swing.JLabel lbl_andar;
    private javax.swing.JLabel lbl_cadQuarto;
    private javax.swing.JLabel lbl_cadQuarto1;
    private javax.swing.JLabel lbl_caracteristica;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JLabel lbl_registros;
    private javax.swing.JLabel lbl_tipoQuarto;
    private javax.swing.JLabel lbl_valDiaria;
    private javax.swing.JTextArea txt_caracteristica;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_id_br;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_valDiaria;
    // End of variables declaration//GEN-END:variables
}
