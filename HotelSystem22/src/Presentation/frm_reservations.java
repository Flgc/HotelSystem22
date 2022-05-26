/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Vreservations;
import Logic.ConnectFormReservations;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class frm_reservations extends javax.swing.JInternalFrame {
    
    public static int idemployee;

    /**
     * Creates new form frm_products
     */
    public frm_reservations() {
        initComponents();
        componentDisable();
        showSearch("null");        
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
         
         TB_Lista.getColumnModel().getColumn(3).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(3).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(3).setPreferredWidth(0);  
         
         TB_Lista.getColumnModel().getColumn(5).setMaxWidth(0);
         TB_Lista.getColumnModel().getColumn(5).setMinWidth(0);
         TB_Lista.getColumnModel().getColumn(5).setPreferredWidth(0);            
    }
    
    void componentDisable(){
        txt_id_res.setVisible(false);
        txt_id_bedroom.setEnabled(false);
        txt_number_br.setEnabled(false);
        txt_id_client.setEnabled(false);
        txt_nom_client.setEnabled(false);
        txt_id_employee.setEnabled(false);
        txt_nom_employee.setEnabled(false);
        cmb_type_res.setEnabled(false);
        jdc_date_res.setEnabled(false);
        jdc_date_checkin_res.setEnabled(false);
        jdc_date_exit_res.setEnabled(false);
        txt_value_bedroom_res.setEnabled(false);
        cmb_state_res.setEnabled(false);               
        
        btn_bedroom.setEnabled(false);
        btn_client.setEnabled(false);
        btn_salvar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        
        txt_id_res.setText("");
        txt_id_bedroom.setText("");    
        txt_number_br.setText("");
        txt_id_client.setText("");
        txt_nom_client.setText("");
        txt_id_employee.setText("");
        txt_nom_employee.setText("");
        jdc_date_res.setDate(Date.valueOf(""));
        jdc_date_checkin_res.setDate(Date.valueOf(""));
        jdc_date_exit_res.setDate(Date.valueOf(""));
        txt_value_bedroom_res.setText("");      
    }

      void componentEnable(){
        
        txt_id_res.setVisible(false);
        txt_id_bedroom.setEnabled(true);
        txt_number_br.setEnabled(true);
        txt_id_client.setEnabled(true);
        txt_nom_client.setEnabled(true);
        txt_id_employee.setEnabled(true);
        txt_nom_employee.setEnabled(true);
        cmb_type_res.setEnabled(true);
        jdc_date_res.setEnabled(true);
        jdc_date_checkin_res.setEnabled(true);
        jdc_date_exit_res.setEnabled(true);
        txt_value_bedroom_res.setEnabled(true);
        cmb_state_res.setEnabled(true);   
        
        btn_bedroom.setEnabled(true);
        btn_client.setEnabled(true);
        btn_novo.setEnabled(true);
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        txt_id_res.setText("");
        txt_id_bedroom.setText("");    
        txt_number_br.setText("");
        txt_id_client.setText("");
        txt_nom_client.setText("");
        txt_id_employee.setText("");
        txt_nom_employee.setText("");
        jdc_date_res.setDate(Date.valueOf(""));
        jdc_date_checkin_res.setDate(Date.valueOf(""));
        jdc_date_exit_res.setDate(Date.valueOf(""));
        txt_value_bedroom_res.setText("");   
    }  
      
      void showSearch(String searching){
          
          try {
              DefaultTableModel model;
              ConnectFormReservations func=new ConnectFormReservations();
              model = func.showSearch(searching);
              TB_Lista.setModel(model);
              
              hide_column();
              lbl_registros.setText("Total Registros "+Integer.toString(func.recordTotal));
          } catch (Exception e) {
                 JOptionPane.showConfirmDialog(null, e);
          }          
      } 

    void cleanField(){
        txt_id_res.setText("");
        txt_id_bedroom.setText("");    
        txt_number_br.setText("");
        txt_id_client.setText("");
        txt_nom_client.setText("");
        txt_id_employee.setText("");
        txt_nom_employee.setText("");
        jdc_date_res.setDate(Date.valueOf(""));
        jdc_date_checkin_res.setDate(Date.valueOf(""));
        jdc_date_exit_res.setDate(Date.valueOf(""));
        txt_value_bedroom_res.setText(""); 
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
        lbl_bedroom = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        txt_id_bedroom = new javax.swing.JTextField();
        lbl_client = new javax.swing.JLabel();
        cmb_type_res = new javax.swing.JComboBox<>();
        txt_id_res = new javax.swing.JTextField();
        txt_number_br = new javax.swing.JTextField();
        txt_id_client = new javax.swing.JTextField();
        txt_nom_client = new javax.swing.JTextField();
        lbl_employee = new javax.swing.JLabel();
        txt_id_employee = new javax.swing.JTextField();
        txt_nom_employee = new javax.swing.JTextField();
        lbl_date_res = new javax.swing.JLabel();
        jdc_date_res = new com.toedter.calendar.JDateChooser();
        lbl_date_checkin_res = new javax.swing.JLabel();
        jdc_date_checkin_res = new com.toedter.calendar.JDateChooser();
        lbl_date_exit_res = new javax.swing.JLabel();
        jdc_date_exit_res = new com.toedter.calendar.JDateChooser();
        lbl_value_bedroom_res = new javax.swing.JLabel();
        txt_value_bedroom_res = new javax.swing.JTextField();
        lbl_state_res = new javax.swing.JLabel();
        cmb_state_res = new javax.swing.JComboBox<>();
        btn_bedroom = new javax.swing.JButton();
        btn_client = new javax.swing.JButton();
        jpa_listaQuartos = new javax.swing.JPanel();
        lbl_listaReservations = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_Lista = new javax.swing.JTable();
        txt_pesquisar = new javax.swing.JTextField();
        lbl_pesquisar = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        lbl_registros = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Reservas");

        jpa_cadQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_cadProd.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_cadProd.setText("Cadastro de Reservas");

        lbl_bedroom.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_bedroom.setText("Quarto");

        lbl_type.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_type.setText("Tipo Reserva");

        txt_id_bedroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_bedroomActionPerformed(evt);
            }
        });

        lbl_client.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_client.setText("Cliente");

        cmb_type_res.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESERVADA", "ALUGADA", " ", " " }));
        cmb_type_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_type_resActionPerformed(evt);
            }
        });

        txt_number_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_number_brActionPerformed(evt);
            }
        });

        txt_id_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_clientActionPerformed(evt);
            }
        });

        txt_nom_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_clientActionPerformed(evt);
            }
        });

        lbl_employee.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_employee.setText("Funcionário");

        txt_id_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_employeeActionPerformed(evt);
            }
        });

        txt_nom_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_employeeActionPerformed(evt);
            }
        });

        lbl_date_res.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_date_res.setText("Data Reserva");

        lbl_date_checkin_res.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_date_checkin_res.setText("Data Entrada");

        lbl_date_exit_res.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_date_exit_res.setText("Data Saída");

        lbl_value_bedroom_res.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_value_bedroom_res.setText("Valor Reserva");

        txt_value_bedroom_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_value_bedroom_resActionPerformed(evt);
            }
        });

        lbl_state_res.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_state_res.setText("Estado");

        cmb_state_res.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUGADA", "PAGA", "CANCELADA", " ", " " }));
        cmb_state_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_state_resActionPerformed(evt);
            }
        });

        btn_bedroom.setText("...");

        btn_client.setText("...");

        javax.swing.GroupLayout jpa_cadQuartosLayout = new javax.swing.GroupLayout(jpa_cadQuartos);
        jpa_cadQuartos.setLayout(jpa_cadQuartosLayout);
        jpa_cadQuartosLayout.setHorizontalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addComponent(lbl_cadProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id_res, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_employee)
                                    .addComponent(lbl_bedroom)
                                    .addComponent(lbl_client))
                                .addGap(19, 19, 19)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addComponent(txt_id_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nom_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_id_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_id_client, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_nom_client, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(txt_number_br))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_client, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_type)
                                    .addComponent(lbl_date_res))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_type_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdc_date_res, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpa_cadQuartosLayout.createSequentialGroup()
                                    .addComponent(lbl_value_bedroom_res)
                                    .addGap(9, 9, 9)
                                    .addComponent(txt_value_bedroom_res))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpa_cadQuartosLayout.createSequentialGroup()
                                    .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_date_checkin_res)
                                        .addComponent(lbl_date_exit_res))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jdc_date_exit_res, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(jdc_date_checkin_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addComponent(lbl_state_res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_state_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpa_cadQuartosLayout.setVerticalGroup(
            jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadProd)
                    .addComponent(txt_id_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_number_br, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_bedroom)
                            .addComponent(btn_bedroom))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_client)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpa_cadQuartosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_employee)
                            .addGroup(jpa_cadQuartosLayout.createSequentialGroup()
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_client))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom_employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_type_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_type))
                .addGap(12, 12, 12)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_date_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_date_checkin_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date_checkin_res, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_date_exit_res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date_exit_res, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_value_bedroom_res)
                    .addComponent(txt_value_bedroom_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpa_cadQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_state_res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_state_res))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpa_listaQuartos.setForeground(new java.awt.Color(204, 204, 204));

        lbl_listaReservations.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        lbl_listaReservations.setText("Lista de Reservas");

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

        txt_pesquisar.setName(""); // NOI18N

        lbl_pesquisar.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_pesquisar.setText("Pesquisar");

        btn_sair.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/images/icones/cancelar.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

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
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        lbl_registros.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbl_registros.setText("Registros");

        javax.swing.GroupLayout jpa_listaQuartosLayout = new javax.swing.GroupLayout(jpa_listaQuartos);
        jpa_listaQuartos.setLayout(jpa_listaQuartosLayout);
        jpa_listaQuartosLayout.setHorizontalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_registros)
                    .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_listaReservations)
                        .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                            .addComponent(lbl_pesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_buscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_apagar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_sair)))))
        );
        jpa_listaQuartosLayout.setVerticalGroup(
            jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpa_listaQuartosLayout.createSequentialGroup()
                .addComponent(lbl_listaReservations)
                .addGap(18, 18, 18)
                .addGroup(jpa_listaQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_sair)
                    .addComponent(btn_apagar)
                    .addComponent(lbl_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_registros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpa_listaQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jpa_cadQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_ListaMouseClicked
        btn_salvar.setText("Editar");
        componentEnable();
        btn_apagar.setEnabled(true);
        action="edit";
        int rowActive = TB_Lista.rowAtPoint(evt.getPoint());

        txt_id_res.setText(TB_Lista.getValueAt(rowActive, 0).toString());
        txt_id_bedroom.setText(TB_Lista.getValueAt(rowActive, 1).toString());
        txt_number_br.setText(TB_Lista.getValueAt(rowActive, 2).toString());
        txt_id_client.setText(TB_Lista.getValueAt(rowActive, 3).toString());
        txt_nom_client.setText(TB_Lista.getValueAt(rowActive, 4).toString());
        txt_id_employee.setText(TB_Lista.getValueAt(rowActive, 5).toString());
        txt_nom_employee.setText(TB_Lista.getValueAt(rowActive, 6).toString());
        cmb_type_res.setSelectedItem(TB_Lista.getValueAt(rowActive, 7).toString());
        jdc_date_res.setDate(Date.valueOf(TB_Lista.getValueAt(rowActive, 8).toString()));
        jdc_date_checkin_res.setDate(Date.valueOf(TB_Lista.getValueAt(rowActive, 9).toString()));
        jdc_date_exit_res.setDate(Date.valueOf(TB_Lista.getValueAt(rowActive, 10).toString()));
        txt_value_bedroom_res.setText(TB_Lista.getValueAt(rowActive, 11).toString());   
        cmb_state_res.setSelectedItem(TB_Lista.getValueAt(rowActive, 12).toString());
    }//GEN-LAST:event_TB_ListaMouseClicked

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        showSearch(txt_pesquisar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if(!txt_id_res.getText().equals("")){
            int confirmation = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir esse registro?", "Excluir", 2);
            if (confirmation == 0){
                ConnectFormReservations func = new ConnectFormReservations();
                Vreservations dts = new Vreservations();
                dts.setIdres(Integer.parseInt(txt_id_res.getText()));
                func.delete(dts);
                showSearch("");
                componentDisable();
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (txt_number_br.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Insira o número do quarto");
            txt_id_bedroom.requestFocus();
        }

        Vreservations dts = new  Vreservations();
        ConnectFormReservations func = new ConnectFormReservations();

        dts.setIdbedroom(Integer.parseInt(txt_id_bedroom.getText()));
        dts.setIdclient(Integer.parseInt(txt_id_client.getText()));
        dts.setIdemployee(idemployee);

        int selectedItem = cmb_type_res.getSelectedIndex();
        dts.setTyperes((String) cmb_type_res.getItemAt(selectedItem));
        
        Calendar cal ;
        int d,m,y;
        cal=jdc_date_res.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        y=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDateres(new Date(y,m,d));
        
        cal=jdc_date_checkin_res.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        y=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDatecheckinres(new Date(y,m,d));
        
        cal=jdc_date_exit_res.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        y=cal.get(Calendar.YEAR) - 1900;
        
        dts.setDateexitres(new Date(y,m,d));  
        
        dts.setValuebedroomres(Double.parseDouble(txt_value_bedroom_res.getText()));
        
        selectedItem = cmb_state_res.getSelectedIndex();
        dts.setStateres((String) cmb_type_res.getItemAt(selectedItem));

        if (action.equals("save")){
            if (func.insert(dts)){
                JOptionPane.showMessageDialog(rootPane, "A Reserva foi registrada com sucesso!");
                showSearch("");
                componentDisable();
            }
        }
        else if(action.equals("edit")){
            dts.setIdres(Integer.parseInt(txt_id_res.getText()));
            dts.setIdemployee(Integer.parseInt(txt_id_employee.getText()));

            if (func.edit(dts)){
                JOptionPane.showMessageDialog(rootPane, "A Reserva foi editada com sucesso!");
                showSearch("");
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

    private void cmb_type_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_type_resActionPerformed
        cmb_type_res.transferFocus();
    }//GEN-LAST:event_cmb_type_resActionPerformed

    private void txt_value_bedroom_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_value_bedroom_resActionPerformed
        txt_value_bedroom_res.transferFocus();
    }//GEN-LAST:event_txt_value_bedroom_resActionPerformed

    private void txt_id_bedroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_bedroomActionPerformed
        txt_id_bedroom.transferFocus();
    }//GEN-LAST:event_txt_id_bedroomActionPerformed

    private void txt_number_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_number_brActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_number_brActionPerformed

    private void txt_id_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_clientActionPerformed

    private void txt_nom_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_clientActionPerformed

    private void txt_id_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_employeeActionPerformed

    private void txt_nom_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_employeeActionPerformed

    private void cmb_state_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_state_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_state_resActionPerformed

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
            java.util.logging.Logger.getLogger(frm_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_reservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_Lista;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_bedroom;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_client;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> cmb_state_res;
    private javax.swing.JComboBox<String> cmb_type_res;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdc_date_checkin_res;
    private com.toedter.calendar.JDateChooser jdc_date_exit_res;
    private com.toedter.calendar.JDateChooser jdc_date_res;
    private javax.swing.JPanel jpa_cadQuartos;
    private javax.swing.JPanel jpa_listaQuartos;
    private javax.swing.JLabel lbl_bedroom;
    private javax.swing.JLabel lbl_cadProd;
    private javax.swing.JLabel lbl_client;
    private javax.swing.JLabel lbl_date_checkin_res;
    private javax.swing.JLabel lbl_date_exit_res;
    private javax.swing.JLabel lbl_date_res;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_listaReservations;
    private javax.swing.JLabel lbl_pesquisar;
    private javax.swing.JLabel lbl_registros;
    private javax.swing.JLabel lbl_state_res;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_value_bedroom_res;
    private javax.swing.JTextField txt_id_bedroom;
    private javax.swing.JTextField txt_id_client;
    private javax.swing.JTextField txt_id_employee;
    private javax.swing.JTextField txt_id_res;
    private javax.swing.JTextField txt_nom_client;
    private javax.swing.JTextField txt_nom_employee;
    private javax.swing.JTextField txt_number_br;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_value_bedroom_res;
    // End of variables declaration//GEN-END:variables
}
