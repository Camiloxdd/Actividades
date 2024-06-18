/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author juang
 */
public class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    
    public Material (String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAñoPublicacion (){
        return añoPublicacion;
    }
    
    public void mostrarInformacion(){
        System.out.println("Titulo" + titulo);
        System.out.println("Autor" + autor);
        System.out.println("Año de publicacion" + añoPublicacion);
    }
}
