/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
