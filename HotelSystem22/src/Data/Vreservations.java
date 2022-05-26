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
public class Vreservations {
    private int idres;
    private int idbedroom;
    private int idclient;
    private int idemployee;
    private String typeres;
    private Date dateres;
    private Date datecheckinres;
    private Date dateexitres;
    private Double valuebedroomres;
    private String stateres;

    public Vreservations() {
    }

    public Vreservations(int idres, int idbedroom, int idclient, int idemployee, String typeres, Date dateres, Date datecheckinres, Date dateexires, Double valuebedroomres, String stateres) {
        this.idres = idres;
        this.idbedroom = idbedroom;
        this.idclient = idclient;
        this.idemployee = idemployee;
        this.typeres = typeres;
        this.dateres = dateres;
        this.datecheckinres = datecheckinres;
        this.dateexitres = dateexires;
        this.valuebedroomres = valuebedroomres;
        this.stateres = stateres;
    }
    
    public int getIdres() {
        return idres;
    }

    public void setIdres(int idres) {
        this.idres = idres;
    }

    public int getIdbedroom() {
        return idbedroom;
    }

    public void setIdbedroom(int idbedroom) {
        this.idbedroom = idbedroom;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public int getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(int idemployee) {
        this.idemployee = idemployee;
    }

    public String getTyperes() {
        return typeres;
    }

    public void setTyperes(String typeres) {
        this.typeres = typeres;
    }

    public Date getDateres() {
        return dateres;
    }

    public void setDateres(Date dateres) {
        this.dateres = dateres;
    }

    public Date getDatecheckinres() {
        return datecheckinres;
    }

    public void setDatecheckinres(Date datecheckinres) {
        this.datecheckinres = datecheckinres;
    }

    public Date getDateexitres() {
        return dateexitres;
    }

    public void setDateexitres(Date dateexires) {
        this.dateexitres = dateexires;
    }

    public Double getValuebedroomres() {
        return valuebedroomres;
    }

    public void setValuebedroomres(Double valuebedroomres) {
        this.valuebedroomres = valuebedroomres;
    }

    public String getStateres() {
        return stateres;
    }

    public void setStateres(String stateres) {
        this.stateres = stateres;
    }
}
