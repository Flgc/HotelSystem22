/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Connections {
    public String db="dbreserves";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="fabio";
    public String pass="mysql2021";          
    
    public Connections() {        
    }
    
    public Connection connect(){
        Connection link=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error" + e);
        }
        return link;
    }
}    