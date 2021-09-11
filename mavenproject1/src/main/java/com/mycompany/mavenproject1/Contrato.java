/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Contrato {

    public Empleado empleados[]; //atributo
    public int contador = 0;

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.procesarComando();
    }

    public Contrato() {
        this.empleados = new Empleado[20];

    }

    public void procesarComando() {

        System.out.println("Primer paso");

        System.out.println("Introduzca la opción 1(Agregar) 2(Listar) o 3(Salir):");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner

        if (entradaTeclado.equals("1")) {

            System.out.println("La opción es: \"" + entradaTeclado + "\"");

            this.agregarEmpleado();
        }

        if (entradaTeclado.equals("2")) {

            System.out.println("La opción es: \"" + entradaTeclado + "\"");

            this.listarEmpleados();
        }

        if (entradaTeclado.equals("3")) {

            System.out.println("La opción es: \"" + entradaTeclado + "\"");

            this.salir();
        }
    }

    public void listado() {
    }

    public void agregarEmpleado() {

        System.out.println("Añadir empleado");

        String textoEmpleado = "";

        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner

        textoEmpleado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner

        System.out.println("El texto empleado:" + textoEmpleado);

        String[] arrayTextoEmpleado = textoEmpleado.split("&");

        System.out.println("El texto empleado en su pos 0:" + arrayTextoEmpleado[0]);

        System.out.println("El texto empleado en su pos 1:" + arrayTextoEmpleado[1]);

        System.out.println("El texto empleado en su pos 2:" + arrayTextoEmpleado[2]);

        System.out.println("El texto empleado en su pos 3:" + arrayTextoEmpleado[3]);

        System.out.println("El texto empleado en su pos 4:" + arrayTextoEmpleado[4]);

        System.out.println("El texto empleado en su pos 5:" + arrayTextoEmpleado[5]);

        if (arrayTextoEmpleado[1].equals("Local")) {

            Local empleadoLocal = new Local(arrayTextoEmpleado[3], arrayTextoEmpleado[2], arrayTextoEmpleado[4], arrayTextoEmpleado[2], arrayTextoEmpleado[5]);

            System.out.println(empleadoLocal.toString());
            this.empleados[this.contador] = empleadoLocal;
            contador++;

        }
        if (arrayTextoEmpleado[1].equals("Bodega")) {

            Bodega empleadoBodega = new Bodega(arrayTextoEmpleado[3], arrayTextoEmpleado[2], arrayTextoEmpleado[4], arrayTextoEmpleado[2], arrayTextoEmpleado[5]);

            System.out.println(empleadoBodega.toString());

            this.empleados[this.contador] = empleadoBodega;
            contador++;
        }
        this.procesarComando();
    }

    public void listarEmpleados() {
        System.out.println("***Contrato de Empleados***");

        for (int i = 0; i < empleados.length; i++) {
            Empleado empleado = empleados[i];
            if (empleado != null) {
                if (empleado instanceof Bodega) {
                    System.out.println("\tEmpleado Bodega - DNI: " + empleado.dni);
                }
                if (empleado instanceof Local) {
                    System.out.println("\tEmpleado Local - DNI: " + empleado.dni);
                }
                System.out.println("\tAntiguedad :  " + empleado.antiguedad);
                System.out.println("\tEdad :  " + empleado.edad);
                if (empleado instanceof Bodega) {
                    Bodega empleadoBodega = (Bodega) empleado;
                    System.out.println("\tUbicacion: " + empleadoBodega.ubicacion);
                }
                if (empleado instanceof Local) {
                    Local empleadoLocal = (Local) empleado;
                    System.out.println("\tCargo: " + empleadoLocal.cargo);
                }
            }
        }
        this.procesarComando();
    }

    public void salir() {

        System.out.println("Ha salido: ");

    }

    public void procesarComandos() {
    }
}
