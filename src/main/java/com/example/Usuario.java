package com.example;

import java.time.LocalDate;

/**
 * @author Alejandro Duarte.
 */
public class Usuario {

    private String nombre;

    private String email;

    private String direccion;

    private LocalDate fechaNacimiento;

    public Usuario(String nombre, String email, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
