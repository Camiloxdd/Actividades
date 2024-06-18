/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author juang
 */
public class clase2 {
    public static void main (String[] args){
        clase1 objeto1 = new clase1();
        
        objeto1.setEdad(17);
        System.out.println("La edad es: " + objeto1.getEdad() );
        
        objeto1.setNombre("Felipe");
        System.out.println("Mi nombre es: " + objeto1.getNombre());
    }
}