/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vbedrooms;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabio
 */
public class ConnectFormBedrooms {    
    private Connect mysql=new Connect();
    private Connection cn=mysql.connection();
    private String sSql="";
    public Integer recordTotal;
    
    public DefaultTableModel show(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID", "Number", "Floor", "Description", "Characteristics", "Price", "State","TypeBedroom"};
        String [ ] records = new String[8];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select * from tb_bedroom where floor_br like '%"+searching+"%' order by id_br";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_br");
                records [1]=rs.getString("number_br");
                records [2]=rs.getString("floor_br");
                records [3]=rs.getString("description_br");
                records [4]=rs.getString("characteristics_br");
                records [5]=rs.getString("dialy_Price_br");
                records [6]=rs.getString("state_br");
                records [7]=rs.getString("type_br");   
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vbedrooms dts){
        sSql = "insert into tb_bedroom  (number_br, floor_br, description_br, characteristics_br, dialy_Price_br, state_br, " + 
               "type_br) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // Insert record  on fields
            pst.setString(1, dts.getNumber());
            pst.setString(2, dts.getFloor());
            pst.setString(3, dts.getDescription());
            pst.setString(4, dts.getCharacteristics());
            pst.setDouble(5, dts.getValueDaily());
            pst.setString(6, dts.getState());
            pst.setString(7, dts.getTypeBedroom());
            
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

    public boolean edit(Vbedrooms dts){
        sSql = "update into tb_bedroom  set number_br=?,  floor_br= , description_br=?, characteristics_br=?,"
                + "dialy_Price_br=?, state_br=?, type_br=? where id_br=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // update record  on fields
            pst.setString(1, dts.getNumber());
            pst.setString(2, dts.getFloor());
            pst.setString(3, dts.getDescription());
            pst.setString(4, dts.getCharacteristics());
            pst.setDouble(5, dts.getValueDaily());
            pst.setString(6, dts.getState());
            pst.setString(7, dts.getTypeBedroom());
            pst.setInt(8, dts.getIdBedrooms());
            
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
    
        public boolean delete(Vbedrooms dts){
        sSql = "delete into tb_bedroom  where id_br=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);              
            pst.setInt(1, dts.getIdBedrooms());
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
