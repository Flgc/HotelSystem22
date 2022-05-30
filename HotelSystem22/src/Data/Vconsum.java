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
public class Vconsum {
    
      private int idcon;
      private int idreservat;
      private int idproduct;
      private double quantitycon;
      private double pricecon;
      private String stateres;

    public Vconsum() {
    }

    public Vconsum(int idcon, int idreservat, int idproduct, double quantitycon, double pricecon, String stateres) {
        this.idcon = idcon;
        this.idreservat = idreservat;
        this.idproduct = idproduct;
        this.quantitycon = quantitycon;
        this.pricecon = pricecon;
        this.stateres = stateres;
    }

    public int getIdcon() {
        return idcon;
    }

    public void setIdcon(int idcon) {
        this.idcon = idcon;
    }

    public int getIdreservat() {
        return idreservat;
    }

    public void setIdreservat(int idreservat) {
        this.idreservat = idreservat;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public double getQuantitycon() {
        return quantitycon;
    }

    public void setQuantitycon(double quantitycon) {
        this.quantitycon = quantitycon;
    }

    public double getPricecon() {
        return pricecon;
    }

    public void setPricecon(double pricecon) {
        this.pricecon = pricecon;
    }

    public String getStateres() {
        return stateres;
    }

    public void setStateres(String stateres) {
        this.stateres = stateres;
    }     
}
