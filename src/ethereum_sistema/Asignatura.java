/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ethereum_sistema;
/**
 *
 * @author Lourdes
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private double costo;
    private double descuento;

    public Asignatura() {
    }
    
    

    public Asignatura(String codigo, String nombre, double costo, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getCostoConDescuento() {
        return costo - (costo * descuento);
    }
     // Implementación del método toString()
    @Override
    public String toString() {
        return codigo + " - " + nombre;
    }
}

