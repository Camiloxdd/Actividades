/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author juang
 */
public class Revista extends Material {
    private int numeroEdicion;
    
    public Revista(String titulo,String autor,int añoPublicacion, int numeroEdicion){
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    public int getNumeroEdicion(){
        return numeroEdicion;
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de edicion: " + numeroEdicion);
    }
}
