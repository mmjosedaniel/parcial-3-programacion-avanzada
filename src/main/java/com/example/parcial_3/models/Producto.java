package com.example.parcial_3.models;

/**
 * Productop que se usará en la aplicación
 * Por motivos de restricciones no se hace posible instalar lombok
 * por esta razón se hace necesario crear los getters y los setters
 * manualmente
 * */
public class Producto {
    private String id;
    private String nombre;
    private double precio;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con todos los atributos
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString() para imprimir el objeto como texto
    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
