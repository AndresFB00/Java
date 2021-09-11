/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ADMIN
 */
public class Bodega extends Empleado {

    public String ubicacion;

    public Bodega(String antiguedadC, String edadC, String dniC, String nombreC, String ubicacionC) {
        super(antiguedadC, edadC, dniC, nombreC);
        this.ubicacion = ubicacionC;
    }

    @Override
    public String toString() {

        String textoEmpleado = "";
        textoEmpleado += "-nombre:" + this.nombre;
        textoEmpleado += "-dni:" + this.dni;
        textoEmpleado += "-ubicación:" + this.ubicacion;
        textoEmpleado += "-antiguedad:" + this.antiguedad;
        textoEmpleado += "-edad:" + this.edad;

        return textoEmpleado;

    }
}
