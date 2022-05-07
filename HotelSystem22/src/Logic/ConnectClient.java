/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vclients;
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
public class ConnectClient {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    private String sSql2="";
    public Integer recordTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID", "Nome", "Pai", "Mãe", "Tipo Doc", "Documento", "Endereço", "Telefone", "Email", 
            "Código" };
        String [ ] records = new String[10];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select p.id_peop, p.name_peop, p.father_peop, p.mother_peop, p.typeDocum_peop, "
                + "p.document_peop, p.adress_peop, p.phone_peop, p.email_peop, c.cod_cli"
                + " from tb_people p  inner join tb_client c on p.id_peop=c.id_peop  where document_peop like '%"
                +searching+"%' order by id_peop desc";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSql);
            while(rs.next()){
                records [0]=rs.getString("id_peop");
                records [1]=rs.getString("name_peop");
                records [2]=rs.getString("father_peop");
                records [3]=rs.getString("mother_peop");
                records [4]=rs.getString("typeDocum_peop");
                records [5]=rs.getString("document_peop");
                records [6]=rs.getString("adress_peop");
                records [7]=rs.getString("phone_peop");
                records [8]=rs.getString("email_peop");
                records [9]=rs.getString("cod_cli");
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vclients dts){
        sSql = "insert into tb_people  (name_peop,father_peop,mother_peop,typeDocum_peop,"
                + " document_peop,adress_peop,phone_peop,email_peop) values(?,?,?,?,?,?,?,?)";
        sSql2 = "insert into tb_client  (id_peop, cod_cli) values((select id_peop  from tb_people order by id_peop desc limit 1),?)";        
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            PreparedStatement pst2=cn.prepareStatement(sSql2);
            // Insert record  on fields
            pst.setString(1, dts.getName());
            pst.setString(2, dts.getFather());
            pst.setString(3, dts.getMother());
            pst.setString(4, dts.getTypeDocum());
            pst.setString(5, dts.getDocument());
            pst.setString(6, dts.getAdress());
            pst.setString(7, dts.getPhone());
            pst.setString(8, dts.getEmail());
            
           pst2.setString(1, dts.getCodClient());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                int n2=pst2.executeUpdate();
                if (n2!=0) {
                   return true;
                } 
                else {
                    return false;
                }
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }

    public boolean edit(Vclients dts){
        sSql = "update tb_employee  set name_peop=?, father_peop=?, mother_peop=?, typeDocum_peop=?, "
                + "document_peop=?, adress_peop=?, phone_peop=?, email_peop=?  where id_peop=?";
        sSql2 = "update tb_client  set cod_cli=? where id_peop=?";    
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);
            PreparedStatement pst2=cn.prepareStatement(sSql2);
            // update record  on fields

            pst.setString(1, dts.getName());
            pst.setString(2, dts.getFather());
            pst.setString(3, dts.getMother());
            pst.setString(4, dts.getTypeDocum());
            pst.setString(5, dts.getDocument());
            pst.setString(6, dts.getAdress());
            pst.setString(7, dts.getPhone());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getIdpeop());
            
            pst2.setInt(1, dts.getIdpeop());
            pst2.setString(2, dts.getCodClient());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                int n2=pst2.executeUpdate();
                if (n2!=0) {
                    return true;
                } 
                else {
                    return false;
                }
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }   
    
        public boolean delete(Vclients dts){
        sSql = "delete from tb_client  where id_peop=?";
        sSql2 = "delete from tb_employee  where id_peop=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSql);    
            PreparedStatement pst2=cn.prepareStatement(sSql2);
            pst.setInt(1, dts.getIdpeop());
            pst2.setInt(1, dts.getIdpeop());
            int n=pst.executeUpdate();
            if (n!=0) {
                int n2=pst2.executeUpdate();
                if (n2!=0) {
                    return true;
                } 
                else {
                    return false;
                }
            }else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }        
    }    
    
}
