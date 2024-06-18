/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author juang
 */
public class Main {
    public static void main (String[] args){
        Libro libro = new Libro ("100 años de soledad" , "George Orwell" , 1949 , "Distopia");
        Revista revista = new Revista ("National Geographic" , "Varios autores" , 2021 , 1);
        Periodico periodico= new Periodico ("The new York Times" , "Varios autores" , 2023 , "28 de mayo");
        
        
        System.out.println("Informacion del libro: ");
        libro.mostrarInformacion();
        
        System.out.println("\nInformacion de la revista: ");
        revista.mostrarInformacion();
        
        System.out.println("\nInformacion del periodico: ");
        periodico.mostrarInformacion();
        
    }
    
}
