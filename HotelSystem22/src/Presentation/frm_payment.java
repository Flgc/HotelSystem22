/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Vbedrooms;
import Data.Vpayment;
import Data.Vreservations;
import Logic.ConnectFormBedrooms;
import Logic.ConnectFormConsum;
import Logic.ConnectFormPayment;
import Logic.ConnectFormReservations;
import Logic.Connections;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

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
         TB_ListaPayments.getColumnModel().getColumn(0).setMaxWidth(0);
         TB_ListaPayments.getColumnModel().getColumn(0).setMinWidth(0);
         TB_ListaPayments.getColumnModel().getColumn(0).setPreferredWidth(0);

         TB_ListaPayments.getColumnModel().getColumn(1).setMaxWidth(0);
         TB_ListaPayments.getColumnModel().getColumn(1).setMinWidth(0);
         TB_ListaPayments.getColumnModel().getColumn(1).setPreferredWidth(0);         
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
        cmb_type_pay.setEnabled(false);
        txt_name_client.setEnabled(false);
        txt_total_pay.setEnabled(false);
        txt_bedroom_number.setEnabled(false);
        txt_total_reserv.setEnabled(false);
        jdc_emission_pay.setEnabled(false);
        jdc_date_pay.setEnabled(false);
        txt_number_pay.setEnabled(false);
        txt_rate_pay.setEnabled(false);
        
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
    }

      void componentEnable(){
        txt_id_payment.setVisible(false);
        txt_id_reserv.setVisible(false);
        txt_id_bedroom.setVisible(false);
        cmb_type_pay.setEnabled(true);
        txt_name_client.setEnabled(false);
        txt_total_pay.setEnabled(false);
        txt_bedroom_number.setEnabled(false);
        txt_total_reserv.setEnabled(false);
        jdc_emission_pay.setEnabled(true);
        jdc_date_pay.setEnabled(true);
        txt_number_pay.setEnabled(true);
        txt_rate_pay.setEnabled(true);
        
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
    }  
      
      void showSearch(String searching){
          
          try {
              DefaultTableModel model;
              ConnectFormPayment func = new ConnectFormPayment();
              model = func.showSearch(searching);
              TB_ListaPayments.setModel(model);
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
        TB_ListaPayments = new javax.swing.JTable();
        btn_sair3 = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        lbl_registros = new javax.swing.JLabel();
        btn_rel = new javax.swing.JButton();

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
        lbl_bedroom_number.setText("N??mero Quarto");

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
        lbl_number_pay.setText("N??mero Comp");

        txt_number_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_number_payActionPerformed(evt);
            }
        });

        lbl_rate_pay.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_rate_pay.setText("Taxa");

        txt_rate_pay.setText("0");
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
        lbl_emission_pay.setText("Data Emiss??o");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addGap(14, 14, 14))
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_name_client)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_bedroom_number, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name_client)
                            .addComponent(lbl_bedroom_number)
                            .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_number_pay)
                                .addComponent(lbl_type_pay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbl_total_reserv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_date_pay)
                                    .addComponent(lbl_emission_pay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdc_date_pay, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jdc_emission_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_emission_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdc_emission_pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_date_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
                        .addComponent(lbl_tot_consum, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
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

        TB_ListaPayments.setModel(new javax.swing.table.DefaultTableModel(
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
        TB_ListaPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_ListaPaymentsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TB_ListaPayments);

        btn_sair3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_sair3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair3.setText("Sair");
        btn_sair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sair3ActionPerformed(evt);
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

        btn_rel.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_rel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/novo.GIF"))); // NOI18N
        btn_rel.setText("Nota Fiscal");
        btn_rel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_relActionPerformed(evt);
            }
        });

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
                        .addComponent(btn_rel)
                        .addGap(165, 165, 165)
                        .addComponent(btn_apagar)
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
                    .addComponent(btn_sair3)
                    .addComponent(btn_apagar)
                    .addComponent(btn_rel))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpa_listaQuartos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpa_listaQuartos3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
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
                
                //Vacate bedroom
                ConnectFormBedrooms func2 = new ConnectFormBedrooms();
                Vbedrooms dts2 = new Vbedrooms();
                
                dts2.setIdBedrooms(Integer.parseInt(txt_id_bedroom.getText()));
                func2.vacate(dts2);
                
                //Pay Out and canceled reservation
                ConnectFormReservations func3 = new ConnectFormReservations();
                Vreservations dts3 = new Vreservations();
                
                dts3.setIdres(Integer.parseInt(txt_id_reserv.getText()));
                func3.paidOut(dts3);
            }
        }
        else if(action.equals("edit")){
            dts.setIdpay(Integer.parseInt(txt_id_payment.getText()));

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

    private void TB_ListaPaymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListaPaymentsMouseClicked
        btn_salvar.setText("Editar");
        componentEnable();
        btn_apagar.setEnabled(true);
        action="edit";
        int rowActive = TB_ListaPayments.rowAtPoint(evt.getPoint());

        txt_id_payment.setText(TB_ListaPayments.getValueAt(rowActive, 0).toString());
        txt_id_reserv.setText(TB_ListaPayments.getValueAt(rowActive, 1).toString());
        cmb_type_pay.setSelectedItem(TB_ListaPayments.getValueAt(rowActive, 2).toString());
        txt_number_pay.setText(TB_ListaPayments.getValueAt(rowActive, 3).toString());
        txt_rate_pay.setText(TB_ListaPayments.getValueAt(rowActive, 4).toString());
        txt_total_pay.setText(TB_ListaPayments.getValueAt(rowActive, 5).toString());
        jdc_date_pay.setDate(Date.valueOf(TB_ListaPayments.getValueAt(rowActive, 6).toString()));
        jdc_emission_pay.setDate(Date.valueOf(TB_ListaPayments.getValueAt(rowActive, 7).toString()));
    }//GEN-LAST:event_TB_ListaPaymentsMouseClicked

    private void btn_sair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sair3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sair3ActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if(!txt_id_payment.getText().equals("")){
            int confirmation = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir esse registro?", "Excluir", 2);
            if (confirmation == 0){
                ConnectFormPayment func = new ConnectFormPayment();
                Vpayment dts = new Vpayment();
                
                dts.setIdpay(Integer.parseInt(txt_id_payment.getText()));
                func.delete(dts);
                showSearch(idreservation);
                componentDisable();
            }
        }        
    }//GEN-LAST:event_btn_apagarActionPerformed

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

    }//GEN-LAST:event_TB_ListaConsumoMouseClicked

    private void txt_total_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_reservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_reservActionPerformed

    private Connections connections=new Connections();
    private Connection cn=connections.connect(); 
    private void btn_relActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_relActionPerformed
        if(!txt_id_payment.getText().equals("")){
            Map map=new HashMap();
            map.put("payment_id", txt_id_payment.getText());
            JasperReport rel;
            JasperPrint imp;

            try {
                rel = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"/src/reports/rel_note.jrxml");
                imp = JasperFillManager.fillReport(rel, map, cn); 
                JasperViewer view = new JasperViewer(imp, false);
                view.setTitle("Impress??o da Nota Fiscal");
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }     
    }//GEN-LAST:event_btn_relActionPerformed

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
    private javax.swing.JTable TB_ListaPayments;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_rel;
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
    private javax.swing.JTextField txt_rate_pay;
    private javax.swing.JTextField txt_total_pay;
    private javax.swing.JTextField txt_total_reserv;
    // End of variables declaration//GEN-END:variables
}
