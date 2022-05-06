/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author fabio
 */
public class Vclients extends Vpeople{
        private String codClient;
        
        public Vclients(){
        }
        
        public Vclients(String codClient) {
            this.codClient = codClient;
        }

    public String getCodClient() {
        return codClient;
    }

    public void setCodClient(String codClient) {
        this.codClient = codClient;
    }
    
        
    
}
