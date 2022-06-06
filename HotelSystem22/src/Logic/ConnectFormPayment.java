/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vpayment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ConnectFormPayment {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    public Integer recordTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID PGTO", "ID Reservas", "Tipo Comprovante", "Num. Comprovante", "Taxa", 
            "Total Pagamento","DAta Emissão", "Data pagamento"};
        String [ ] records = new String[8];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select * from tb_payment where id_reservat="+searching+" order by id_pay";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_pay");
                records [1]=rs.getString("id_reservat");
                records [2]=rs.getString("type_pay");
                records [3]=rs.getString("number_pay");
                records [4]=rs.getString("rate_pay");
                records [5]=rs.getString("total_pay");
                records [6]=rs.getString("date_pay");
                records [7]=rs.getString("emission_pay");
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vpayment dts){
        sSql = "insert into tb_payment  (id_reservat,type_pay, number_pay, rate_pay, total_pay, date_pay, emission_pay)"
                + " values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // Insert record  on fields
            pst.setInt(1, dts.getIdreservat());
            pst.setString(2, dts.getTypepay());
            pst.setInt(3, dts.getNumberpay());
            pst.setDouble(4, dts.getRatepay());
            pst.setDouble(5, dts.getTotalpay());
            pst.setDate(6, dts.getDate_pay());
            pst.setDate(7, dts.getEmissionpay());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }

    public boolean edit(Vpayment dts){
        sSql = "update tb_payment  set id_reservat=?, type_pay=?, number_pay=?, rate_pay=?, total_pay=?,"+
                "date_pay=?,emission_pay=? where id_pay=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // update record  on fields
            pst.setInt(1, dts.getIdreservat());
            pst.setString(2, dts.getTypepay());
            pst.setInt(3, dts.getNumberpay());
            pst.setDouble(4, dts.getRatepay());
            pst.setDouble(5, dts.getTotalpay());
            pst.setDate(6, dts.getDate_pay());
            pst.setDate(7, dts.getEmissionpay());
            
            pst.setInt(8, dts.getIdpay());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }   
    
        public boolean delete(Vpayment dts){
        sSql = "delete from tb_payment  where id_pay=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);              
            pst.setInt(1, dts.getIdpay());
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }    
    
}