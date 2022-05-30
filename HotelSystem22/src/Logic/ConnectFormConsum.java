/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vconsum;
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
public class ConnectFormConsum {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    public Integer recordTotal;
    public Double comsumTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID Consumo","ID Reserva", "ID Produto","Produto", "Quantidade","Preço Venda","Estado"};      
        String [ ] records = new String[7];
        recordTotal = 0;
        comsumTotal = 0.0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select c.id_con,c.id_reservat,c.id_product,p.name_prod,c.quantity_con,c.price_con"
                + "c.state_res from tb_consum c inner join  tb_product p on c.id_product=p.id_prod"
                + " where c.id_reservat ="+searching+" order by c.id_con desc";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_con");
                records [1]=rs.getString("id_reservat");
                records [2]=rs.getString("id_product");
                records [3]=rs.getString("quantity_con");
                records [4]=rs.getString("price_con");
                records [5]=rs.getString("state_res");
                
                recordTotal = recordTotal + 1;
                comsumTotal = comsumTotal + (rs.getDouble("quantity_con")*rs.getDouble("price_con"));
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vconsum dts){
        sSql = "insert into tb_consum( id_reservat, id_product, quantity_con, price_con, state_res) values (?,?,?,?,?)";

        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // Insert record  on fields
            pst.setInt(1, dts.getIdreservat());
            pst.setInt(2, dts.getIdproduct());
            pst.setDouble(3, dts.getQuantitycon());    
            pst.setDouble(4, dts.getPricecon());
            pst.setString(5, dts.getStateres());
            
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

    public boolean edit(Vconsum dts){
                 sSql = "update tb_consum set id_reservat=?, id_product=?, quantity_con=?, price_con=?, "
                         + "state_res=?  where id_con=?";

        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            // update record  on fields
            pst.setInt(1, dts.getIdreservat());
            pst.setInt(2, dts.getIdproduct());
            pst.setDouble(3, dts.getQuantitycon());    
            pst.setDouble(4, dts.getPricecon());
            pst.setString(5, dts.getStateres());
            
            pst.setInt(6, dts.getIdcon());           
            
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
    
        public boolean delete(Vconsum dts){
        sSql = "delete from tb_consum  where id_con=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);              
            pst.setInt(1, dts.getIdcon());
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