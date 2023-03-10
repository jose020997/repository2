package com.example.demo;

public class Usuario_jabg0014 {
	private String nombre;
    private String pass;
    
    // Constructor
    public Usuario_jabg0014(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    public Usuario_jabg0014() {
        this.nombre = "";
        this.pass = "";
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
}
