/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

/**
 *
 * @author lenovo
 */
public class Cart {
    int quantiti;
    boolean status;

    public int getQuantiti() {
        return quantiti;
    }

    public void setQuantiti(int quantiti) {
        this.quantiti = quantiti;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cart(int quantiti, boolean status) {
        this.quantiti = quantiti;
        this.status = status;
    }
}
