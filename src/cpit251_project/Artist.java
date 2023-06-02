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
public class Artist {
    String name;

    public String getId() {
        return name;
    }

    public void setId(String name) {
        this.name = name;
    }

    public Artist(String name) {
        this.name = name;
    }
}
