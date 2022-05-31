/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Date;

/**
 *
 * @author fabio
 */
public class Vpayment {
    
      private int idpay;
      private int idreservat;
      private String typepay;
      private int numberpay;
      private Double ratepay;
      private Double totalpay;
      private Date date_pay;
      private Date emissionpay;

    public Vpayment() {
    }

    public Vpayment(int idpay, int idreservat, String typepay, int numberpay, Double ratepay, Double totalpay, Date date_pay, Date emissionpay) {
        this.idpay = idpay;
        this.idreservat = idreservat;
        this.typepay = typepay;
        this.numberpay = numberpay;
        this.ratepay = ratepay;
        this.totalpay = totalpay;
        this.date_pay = date_pay;
        this.emissionpay = emissionpay;
    }

    public int getIdpay() {
        return idpay;
    }

    public void setIdpay(int idpay) {
        this.idpay = idpay;
    }

    public int getIdreservat() {
        return idreservat;
    }

    public void setIdreservat(int idreservat) {
        this.idreservat = idreservat;
    }

    public String getTypepay() {
        return typepay;
    }

    public void setTypepay(String typepay) {
        this.typepay = typepay;
    }

    public int getNumberpay() {
        return numberpay;
    }

    public void setNumberpay(int numberpay) {
        this.numberpay = numberpay;
    }

    public Double getRatepay() {
        return ratepay;
    }

    public void setRatepay(Double ratepay) {
        this.ratepay = ratepay;
    }

    public Double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(Double totalpay) {
        this.totalpay = totalpay;
    }

    public Date getDate_pay() {
        return date_pay;
    }

    public void setDate_pay(Date date_pay) {
        this.date_pay = date_pay;
    }

    public Date getEmissionpay() {
        return emissionpay;
    }

    public void setEmissionpay(Date emissionpay) {
        this.emissionpay = emissionpay;
    } 
}
