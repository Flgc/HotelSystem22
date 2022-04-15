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
public class Vbedrooms {
    
    private int idBedrooms;
    private String number;
    private String floor;
    private String description;
    private String characteristics;
    private Double valueDaily;
    private String state;
    private String typeBedroom;      
    
    public Vbedrooms() {
    }      

    public Vbedrooms(int idBedrooms, String number, String floor, String description, String characteristics, Double valueDaily, String state, String typeBedroom) {
        this.idBedrooms = idBedrooms;
        this.number = number;
        this.floor = floor;
        this.description = description;
        this.characteristics = characteristics;
        this.valueDaily = valueDaily;
        this.state = state;
        this.typeBedroom = typeBedroom;
    }   

    public int getIdBedrooms() {
        return idBedrooms;
    }

    public void setIdBedrooms(int idBedrooms) {
        this.idBedrooms = idBedrooms;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Double getValueDaily() {
        return valueDaily;
    }

    public void setValueDaily(Double valueDaily) {
        this.valueDaily = valueDaily;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTypeBedroom() {
        return typeBedroom;
    }

    public void setTypeBedroom(String typeBedroom) {
        this.typeBedroom = typeBedroom;
    }      
        
}