/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Vemployee;
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
public class ConnectEmployee {
    
    private Connections mysql=new Connections();
    private Connection cn=mysql.connect();
    private String sSql="";
    private String sSql2="";
    public Integer recordTotal;
    
    public DefaultTableModel showSearch(String searching){
        
        DefaultTableModel model;
        String [ ] titles = {"ID", "Nome", "Pai", "Mãe", "Tipo Doc", "Documento", "Endereço", "Telefone", "Email", 
            "Salário", "Acesso", "Login", "Senha", "Estado"};
        String [ ] records = new String[14];
        recordTotal = 0;
        
        model = new DefaultTableModel(null, titles);
        
        sSql = "select p.id_peop,p.name_peop,p.father_peop,p.mother_peop,p.typeDocum_peop,"
                + "p.document_peop,p.adress_peop,p.phone_peop,p.email_peop,e.salary_empl,e.acess_empl,"
                + "e.login_empl,e.password_empl,e.state_empl from tb_people p  inner join tb_employee e on "
                + "p.id_peop=e.id_peop  where document_peop like '%"
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
                records [9]=rs.getString("salary_empl");
                records [10]=rs.getString("acess_empl");
                records [11]=rs.getString("login_empl");
                records [12]=rs.getString("password_empl");
                records [13]=rs.getString("state_empl");
                
                recordTotal = recordTotal + 1;
                model.addRow(records);
            }       
            return model;
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }  
    
    public boolean insert(Vemployee dts){
        sSql = "insert into tb_people  (name_peop,father_peop,mother_peop,typeDocum_peop,"
                + " document_peop,adress_peop,phone_peop,email_peop) values(?,?,?,?,?,?,?,?)";
        sSql2 = "insert into tb_employee  (id_peop, salary_empl, acess_empl, login_empl, password_empl, "
                + "state_empl) values((select id_peop  from tb_people order by id_peop desc limit 1),?,?,?,?,?,?)";        
        
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
            
            pst2.setDouble(1, dts.getSalary());
            pst2.setString(2, dts.getAcess());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getState());           
            
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

    public boolean edit(Vemployee dts){
        sSql = "update tb_employee  set name_peop=?, father_peop=?, mother_peop=?, typeDocum_peop=?, "
                + "document_peop=?, adress_peop=?, phone_peop=?, email_peop=?  where id_peop=?";
        sSql2 = "update tb_employee  set salary_empl=?, acess_empl=?, login_empl=?, password_empl=?, "
                + "state_empl=? where id_peop=?";           
                
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
                      
            pst2.setDouble(1, dts.getSalary());
            pst2.setString(2, dts.getAcess());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getState());   
            pst2.setInt(6, dts.getIdpeop());
            
            
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
    
    public boolean delete(Vemployee dts){
        sSql = "delete from tb_employee  where id_peop=?";
        sSql2 = "delete from tb_people  where id_peop=?";
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