/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vproducts;
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
public class ConnectFormProducts {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    public Integer recordTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID", "Produto", "Descrição", "Und", "Preço"};
        String [ ] records = new String[5];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select * from tb_product where name_prod like '%"+searching+"%' order by id_prod";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_prod");
                records [1]=rs.getString("name_prod");
                records [2]=rs.getString("descript_prod");
                records [3]=rs.getString("und_prod");
                records [4]=rs.getString("price_prod");
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vproducts dts){
        sSql = "insert into tb_product  (name_prod, descript_prod, und_prod, price_prod) values(?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // Insert record  on fields
            pst.setString(1, dts.getName());
            pst.setString(2, dts.getDescription());
            pst.setString(3, dts.getUnd());
            pst.setDouble(4, dts.getPriceProduct());
            
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

    public boolean edit(Vproducts dts){
        sSql = "update tb_product  set name_prod=?,  descript_prod=?,  und_prod=?,  price_prod=?, "
                + " where id_prod=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // update record  on fields
            pst.setString(1, dts.getName());
            pst.setString(2, dts.getDescription());
            pst.setString(3, dts.getUnd());
            pst.setDouble(4, dts.getPriceProduct());
            pst.setInt(5, dts.getIdproduct());
            
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
    
        public boolean delete(Vproducts dts){
        sSql = "delete from tb_product  where id_prod=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);              
            pst.setInt(1, dts.getIdproduct());
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
