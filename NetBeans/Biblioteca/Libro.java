/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author juang
 */
public class Libro extends Material {
    private String genero;
    
    public Libro(String titulo,String autor,int añoPublicacion,String genero){
        super(titulo, autor, añoPublicacion);
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Genero: " + genero);
    }
}
