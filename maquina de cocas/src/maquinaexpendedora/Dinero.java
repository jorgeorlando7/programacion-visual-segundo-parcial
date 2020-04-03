/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

/**
 * Maneja los datos del dinero
 * @author JOHDLS
 */
public class Dinero {
    
    // tipo del tinero: billete o moneda
    private String tipo;
    
    // valor monetario del dinero (1,2,5,10,20,50,100,200,500)
    private double valor;
    
    // cantidad de billetes (o monedas) que hay dentro de la maquina expendedora
    // por defecto se asume que no hay ese dinero dentro de la maquina expedidora
    private int disponible = 0;
    
    // cantidad maxima que puede haber en la maquina expendedora
    // se presupone un valor por defecto de 20
    private int maximo = 20;
    
    // cantidad de este dinero introducida en máquina por el susuario actual
    // en el estado inicial del programa esta cantidad es cero
    private int cantidadIntroducida = 0;
    
    /**
     * Constructor que recibe los valores iniciales para el Dinero que se esté creando
     * No incluye el máximo, por lo que tendrá el default
     * @param tipo
     * @param valor
     * @param disponible 
     */
    public Dinero(String tipo, double valor, int disponible){
        this.tipo = tipo;
        this.valor = valor;
        this.disponible = disponible;
    }
    
    /**
     * Segundo constructor (sobrecargado)
     * Este constructor permite indicar el maximo, de tal modo que ya no se usará el default
     * @param tipo
     * @param valor
     * @param disponible
     * @param maximo 
     */
    public Dinero(String tipo, double valor, int disponible, int maximo){
        this.tipo = tipo;
        this.valor = valor;
        this.disponible = disponible;
        this.maximo = maximo;
    }
    
    /**
     * Otra sobrecarga del constructor
     * Recibe el tipo de dinero y su valor
     * Deja el disponible y el maximo con sus valores por default
     * @param tipo
     * @param valor 
     */
    public Dinero(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
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

    /**
     * @return the maximo
     */
    public int getMaximo() {
        return maximo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    /**
     * @return the cantidadIntroducida
     */
    public int getCantidadIntroducida() {
        return cantidadIntroducida;
    }

    /**
     * 
     * @param cantidadIntroducida the cantidadIntroducida to set
     */
    public void setCantidadIntroducida(int cantidadIntroducida) {
        this.cantidadIntroducida = cantidadIntroducida;
    }
       
    /**
     * @param cantidadIntroducida the cantidadIntroducida to add
     * @return true si la cantidad introducida no va a sobrepasar el maximo (sumado a lo disponible)
     *         false en otro caso
     */
    public boolean agregarCantidadIntroducida(int cantidadIntroducida) {
        if (this.disponible + cantidadIntroducida <= this.maximo) {
            this.cantidadIntroducida += cantidadIntroducida;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Actualiza la cantidad disponible sumandole la cantidad introducida
     */
    public void actualizarDisponibleConCantidadIntroducida(){
        this.disponible += this.cantidadIntroducida;
        this.cantidadIntroducida = 0;
    }
    
    /**
     * Resta la cantidad indicada del disponible, de no alcanzar, deja el 
     * disponible en cero y regresa la cantidad que no pudo tomar de este Dinero
     * @param cantidad
     * @return 
     */
    public double restarDisponible(int cantidad){
        if(this.disponible - cantidad < 0){
            this.disponible = 0;
            return (cantidad - this.disponible)*this.valor;
        } else {
            this.disponible -= cantidad;
            return 0.0;
        }
    }
}
