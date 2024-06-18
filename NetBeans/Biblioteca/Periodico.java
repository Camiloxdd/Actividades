/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author juang
 */
public class Periodico extends Material {
    private String fecha;
    
    public Periodico(String titulo,String autor,int añoPublicacion, String fecha){
        super(titulo, autor, añoPublicacion);
        this.fecha = fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Fecha: " + fecha);
    }
}

