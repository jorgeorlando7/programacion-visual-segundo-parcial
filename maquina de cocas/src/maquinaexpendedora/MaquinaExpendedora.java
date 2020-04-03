/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinaexpendedora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Maneja la logica de operación de la máquina expendedora
 * @author JOHDLS
 */
public class MaquinaExpendedora {
    
    private final Dinero billete500;
    private final Dinero billete200;
    private final Dinero billete100;
    private final Dinero billete50;
    private final Dinero billete20;
    
    private final Dinero moneda10;
    private final Dinero moneda5;
    private final Dinero moneda2;
    private final Dinero moneda1;
    
    public final Producto cocaNormal;
    public final Producto cocaLight;
    public final Producto cocaSinAzucar;
    public final Producto cocaZero;
    public final Producto cocaCafe;
    public final Producto cocaCherry;
    public final Producto cocaEnergy;
    public final Producto cocaNaranja;
    
    // indica si se ha introducido efectivo a la máquina expendedora o no
    private boolean hayEfectivoIntroducido = false;
    
    // cantidad de efectivo introducido
    private double efectivoIntroducido = 0.0;

    /**
     *  Constructor de la clase MaquinaExpendedora
     *  Se crean las instancias de Dinero con los valores indicados por el 
     *  problema, es decir, monedas de 1,2,5,10 y billetes de 20,50,100,200,500
     *  para cada uno se especifica su tipo, el valor que representa, el disponible
     *  (cantidad generada aleatoriamente entre 1 y el máximo).
     *  Tambien se crean las instancias de Producto, todas con el costo default,
     *  la cantidad de cada producto se establece de manera aleatoria entre 1 y 10
     */
    public MaquinaExpendedora(){
        
        //
        // Creacion del dinero
        //
        
        billete500 = new Dinero("Billete", 500);
        int maximoDefault = billete500.getMaximo();
        int diponible500 = (int) (Math.random() * maximoDefault + 1); //valor aleatrio entre 1 y maximoDefault (inclusivo)
        billete500.setDisponible(diponible500);
        
        // asumimos que el resto del dinero a crear tendrá el valor default para 
        // su cantidad máxima dentoro de la maquina expendedora
        
        billete200 = new Dinero("Billete", 200, (int) (Math.random() * maximoDefault + 1));
        billete100 = new Dinero("Billete", 100, (int) (Math.random() * maximoDefault + 1));
        billete50 = new Dinero("Billete", 50, (int) (Math.random() * maximoDefault + 1));
        billete20 = new Dinero("Billete", 20, (int) (Math.random() * maximoDefault + 1));
        
        moneda10 = new Dinero("Moneda", 10, (int) (Math.random() * maximoDefault + 1));
        moneda5 = new Dinero("Moneda", 5, (int) (Math.random() * maximoDefault + 1));
        moneda2 = new Dinero("Moneda", 2, (int) (Math.random() * maximoDefault + 1));
        
        // por se $1 el m{inimo posible, se considera que la máquina expendedora 
        // tienen una cantidad mayor de estas monedas
        int maximoMoneda1 = 35;
        moneda1 = new Dinero("Moneda", 1, (int) (Math.random() * maximoMoneda1 + 1), maximoMoneda1);
        
        
        
        //
        // Creacion de los productos
        //
        
        int maximoPorProducto = 10;
        
        cocaNormal = new Producto("Coca Normal", (int) (Math.random() * maximoPorProducto + 1));
        cocaLight = new Producto("Coca Light", (int) (Math.random() * maximoPorProducto + 1));
        cocaSinAzucar = new Producto("Coca Sin Azucar", (int) (Math.random() * maximoPorProducto + 1));
        cocaZero = new Producto("Coca Zero", (int) (Math.random() * maximoPorProducto + 1));
        cocaCafe = new Producto("Coca Cafe", (int) (Math.random() * maximoPorProducto + 1));
        cocaCherry = new Producto("Coca Cherry", (int) (Math.random() * maximoPorProducto + 1));
        cocaEnergy = new Producto("Coca Energy", (int) (Math.random() * maximoPorProducto + 1));
        cocaNaranja = new Producto("Coca Naranja", (int) (Math.random() * maximoPorProducto + 1));
        
    }
    
