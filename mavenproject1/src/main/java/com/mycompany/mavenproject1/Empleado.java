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
public class Empleado {
    
    public String antiguedad;
    public String edad;
    public String dni;
    public String nombre;
    
    
    public Empleado(String antiguedadC, String edadC, String dniC, String nombreC){
        this.nombre = nombreC;
        this.edad = edadC;
        this.dni = dniC;
        this.antiguedad = antiguedadC;
                
      
  } 
    
    public String toString(){
  
      String textoEmpleado = "nombre:" + this.nombre + ", edad:" + this.edad + this.dni + ", dni:" +this.antiguedad + ",antiguedad:";
      return textoEmpleado;
      
  }     
}
