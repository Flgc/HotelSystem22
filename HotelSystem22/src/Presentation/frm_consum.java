/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Vconsum;
import Logic.ConnectFormConsum;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class frm_consum extends javax.swing.JInternalFrame {
    
    public static String clients;
    public static String idreservations;

    /**
     * Creates new form frm_products
     */
    public frm_consum() {
        initComponents();
        componentDisable();
        showSearch("id_reservat");        
        txt_name_client.setText(clients);
        txt_id_reserv.setText(idreservations);
    }

    private String action="save";
    
    //Disable table colum
    void  hide_column(){
         TB_Lista.getColumnModel().getColumn(0).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(0).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(0).setPreferredWidth(0);

         TB_Lista.getColumnModel().getColumn(1).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(1).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(1).setPreferredWidth(0);

         TB_Lista.getColumnModel().getColumn(2).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(2).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(2).setPreferredWidth(0);       
    }
    
    void componentDisable(){
        txt_id_con.setVisible(false);
        txt_id_produc.setVisible(false);;
        txt_id_reserv.setVisible(false);

        cmb_state_cons.setEnabled(false);
        txt_name_client.setEnabled(false);
        txt_name_product.setEnabled(false);
        txt_price_consu.setEnabled(false);
        txt_qtd_cons.setEnabled(false);
        
        btn_salvar.setEnabled(false);
        btn_find_prod.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
        txt_name_product.setText("");
        txt_price_consu.setText("");
        txt_qtd_cons.setText("");
    }

      void componentEnable(){
        txt_id_con.setVisible(false);
        
        cmb_state_cons.setEnabled(true);
        txt_name_client.setEnabled(false);
        txt_name_product.setEnabled(false);
        txt_price_consu.setEnabled(false);
        txt_qtd_cons.setEnabled(true);
        
        btn_salvar.setEnabled(true);
        btn_find_prod.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        txt_name_product.setText("");
        txt_price_consu.setText("");
        txt_qtd_cons.setText("");
    }  
      
      void showSearch(String searching){
          
          try {
              DefaultTableModel model;
              ConnectFormConsum func=new ConnectFormConsum();
              model = func.showSearch(searching);
              TB_Lista.setModel(model);
              
              hide_column();
              lbl_registros.setText("Total Registros "+Integer.toString(func.recordTotal));
              lbl_consum.setText("Consumo Total R$ "+func.comsumTotal);
          } catch (Exception e) {
                 JOptionPane.showConfirmDialog(null, e);
          }          
      } 

    void cleanField(){
        txt_id_con.setText("");
        txt_name_product.setText("");
        txt_price_consu.setText("");
        txt_qtd_cons.setText("");
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
        lbl_cadProd = new javax.swing.JLabel();
        lbl_client = new javax.swing.JLabel();
        lbl_state = new javax.swing.JLabel();
        txt_name_client = new javax.swing.JTextField();
        lbl_price = new javax.swing.JLabel();
        txt_price_consu = new javax.swing.JTextField();
        cmb_state_cons = new javax.swing.JComboBox<>();
        txt_id_con = new javax.swing.JTextField();
        txt_id_reserv = new javax.swing.JTextField();
        txt_id_produc = new javax.swing.JTextField();
        lbl_product = new javax.swing.JLabel();
        txt_name_product = new javax.swing.JTextField();
        btn_find_prod = new javax.swing.JButton();
        lbl_price1 = new javax.swing.JLabel();
        txt_qtd_cons = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jpa_listaQuartos = new javax.swing.JPanel();
        lbl_listaProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_Lista = new javax.swing.JTable();
        btn_sair = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        lbl_registros = new javax.swing.JLabel();
        lbl_consum = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Consumo");

        jpa_cadQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_cadProd.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_cadProd.setText("Cadastro de Consumos");

        lbl_client.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_client.setText("Cliente");

        lbl_state.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_state.setText("Estado");
        lbl_state.setToolTipText("");

        txt_name_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_clientActionPerformed(evt);
            }
        });

        lbl_price.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_price.setText("Valor ");

        txt_price_consu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_price_consuActionPerformed(evt);
            }
        });

        cmb_state_cons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONFIRMADO", "CANCELADO" }));
        cmb_state_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_state_consActionPerformed(evt);
            }
        });

        lbl_product.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_product.setText("Produtos");

        txt_name_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_productActionPerformed(evt);
            }
        });

        btn_find_prod.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_find_prod.setText("...");
        btn_find_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_prodActionPerformed(evt);
            }
        });

        lbl_price1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_price1.setText("QTD");
        lbl_price1.setToolTipText("");

        txt_qtd_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtd_consActionPerformed(evt);
            }
        });

        btn_novo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Limpar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpa_cadQuartosLayout = new javax.swing.GroupLayout(jpa_cadQuartos);
        jpa_cadQuartos.setLayout(jpa_cadQuartosLayout);
        jpa_cadQuartosLayout.setHorizontalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                        .addComponent(lbl_cadProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id_produc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id_con, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_client)
                            .addComponent(lbl_product)
                            .addComponent(lbl_price)
                            .addComponent(lbl_state))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name_client)
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addComponent(txt_price_consu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_price1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_qtd_cons, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_state_cons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addComponent(txt_name_product, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_find_prod)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpa_cadQuartosLayout.setVerticalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadProd)
                    .addComponent(txt_id_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_produc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_client, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_product, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_find_prod))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_price)
                    .addComponent(txt_price_consu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_price1)
                    .addComponent(txt_qtd_cons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_state_cons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_state))
                .addGap(18, 18, 18)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpa_listaQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_listaProdutos.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_listaProdutos.setText("Lista de Consumos");

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
        TB_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ListaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TB_Lista);

        btn_sair.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_apagar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        lbl_registros.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_registros.setText("Registros");

        lbl_consum.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_consum.setText("Consumo");

        javax.swing.GroupLayout jpa_listaQuartosLayout = new javax.swing.GroupLayout(jpa_listaQuartos);
        jpa_listaQuartos.setLayout(jpa_listaQuartosLayout);
        jpa_listaQuartosLayout.setHorizontalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_listaProdutos)
                    .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btn_apagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_consum)
                .addGap(36, 36, 36)
                .addComponent(lbl_registros)
                .addGap(54, 54, 54))
        );
        jpa_listaQuartosLayout.setVerticalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addComponent(lbl_listaProdutos)
                .addGap(18, 18, 18)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sair)
                    .addComponent(btn_apagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_consum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListaMouseClicked
        btn_salvar.setText("Editar");
        componentEnable();
        btn_apagar.setEnabled(true);
        action="edit";
        int rowActive = TB_Lista.rowAtPoint(evt.getPoint());

        txt_id_con.setText(TB_Lista.getValueAt(rowActive, 0).toString());
        txt_id_reserv.setText(TB_Lista.getValueAt(rowActive, 1).toString());
        txt_id_produc.setText(TB_Lista.getValueAt(rowActive, 2).toString());
        txt_name_product.setText(TB_Lista.getValueAt(rowActive, 3).toString());
        txt_qtd_cons.setText(TB_Lista.getValueAt(rowActive, 4).toString());
        txt_price_consu.setText(TB_Lista.getValueAt(rowActive, 5).toString());      
        cmb_state_cons.setSelectedItem(TB_Lista.getValueAt(rowActive, 6).toString());
    }//GEN-LAST:event_TB_ListaMouseClicked

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if(!txt_id_con.getText().equals("")){
            int confirmation = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir esse registro?", "Excluir", 2);
            if (confirmation == 0){
                ConnectFormConsum func = new ConnectFormConsum();
                Vconsum dts = new Vconsum();
                dts.setIdcon(Integer.parseInt(txt_id_con.getText()));
                func.delete(dts);
                showSearch("id_reservat");
                componentDisable();
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_name_client.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira o nome do cliente");
            txt_name_client.requestFocus();
        }

        if (txt_price_consu.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira o valor do produto");
            txt_price_consu.requestFocus();
        }
        
        if (txt_qtd_cons.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira a quantidade");
            txt_qtd_cons.requestFocus();
        }        

        Vconsum dts = new  Vconsum();
        ConnectFormConsum func = new ConnectFormConsum();

        dts.setIdreservat(Integer.parseInt(txt_id_reserv.getText()));
        dts.setIdproduct(Integer.parseInt(txt_id_produc.getText()));
        dts.setQuantitycon(Double.parseDouble(txt_qtd_cons.getText()));
        dts.setPricecon(Double.parseDouble(txt_price_consu.getText()));

        int selectedItem = cmb_state_cons.getSelectedIndex();
        dts.setStateres((String) cmb_state_cons.getItemAt(selectedItem));

        if (action.equals("save")){
            if (func.insert(dts)){
                JOptionPane.showMessageDialog(rootPane, "O Consumo foi registrado com sucesso!");
                showSearch("id_reservat");
                componentDisable();
            }
        }
        else if(action.equals("edit")){
            dts.setIdcon(Integer.parseInt(txt_id_con.getText()));

            if (func.edit(dts)){
                JOptionPane.showMessageDialog(rootPane, "O Consumo foi editado com sucesso!");
                showSearch("id_reservat");
                componentDisable();
            }
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        cleanField();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        componentEnable();
        btn_salvar.setText("Salvar");
        action="save";
        btn_novo.setEnabled(false);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void cmb_state_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_state_consActionPerformed
        cmb_state_cons.transferFocus();
    }//GEN-LAST:event_cmb_state_consActionPerformed

    private void txt_price_consuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_price_consuActionPerformed
        txt_price_consu.transferFocus();
    }//GEN-LAST:event_txt_price_consuActionPerformed

    private void txt_name_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_clientActionPerformed
        txt_name_client.transferFocus();
    }//GEN-LAST:event_txt_name_clientActionPerformed

    private void txt_name_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_productActionPerformed

    private void btn_find_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_prodActionPerformed
        frm_search_products form = new frm_search_products();
        form.toFront();
        form.setVisible(true);        
    }//GEN-LAST:event_btn_find_prodActionPerformed

    private void txt_qtd_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtd_consActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtd_consActionPerformed

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
            java.util.logging.Logger.getLogger(frm_consum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_consum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_consum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_consum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_consum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Lista;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_find_prod;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cmb_state_cons;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpa_cadQuartos;
    private javax.swing.JPanel jpa_listaQuartos;
    private javax.swing.JLabel lbl_cadProd;
    private javax.swing.JLabel lbl_client;
    private javax.swing.JLabel lbl_consum;
    private javax.swing.JLabel lbl_listaProdutos;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_price1;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_registros;
    private javax.swing.JLabel lbl_state;
    private javax.swing.JTextField txt_id_con;
    public static javax.swing.JTextField txt_id_produc;
    private javax.swing.JTextField txt_id_reserv;
    private javax.swing.JTextField txt_name_client;
    public static javax.swing.JTextField txt_name_product;
    public static javax.swing.JTextField txt_price_consu;
    private javax.swing.JTextField txt_qtd_cons;
    // End of variables declaration//GEN-END:variables
}
