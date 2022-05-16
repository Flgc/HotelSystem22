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
public class Vemployee extends Vpeople {
    
  Double salary;
  String acess;
  String login;
  String password;
  String state;

    public Vemployee() {
    }

    public Vemployee(Double salary, String acess, String login, String password, String state) {
        this.salary = salary;
        this.acess = acess;
        this.login = login;
        this.password = password;
        this.state = state;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAcess() {
        return acess;
    }

    public void setAcess(String acess) {
        this.acess = acess;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }  
}