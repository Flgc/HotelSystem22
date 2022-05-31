/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Vpayment;
import Logic.ConnectFormConsum;
import Logic.ConnectFormPayment;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class frm_payment extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_products
     */
    public frm_payment() {
        initComponents();
        componentDisable();
        showSearch(idreservation);        
        txt_id_reserv.setText(idreservation);
        txt_name_client.setText(client);
        txt_id_bedroom.setText(idBedroom);
        txt_bedroom_number.setText(bedroom);
        txt_total_reserv.setText(Double.toString(totalReservation));
        
        ConnectFormConsum func = new ConnectFormConsum();
        func.showSearch(idreservation);
        txt_total_pay.setText(Double.toString(totalReservation+func.comsumTotal));
        
    }

    private String action="save";
    public static String idreservation;
    public static String client;
    public static String idBedroom;
    public static String bedroom;
    public static Double totalReservation;
    
    //Disable table colum
    void  hide_column(){
         TB_ListaPagamentos.getColumnModel().getColumn(0).setMaxWidth(0);
         TB_ListaPagamentos.getColumnModel().getColumn(0).setMinWidth(0);
         TB_ListaPagamentos.getColumnModel().getColumn(0).setPreferredWidth(0);

         TB_ListaPagamentos.getColumnModel().getColumn(1).setMaxWidth(0);
         TB_ListaPagamentos.getColumnModel().getColumn(1).setMinWidth(0);
         TB_ListaPagamentos.getColumnModel().getColumn(1).setPreferredWidth(0);         
    }
    
      void  hide_columnConsumo(){
         TB_ListaConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(0).setMinWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(0).setPreferredWidth(0);

         TB_ListaConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(1).setMinWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);       

         TB_ListaConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(2).setMinWidth(0);
         TB_ListaConsumo.getColumnModel().getColumn(2).setPreferredWidth(0);              
    }
    
    void componentDisable(){
        txt_id_payment.setVisible(false);
        txt_id_reserv.setVisible(false);
        txt_id_bedroom.setVisible(false);
        cmb_type_pay.setVisible(false);
        txt_name_client.setVisible(false);
        txt_total_pay.setVisible(false);
        txt_bedroom_number.setVisible(false);
        txt_total_reserv.setVisible(false);
        jdc_emission_pay.setVisible(false);
        jdc_date_pay.setVisible(false);
        txt_number_pay.setVisible(false);
        txt_rate_pay.setVisible(false);
        
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
        txt_name_client.setText("");
    }

      void componentEnable(){
        txt_id_payment.setVisible(false);
        txt_id_reserv.setVisible(false);
        txt_id_bedroom.setVisible(false);
        cmb_type_pay.setVisible(true);
        txt_name_client.setVisible(false);
        txt_total_pay.setVisible(false);
        txt_bedroom_number.setVisible(false);
        txt_total_reserv.setVisible(false);
        jdc_emission_pay.setVisible(true);
        jdc_date_pay.setVisible(true);
        txt_number_pay.setVisible(true);
        txt_rate_pay.setVisible(true);
        
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        txt_name_client.setText("");
    }  
      
      void showSearch(String searching){
          
          try {
              DefaultTableModel model;
              ConnectFormPayment func = new ConnectFormPayment();
              model = func.showSearch(searching);
              TB_ListaPagamentos.setModel(model);
              hide_column();
              lbl_registros.setText("Total Registros "+Integer.toString(func.recordTotal));              

              // Show consum table
              ConnectFormConsum func2 = new ConnectFormConsum();
              model = func2.showSearch(searching);
              TB_ListaConsumo.setModel(model);
              
              hide_column();
              lbl_reg_consum.setText("Total Registros "+Integer.toString(func2.recordTotal));
              lbl_tot_consum.setText("Consumo Total: R$ "+func2.comsumTotal);
          } catch (Exception e) {
                 JOptionPane.showConfirmDialog(null, e);
          }          
      } 

    void cleanField(){
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
        lbl_name_client = new javax.swing.JLabel();
        lbl_type_pay = new javax.swing.JLabel();
        txt_name_client = new javax.swing.JTextField();
        lbl_bedroom_number = new javax.swing.JLabel();
        cmb_type_pay = new javax.swing.JComboBox<>();
        txt_id_reserv = new javax.swing.JTextField();
        txt_id_payment = new javax.swing.JTextField();
        txt_id_bedroom = new javax.swing.JTextField();
        txt_bedroom_number = new javax.swing.JTextField();
        lbl_number_pay = new javax.swing.JLabel();
        txt_number_pay = new javax.swing.JTextField();
        lbl_rate_pay = new javax.swing.JLabel();
        txt_rate_pay = new javax.swing.JTextField();
        lbl_total_pay = new javax.swing.JLabel();
        txt_total_pay = new javax.swing.JTextField();
        lbl_date_pay = new javax.swing.JLabel();
        jdc_date_pay = new com.toedter.calendar.JDateChooser();
        lbl_emission_pay = new javax.swing.JLabel();
        jdc_emission_pay = new com.toedter.calendar.JDateChooser();
        lbl_total_reserv = new javax.swing.JLabel();
        txt_total_reserv = new javax.swing.JTextField();
        jpa_listaQuartos = new javax.swing.JPanel();
        lbl_listaProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_ListaConsumo = new javax.swing.JTable();
        lbl_reg_consum = new javax.swing.JLabel();
        lbl_tot_consum = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jpa_listaQuartos3 = new javax.swing.JPanel();
        lbl_listaProdutos3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TB_ListaPagamentos = new javax.swing.JTable();
        txt_pesquisar3 = new javax.swing.JTextField();
        lbl_pesquisar3 = new javax.swing.JLabel();
        btn_sair3 = new javax.swing.JButton();
        btn_buscar3 = new javax.swing.JButton();
        btn_apagar3 = new javax.swing.JButton();
        lbl_registros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Pagamentos");

        jpa_cadQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_cadProd.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_cadProd.setText("Cadastro de Pagamentos");

        lbl_name_client.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_name_client.setText("Cliente");

        lbl_type_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_type_pay.setText("Tipo Comp");

        txt_name_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_clientActionPerformed(evt);
            }
        });

        lbl_bedroom_number.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_bedroom_number.setText("Número Quarto");

        cmb_type_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RECIBO", "NOTA", "CUPOM FISCAL" }));
        cmb_type_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_type_payActionPerformed(evt);
            }
        });

        txt_bedroom_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bedroom_numberActionPerformed(evt);
            }
        });

        lbl_number_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_number_pay.setText("Número Comp");

        txt_number_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_number_payActionPerformed(evt);
            }
        });

        lbl_rate_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_rate_pay.setText("Taxa");

        txt_rate_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rate_payActionPerformed(evt);
            }
        });

        lbl_total_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_total_pay.setText("Total Pago");

        txt_total_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_payActionPerformed(evt);
            }
        });

        lbl_date_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_date_pay.setText("Data Pagamento");

        lbl_emission_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_emission_pay.setText("Data Emissão");

        lbl_total_reserv.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_total_reserv.setText("Total Reserva");

        txt_total_reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_reservActionPerformed(evt);
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
                        .addComponent(txt_id_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_total_pay)
                            .addComponent(lbl_rate_pay))
                        .addGap(34, 34, 34)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cmb_type_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_total_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_rate_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_number_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85))
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addComponent(txt_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_name_client)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addComponent(txt_bedroom_number, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_date_pay)
                            .addComponent(lbl_emission_pay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_emission_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdc_date_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name_client)
                            .addComponent(lbl_bedroom_number)
                            .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_number_pay)
                                .addComponent(lbl_type_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpa_cadQuartosLayout.setVerticalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addComponent(lbl_cadProd)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                        .addComponent(lbl_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbl_bedroom_number, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_bedroom_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                            .addComponent(txt_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31))))
                .addGap(13, 13, 13)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_type_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_type_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(txt_number_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_rate_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rate_pay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total_pay)))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lbl_number_pay)))
                .addGap(18, 18, 18)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_date_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_emission_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_emission_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jpa_listaQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_listaProdutos.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_listaProdutos.setText("Lista de Consumos");

        TB_ListaConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        TB_ListaConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ListaConsumoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TB_ListaConsumo);

        lbl_reg_consum.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_reg_consum.setText("Registros");

        lbl_tot_consum.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_tot_consum.setText("Tot Consumo");

        javax.swing.GroupLayout jpa_listaQuartosLayout = new javax.swing.GroupLayout(jpa_listaQuartos);
        jpa_listaQuartos.setLayout(jpa_listaQuartosLayout);
        jpa_listaQuartosLayout.setHorizontalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_listaQuartosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_tot_consum)
                        .addGap(171, 171, 171)
                        .addComponent(lbl_reg_consum)
                        .addGap(47, 47, 47))
                    .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_listaProdutos)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpa_listaQuartosLayout.setVerticalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addComponent(lbl_listaProdutos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_reg_consum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_tot_consum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        jpa_listaQuartos3.setForeground(new java.awt.Color(204, 204, 204));

        lbl_listaProdutos3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_listaProdutos3.setText("Lista de Pagamentos");

        TB_ListaPagamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        TB_ListaPagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ListaPagamentosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TB_ListaPagamentos);

        txt_pesquisar3.setName(""); // NOI18N

        lbl_pesquisar3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_pesquisar3.setText("Pesquisar");

        btn_sair3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_sair3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair3.setText("Sair");
        btn_sair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sair3ActionPerformed(evt);
            }
        });

        btn_buscar3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_buscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_buscar3.setText("Buscar");
        btn_buscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar3ActionPerformed(evt);
            }
        });

        btn_apagar3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_apagar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/salvar.png"))); // NOI18N
        btn_apagar3.setText("Apagar");
        btn_apagar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagar3ActionPerformed(evt);
            }
        });

        lbl_registros.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_registros.setText("Registros");

        javax.swing.GroupLayout jpa_listaQuartos3Layout = new javax.swing.GroupLayout(jpa_listaQuartos3);
        jpa_listaQuartos3.setLayout(jpa_listaQuartos3Layout);
        jpa_listaQuartos3Layout.setHorizontalGroup(
            jpa_listaQuartos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_listaQuartos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_listaProdutos3)
                    .addGroup(jpa_listaQuartos3Layout.createSequentialGroup()
                        .addComponent(lbl_pesquisar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_pesquisar3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_apagar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sair3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_listaQuartos3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_registros)
                .addGap(45, 45, 45))
        );
        jpa_listaQuartos3Layout.setVerticalGroup(
            jpa_listaQuartos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartos3Layout.createSequentialGroup()
                .addComponent(lbl_listaProdutos3)
                .addGap(18, 18, 18)
                .addGroup(jpa_listaQuartos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar3)
                    .addComponent(btn_sair3)
                    .addComponent(btn_apagar3)
                    .addComponent(lbl_pesquisar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpa_listaQuartos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpa_listaQuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_name_client.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira o nome do cliente");
            txt_name_client.requestFocus();
        }

        Vpayment dts = new  Vpayment();
        ConnectFormPayment func = new ConnectFormPayment();

        dts.setIdreservat(Integer.parseInt(txt_id_reserv.getText()));
       dts.setNumberpay(Integer.parseInt(txt_number_pay.getText()));
       dts.setRatepay(Double.parseDouble(txt_rate_pay.getText()));
       dts.setTotalpay(Double.parseDouble(txt_total_pay.getText()));
       
        int selectedItem = cmb_type_pay.getSelectedIndex();
        selectedItem = cmb_type_pay.getSelectedIndex();
        dts.setTypepay((String) cmb_type_pay.getItemAt(selectedItem));
       
        Calendar cal ;
        int d,m,y;
        cal=jdc_date_pay.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        y=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDate_pay(new Date(y,m,d));

        cal=jdc_emission_pay.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        y=cal.get(Calendar.YEAR) - 1900;
        
        dts.setEmissionpay(new Date(y,m,d));  

        if (action.equals("save")){
            if (func.insert(dts)){
                JOptionPane.showMessageDialog(rootPane, "O Pagamento foi registrado com sucesso!");
                showSearch(idreservation);
                componentDisable();
            }
        }
        else if(action.equals("edit")){
            dts.setIdpay(Integer.parseInt(txt_id_reserv.getText()));

            if (func.edit(dts)){
                JOptionPane.showMessageDialog(rootPane, "O Pagamento foi editado com sucesso!");
                showSearch(idreservation);
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

    private void cmb_type_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_type_payActionPerformed
        cmb_type_pay.transferFocus();
    }//GEN-LAST:event_cmb_type_payActionPerformed

    private void txt_name_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_clientActionPerformed
        txt_name_client.transferFocus();
    }//GEN-LAST:event_txt_name_clientActionPerformed

    private void TB_ListaPagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListaPagamentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TB_ListaPagamentosMouseClicked

    private void btn_sair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sair3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sair3ActionPerformed

    private void btn_buscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar3ActionPerformed

    private void btn_apagar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_apagar3ActionPerformed

    private void txt_bedroom_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bedroom_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bedroom_numberActionPerformed

    private void txt_number_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_number_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_number_payActionPerformed

    private void txt_rate_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rate_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rate_payActionPerformed

    private void txt_total_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_payActionPerformed

    private void TB_ListaConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListaConsumoMouseClicked
        btn_salvar.setText("Editar");
        componentEnable();
        btn_apagar.setEnabled(true);
        action="edit";
        int rowActive = TB_ListaConsumo.rowAtPoint(evt.getPoint());

        txt_id_reserv.setText(TB_ListaConsumo.getValueAt(rowActive, 0).toString());
        txt_name_client.setText(TB_ListaConsumo.getValueAt(rowActive, 1).toString());
        txt_descript_prod.setText(TB_ListaConsumo.getValueAt(rowActive, 2).toString());
        cmb_type_pay.setSelectedItem(TB_ListaConsumo.getValueAt(rowActive, 3).toString());
        txt_price_prod.setText(TB_ListaConsumo.getValueAt(rowActive, 4).toString());
    }//GEN-LAST:event_TB_ListaConsumoMouseClicked

    private void txt_total_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_reservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_reservActionPerformed

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
            java.util.logging.Logger.getLogger(frm_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_ListaConsumo;
    private javax.swing.JTable TB_ListaPagamentos;
    private javax.swing.JButton btn_apagar3;
    private javax.swing.JButton btn_buscar3;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair3;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cmb_type_pay;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private com.toedter.calendar.JDateChooser jdc_date_pay;
    private com.toedter.calendar.JDateChooser jdc_emission_pay;
    private javax.swing.JPanel jpa_cadQuartos;
    private javax.swing.JPanel jpa_listaQuartos;
    private javax.swing.JPanel jpa_listaQuartos3;
    private javax.swing.JLabel lbl_bedroom_number;
    private javax.swing.JLabel lbl_cadProd;
    private javax.swing.JLabel lbl_date_pay;
    private javax.swing.JLabel lbl_emission_pay;
    private javax.swing.JLabel lbl_listaProdutos;
    private javax.swing.JLabel lbl_listaProdutos3;
    private javax.swing.JLabel lbl_name_client;
    private javax.swing.JLabel lbl_number_pay;
    private javax.swing.JLabel lbl_pesquisar3;
    private javax.swing.JLabel lbl_rate_pay;
    private javax.swing.JLabel lbl_reg_consum;
    private javax.swing.JLabel lbl_registros;
    private javax.swing.JLabel lbl_tot_consum;
    private javax.swing.JLabel lbl_total_pay;
    private javax.swing.JLabel lbl_total_reserv;
    private javax.swing.JLabel lbl_type_pay;
    private javax.swing.JTextField txt_bedroom_number;
    private javax.swing.JTextField txt_id_bedroom;
    private javax.swing.JTextField txt_id_payment;
    private javax.swing.JTextField txt_id_reserv;
    private javax.swing.JTextField txt_name_client;
    private javax.swing.JTextField txt_number_pay;
    private javax.swing.JTextField txt_pesquisar3;
    private javax.swing.JTextField txt_rate_pay;
    private javax.swing.JTextField txt_total_pay;
    private javax.swing.JTextField txt_total_reserv;
    // End of variables declaration//GEN-END:variables
}
