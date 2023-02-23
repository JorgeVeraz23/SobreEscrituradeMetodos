/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocarrera;

/**
 *
 * @author USER
 */
public class Persona extends Animal{
    
    //override para sobrescribir el metodo comer
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
