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
public class Vproducts {
    
     private int idproduct;
     private String name;
     private String description;
     private String und;
     private Double priceProduct;

    public Vproducts() {
    }

    public Vproducts(int idproduct, String name, String description, String und, Double priceProduct) {
        this.idproduct = idproduct;
        this.name = name;
        this.description = description;
        this.und = und;
        this.priceProduct = priceProduct;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }
    
}
