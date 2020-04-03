/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

/**
 * Maneja los datos del producto
 * @author JOHDLS
 */
public class Producto {
    
    // nombre del producto (ej.: Coca Normal, Coca Cherry, etc)
    private String nombre;
    
    // costo del producto, como todos vales $17.00 se coloca valor default
    private double costo = 17.0;
    
    // cantidad disponible dentro de la maquina expendedora
    private int disponible;
    
    /**
     * Constructor que crea una instancia con el nombre y disponible especificados
     * No recibe el costo por lo que este producto tendrá el costo default
     * @param nombre
     * @param disponible 
     */
    public Producto(String nombre, int disponible){
        this.nombre = nombre;
        this.disponible = disponible;
    }
    
    /**
     * Constructor sobrecagado que si recibe el costo del producto, por lo que
     * el valor default ya no será utilzado
     * @param nombre
     * @param disponible
     * @param costo 
     */
    public Producto(String nombre, int disponible, double costo){
        this.nombre = nombre;
        this.disponible = disponible;
        this.costo = costo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the disponible
     */
    public int getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
    
    public void descontar() {
        this.disponible --;
    }
    
}
