/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vreservations;
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
public class ConnectFormReservations {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    public Integer recordTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID Reserva", "ID Quartos", "Número","ID Clientes", "Nome Cliente","ID Funcionários", 
            "Funcionário","Tipo Reserva", "Data Reserva",  "Data Checkin", "Data Saída", "Valor Quarto", "Estado"};      
        
        String [ ] records = new String[13];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select r.id_res,r.id_bedroom,b.number_br,r.id_client,"
                + "(select name_peop from tb_people where id_peop=r.id_client) as clienten,"
                + "r.id_employee,(select name_peop from tb_people where id_peop=r.id_employee) as emploeeen,"
                + "r.type_res, date_res,date_checkin_res,date_exit_res,"
                + "r.value_bedroom_res,r.state_res from tb_reservations r inner join  tb_bedroom b on "
                + "r.id_bedroom=b.id_br  where r.date_res like '%"+searching+"%' order by id_res desc";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_res");
                records [1]=rs.getString("id_bedroom");
                records [2]=rs.getString("number_br");
                records [3]=rs.getString("id_client");
                records [4]=rs.getString("clienten");
                records [5]=rs.getString("id_employee");
                records [6]=rs.getString("emploeeen");
                records [7]=rs.getString("type_res");
                records [8]=rs.getString("date_res");
                records [9]=rs.getString("date_checkin_res");
                records [10]=rs.getString("date_exit_res");
                records [11]=rs.getString("value_bedroom_res");              
                records [12]=rs.getString("state_res");
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vreservations dts){
        sSql = "insert into tb_reservations( id_res, id_bedroom, id_client, id_employee, type_res, date_res,"
                + " date_checkin_res, date_exit_res, value_bedroom_res, state_res) values (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // Insert record  on fields
            pst.setInt(1, dts.getIdbedroom());
            pst.setInt(2, dts.getIdclient());
            pst.setInt(3, dts.getIdemployee());    
            pst.setString(4, dts.getTyperes());
            pst.setDate(5, dts.getDateres());
            pst.setDate(6, dts.getDatecheckinres());
            pst.setDate(7, dts.getDateexitres());
            pst.setDouble(8, dts.getValuebedroomres());
            pst.setString(9, dts.getStateres());
            
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

    public boolean edit(Vreservations dts){
         sSql = "update tb_reservations set id_bedroom=?, id_client=?, id_employee=?, type_res=?, date_res=?,"
                + " date_checkin_res=?, date_exit_res=?, value_bedroom_res=?, state_res=? where id_res=?";

        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // update record  on fields
            pst.setInt(1, dts.getIdbedroom());
            pst.setInt(2, dts.getIdclient());
            pst.setInt(3, dts.getIdemployee());    
            pst.setString(4, dts.getTyperes());
            pst.setDate(5, dts.getDateres());
            pst.setDate(6, dts.getDatecheckinres());
            pst.setDate(7, dts.getDateexitres());
            pst.setDouble(8, dts.getValuebedroomres());
            pst.setString(9, dts.getStateres());
            
            pst.setInt(10, dts.getIdres());           
            
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
    
        public boolean delete(Vreservations dts){
        sSql = "delete from tb_reservations  where id_res=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);              
            pst.setInt(1, dts.getIdres());
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