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
public class Vpeople {
    private int idpeop;
    private String name;
    private String father;
    private String mother;
    private String typeDocum;
    private String document;
    private String adress;
    private String phone;
    private String email;
    
    public Vpeople(){
    }

    public Vpeople(int idpeop, String name, String father, String mother, String typeDocum, String document, String adress, String phone, String email) {
        this.idpeop = idpeop;
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.typeDocum = typeDocum;
        this.document = document;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }

    public int getIdpeop() {
        return idpeop;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }

    public String getTypeDocum() {
        return typeDocum;
    }

    public String getDocument() {
        return document;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setIdpeop(int idpeop) {
        this.idpeop = idpeop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setTypeDocum(String typeDocum) {
        this.typeDocum = typeDocum;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