    /**
     * Cuando presionan un producto
     * Se valida si ya hay efectivo introducido o no
     * De ser asi valida si es sifieinte para la compra
     * Sino hay efectivo introducido entonces se muestra el costo del producto
     * @param nombreProducto
     * @return 
     */
    public String productoPresionado(String nombreProducto){
        
        //revisar que producto eligieron
        Producto productoElegido = null;
        switch(nombreProducto){
            case "Coca Normal":
                productoElegido = cocaNormal;
                break;
            case "Coca Light":
                productoElegido = cocaLight;
                break;
            case "Coca Sin Azucar":
                productoElegido = cocaSinAzucar;
                break;
            case "Coca Zero":
                productoElegido = cocaZero;
                break;
            case "Coca Cafe":
                productoElegido = cocaCafe;
                break;
            case "Coca Cherry":
                productoElegido = cocaCherry;
                break;
            case "Coca Energy":
                productoElegido = cocaEnergy;
                break;
            case "Coca Naranja":
                productoElegido = cocaNaranja;
                break;
        }
        
        if(hayEfectivoIntroducido) {
            //como ya se ha introducido eefectiv, entonces validar si para el 
            //producto seleccionado ya alcanza dicho efectivo para realizar la 
            //compra o no, de no alcanzar indicarlo en un mensaje
            if(productoElegido.getDisponible() == 0){
                return "No hay ese producto";
            }
            
            if(efectivoIntroducido >= productoElegido.getCosto()) {
                //se efectua la compra
                return efectuarCompra(productoElegido);
            } else {
                //se indica que hace falta dinero para realizar la compra
                return "Le falta $" + (productoElegido.getCosto() - efectivoIntroducido);
            }
        } else {
            //no hay efectivo introducido, entonces mostrar el monto del producto
            NumberFormat formatter = new DecimalFormat("#0.00"); 
            return "Costo: $" + formatter.format(productoElegido.getCosto());
        }
    }
    
    /**
     * Logica para efectual la compra
     * @param productoElegido
     * @return 
     */
    private String efectuarCompra(Producto productoElegido){
        
        double cambio = efectivoIntroducido - productoElegido.getCosto();
        hayEfectivoIntroducido = false;
        
        if(actualizarInventario(cambio)){
            // todo marchó bien, se da el cambio al cliente
            efectivoIntroducido = 0.0;
            productoElegido.descontar();
            NumberFormat formatter = new DecimalFormat("#0.00"); 
            return "Su cambio es: $ " + formatter.format(cambio);
        } else {
            // hubo algún error, se le devuelve todo su dinero al usuario
            return "Error, recoja su dinero ($ " + getEfectivoIntroducido() + ")";
        }
    }
    
    /**
     * Actualiza el inventario de todos los Dineros de acuerdo a lo que se tuvo que dar de cambio
     * @param cambio
     * @return 
     */
    private boolean actualizarInventario(double cambio){
        
        // actualizar disponible con la cantidad introducida por cada dinero
        billete500.actualizarDisponibleConCantidadIntroducida();
        billete200.actualizarDisponibleConCantidadIntroducida();
        billete100.actualizarDisponibleConCantidadIntroducida();
        billete50.actualizarDisponibleConCantidadIntroducida();
        billete20.actualizarDisponibleConCantidadIntroducida();
        moneda10.actualizarDisponibleConCantidadIntroducida();
        moneda5.actualizarDisponibleConCantidadIntroducida();
        moneda2.actualizarDisponibleConCantidadIntroducida();
        moneda1.actualizarDisponibleConCantidadIntroducida();
        
        // restar lo necesario para dar el cambio
        cambio = actualizarConCambio(cambio, billete500);
        cambio = actualizarConCambio(cambio, billete200);
        cambio = actualizarConCambio(cambio, billete100);
        cambio = actualizarConCambio(cambio, billete50);
        cambio = actualizarConCambio(cambio, billete20);
        cambio = actualizarConCambio(cambio, moneda10);
        cambio = actualizarConCambio(cambio, moneda5);
        cambio = actualizarConCambio(cambio, moneda2);
        cambio = actualizarConCambio(cambio, moneda1);
      
        // al final debe quedar el cambio en cero, lo que indica que se ha dado todo el cambio
        return cambio == 0.0;
    }
    
