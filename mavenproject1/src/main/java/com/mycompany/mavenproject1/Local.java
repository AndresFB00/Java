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
public class Local extends Empleado {

    public String cargo;

    public Local(String antiguedadC, String edadC, String dniC, String nombreC, String cargoC) {
        super(antiguedadC, edadC, dniC, nombreC);
        this.cargo = cargoC;
    }

    @Override
    public String toString() {
        String textoEmpleado = "";
        textoEmpleado += "-nombre:" + this.nombre;
        textoEmpleado += "-dni:" + this.dni;
        textoEmpleado += "-cargo:" + this.cargo;
        textoEmpleado += "-antiguedad:" + this.antiguedad;
        textoEmpleado += "-edad:" + this.edad;

        return textoEmpleado;

    }
}