    /**
     * Actualiza el Dinero especificado de acuerdo a lo que se puede dar de cambio
     * @param cambio
     * @param dinero
     * @return 
     */
    private double actualizarConCambio(double cambio, Dinero dinero){
        
        //cuantas veces cabe la denominacion de este Dinero en la cantidad de cambio
        int cabeEnDinero = (int) (cambio / dinero.getValor());
        
        // si cabe al menos una vez
        if (cabeEnDinero > 0){
            //se resta al disponible la cantidad calculada (cabeEnDinero)
            double sobrante = dinero.restarDisponible(cabeEnDinero);
            //se actualiza el cambio en el caso de que no hubiera sufieiente 
            // disponible de este Dinero, para dar el cambio con otras monedas
            cambio = cambio + (sobrante - cabeEnDinero * dinero.getValor());
        }
        
        //se regresa el cambio actualizado (lo que aun falta por regresarle al cliente
        return cambio;
    }
    
    public String dineroPresionado(String valor){
        
        Dinero dineroIntroducido = null;
        switch(valor){
            case "500":
                dineroIntroducido = billete500;
                break;
            case "200":
                dineroIntroducido = billete200;
                break;
            case "100":
                dineroIntroducido = billete100;
                break;
            case "50":
                dineroIntroducido = billete50;
                break;
            case "20":
                dineroIntroducido = billete20;
                break;
            case "10":
                dineroIntroducido = moneda10;
                break;
            case "5":
                dineroIntroducido = moneda5;
                break;
            case "2":
                dineroIntroducido = moneda2;
                break;
            case "1":
                dineroIntroducido = moneda1;
                break;
                
        }
        
        if(dineroIntroducido.agregarCantidadIntroducida(1)){
            setEfectivoIntroducido(efectivoIntroducido + dineroIntroducido.getValor());
            hayEfectivoIntroducido = true;
            return "";
        } else {
            return "No se puede aceptar";
        }

    }
    
    public String getInventario(){
        return "Billete 500:     "   + (billete500.getDisponible() + billete500.getCantidadIntroducida()) + "\n" +
               "Billete 200:     "   + (billete200.getDisponible() + billete200.getCantidadIntroducida()) + "\n" +
               "Billete 100:     "   + (billete100.getDisponible() + billete100.getCantidadIntroducida()) + "\n" +
               "Billete 50:       "  + (billete50.getDisponible()  + billete50.getCantidadIntroducida()) + "\n" +
               "Billete 20:       "  + (billete20.getDisponible()  + billete20.getCantidadIntroducida()) + "\n" +
               "Moneda 10:    "      + (moneda10.getDisponible()   + moneda10.getCantidadIntroducida()) + "\n" +
               "Moneda 5:      "     + (moneda5.getDisponible()    + moneda5.getCantidadIntroducida()) + "\n" +
               "Moneda 2:      "     + (moneda2.getDisponible()    + moneda2.getCantidadIntroducida()) + "\n" +
               "Moneda 1:      "     + (moneda1.getDisponible()    + moneda1.getCantidadIntroducida()) + "\n";
    }

    /**
     * @return the efectivoIntroducido
     */
    public String getEfectivoIntroducido() {
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        return formatter.format(efectivoIntroducido);
    }

    /**
     * @param efectivoIntroducido the efectivoIntroducido to set
     */
    public void setEfectivoIntroducido(double efectivoIntroducido) {
        this.efectivoIntroducido = efectivoIntroducido;
    }
    
    public void cancelar(){
        billete500.setCantidadIntroducida(0);
        billete200.setCantidadIntroducida(0);
        billete100.setCantidadIntroducida(0);
        billete50.setCantidadIntroducida(0);
        billete20.setCantidadIntroducida(0);
        moneda10.setCantidadIntroducida(0);
        moneda5.setCantidadIntroducida(0);
        moneda2.setCantidadIntroducida(0);
        moneda1.setCantidadIntroducida(0);
        hayEfectivoIntroducido = false;
        efectivoIntroducido = 0.0;
    }
}
